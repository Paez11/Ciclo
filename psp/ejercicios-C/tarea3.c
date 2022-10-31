#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <string.h>

//Manejador para administrar las señales
void manejador(int segnal){
	
	switch(segnal){
		case SIGUSR1:
			printf("\n -------------Menu----------- \n");
			printf("Pulse 1 para generar un hijo \n");
			printf("Pulse 2 para enviar señal a p2 \n");
			printf("\n");
		break;
		case SIGUSR2:
			printf("\n -------------SubMenu----------- \n");
			printf("Pulse 1 para generar un hijo y un nieto \n");
			printf("Pulse 2 para enviar señal a p1 \n");
			printf("\n");
		break;
		case SIGTERM:
			printf("Soy el padre, he generado un hijo, un nieto, ellos \n han creado otros procesos, yo me he esperado hasta el final, se \n han muerto y aquí sigo yo. Saludos \n");
			exit(0);
		break;
	}
}

//crea un hijo
void creaHijo(pid_t pid){
	pid=fork();
	switch(pid){
		case -1:
			printf("Error");
		break;
		case 0:
			printf("Proceso p4 %d y mi padre es %d \n",getpid(),getppid());
			fflush(stdout);
			exit(0);
		break;
		default:
		break;
	}
}

//crea un hijo y un nieto
void creaNieto(pid_t pid1,pid_t pid2){
	pid1=fork();
	switch(pid1){
		case -1:
		printf("Error");
		break;
		case 0:
			printf("Proceso p5 %d y mi padre es %d \n",getpid(),getppid());
			fflush(stdout);
			pid2=fork();
			switch(pid2){
				case -1:
				printf("Error");
				break;
				case 0:
					printf("Proceso p6 %d y mi padre es %d \n",getpid(),getppid());
					fflush(stdout);
					exit(0);
				break;
				default:
					wait(NULL);
					exit(0);
				break;
			}
		break;
		default:
			wait(NULL);
		break;
	}
}

int main(){

	pid_t pid1,pid2,pid3;
	int op1,op2=0;
	int status;
	pid1=getpid();
	pid2=fork();
	switch(pid2){
		case -1:
			printf("Error");
		break;
		case 0:
			pid3=fork(); //creo un hijo el proceso 3
			switch(pid3){
				case -1:
					printf("Error");
				break;
				case 0:
					manejador(SIGUSR1);
					do{	
						//sleep(1);			//bucle que crea al hijo o envia señal
						scanf("%d",&op1);
						if(op1==1){
							pid_t pid4;
							creaHijo(pid4);
							manejador(SIGUSR1);
						}else if(op1==2){
							kill(getppid(), SIGUSR2); //envio señal a p2
							exit(0);
						}else{
							printf("opcion no valida");
						}
					}while(op1!=2);
					
					
				break;
				default:
					//espero señal de p3
					
					signal(SIGUSR2, manejador);
					pause();
					do{		
								//bucle que crea al hijo y al nieto o envia señal
						scanf("%d",&op2);
						if(op2==1){
							pid_t pid5,pid6;
							creaNieto(pid5,pid6);
							manejador(SIGUSR2);
						}else if(op2==2){
							kill(getppid(), SIGTERM);	//envia señal a p1
							exit(0);
						}else{
							printf("opcion no valida");
						}
					}while(op2!=2);
				break;
			}
			
		break;
		default:
			//espero señal de p2
			signal( SIGTERM, manejador);
			pause();
		break;
	}

return 0;
}
