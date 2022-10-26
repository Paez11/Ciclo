/**
Realice un programa en C que, ante las siguientes señales, responda de la siguiente manera:
Al recibir una señal SIGUSR1 muestre el mensaje “Soy el proceso (pid que corresponda) y he recibido la señal SIGUSR1”
Al recibir una señal SIGUSR2 muestre el mensaje “Soy el proceso (pid que corresponda) y he recibido la señal SIGUSR2”
Al recibir una señal SIGTERM muestre el mensaje “Soy el proceso (pid que corresponda) y he terminado mi ejecución” y termine su ejecución.

Para probar lo anterior el programa generará dos hijos, y las tareas de cada uno se detallan a continuación:
  - hijo 1 espera la señal SIGUSR1
  - hijo 2: 
espera la señal SIGUSR2
después genera un bucle infinito mostrando un mensaje diciendo su pid
  - padre: 
tras 3 segundos de ejecución envía señal SIGUSR1 a hijo1,
después de otros 3 segundos envía señal SIGUSR2 a hijo2
después de otros 3 segundos manda señal SIGTERM a hijo2

**/

#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <string.h>


void gestion_padre(int segnal){
	printf("Soy el padre %d y he recibido esta señal...%d\n",getpid(), segnal);
}

//manejador para el hijo
void manejador(int segnal){
	switch(segnal){
		case SIGUSR1:
			printf("Soy el hijo %d y he recibido esta señal...%d\n",getpid(), segnal);
		break;
		case SIGUSR2:
			printf("Soy el hijo %d y he recibido esta señal...%d\n",getpid(), segnal);
		break;
		case SIGTERM:
			printf("Soy %d y he recibido esta señal...%d\n",getpid(), segnal);
			exit(0);
	}
}

int main(){
	pid_t pidh1,pidh2;

	pidh1=fork(); 
	switch(pidh1){
		case -1:
			printf("Error");
		break;
		case 0: 
			pause();
			signal( SIGUSR1, manejador);
			pause();
		break;
		default:
			pidh2=fork();
			switch(pidh2){
				case -1:
					printf("Error");
				break;
				case 0: 
					signal( SIGUSR2, manejador);
					signal( SIGTERM, manejador);
					//sleep(1);
					pause();
					while(1){
						printf("Proceso hijo %d \n", getpid());
						sleep(1);
					}
				break;
				default:
					sleep(3);
					kill(pidh1, SIGUSR1);
					sleep(3);
					kill(pidh2, SIGUSR2);
					sleep(3);
					kill(pidh2, SIGTERM);
					signal( SIGTERM, gestion_padre);
				break;
			}
		break;
	}
	return 0;
}
