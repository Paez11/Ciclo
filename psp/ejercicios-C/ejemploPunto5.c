#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>

//definimos las funciones que vamos a utilizar
//en C, una opción es definirlas antes del main
//manejador para el padre

void gestion_padre(int segnal){
	printf("Soy el padre y he recibido esta señal...%d\n", segnal);
}

//manejador para el hijo
void gestion_hijo(int segnal){
	printf("Soy el hijo y he recibido esta señal...%d\n", segnal);
}

int main(){
	pid_t pid_hijo, pid_padre;
	pid_padre=getpid();
	pid_hijo=fork(); //creamos el hijo
	switch(pid_hijo){
		case -1:
			printf("Error");
		break;
		case 0: //hijo
			//Activamos la escucha por si recibimos una señal
			signal( SIGUSR1, gestion_hijo);
			//Mientras el hijo sigue ejecutando
			//En este caso en un bucle infinito
			while(1){
				sleep(1);
				//envío una señal al padre
				kill(pid_padre, SIGUSR1);
				//al usar pause, no continuo hasta yo recibir una señal
				pause();
			}
		break;
		default:
			//Estamos en el padre
			//Activamos la escucha por si recibimos una señal
			signal( SIGUSR1, gestion_padre);
			//Mientras el padre sigue ejecutando
			//En este caso en un bucle infinito
			while(1){
				pause(); //espero recibir una señal del hijo
				// después espero un segundo
				//y envío una señal al hijo
				sleep(1);
				kill(pid_hijo, SIGUSR1);
			}
		break;
	}//fin del switch
	return 0;
}//fin del main
