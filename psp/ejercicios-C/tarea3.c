#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <string.h>

void manejador(int segnal){
	
	switch(segnal){
		case SIGINT:
			printf("Soy el padre, he generado un hijo, un nieto, ellos \n han creado otros procesos, yo me he esperado hasta el final, se \n han muerto y aquí sigo yo. Saludos \n");
		break;
		case SIGUSR1:
			printf("-------------Menu----------- \n");
			printf("Pulse 1 para generar un nietp \n");
			printf("Pulse 2 para enviar señal a p1 \n");
		break;
		case SIGUSR2:
			printf("-------------Menu----------- \n");
			printf("Pulse 1 para generar p4 \n");
			printf("Pulse 2 para enviar señal a p2 \n");
		break;
	}
}

int main(){

	pid_t pid1,pid2,pid3;
	pid1=getpid();
	pid2=fork();
	switch(pid2){
		case -1:
			printf("Error");
		break;
		case 0:
			pid3=fork();
			switch(pid3){
				case -1:
					printf("Error");
				break;
				case 0:
					int op1=0;
					signal(SIGUSR2, manejador);
					do{
						scanf("%d",op1);
						if(op1==1){
							pid_t pid4;
							switch(pid4){
								case -1:
									printf("Error");
								break;
								case 0:
									printf("Proceso p4 %d y mi padre es %d \n",getpid(),getppid());
									fflush(stdout);
								break;
								default:
							}
						}else if(op1==2){
							kill(pid3, SIGUSR2);
						}
					}while(op1!=2);
					
					
				break;
				default:
					int status;
					waitpid(pid3,&status,0);
					int op2=0;
	
					do{
						scanf("%d",op2);
						if(op1==1){
							pid_t pid5;
							switch(pid5){
								case -1:
									printf("Error");
								break;
								case 0:
									printf("Proceso p5 %d y mi padre es %d \n",getpid(),getppid());
									fflush(stdout);
									pid_t pid6;
									switch(pid6){
										case -1:
											printf("Error");
										break;
										case 0:
											printf("Proceso p6 %d y mi padre es %d 												\n",getpid(),getppid());
											fflush(stdout);
										break;
										default:
									}
								break;
								default:
							}
						}else if(op1==2){
							kill(pid2, SIGUSR1);
						}
					}while(op2!=2);
			}
			
		break;
		default:
			int status;
			waitpid(pid2,&status,0);
			signal( SIGINT, manejador);
			pause();

	}

return 0;
}
