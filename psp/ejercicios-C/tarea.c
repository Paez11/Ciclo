#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

void main(){

	pid_t pidh1,pidn1,pidh2,pidn2;
	char comandoNieto1[100]="mkdir ~/nieto1";
	char comandoNieto2[100]="mkdir ~/nieto2";
	
	pidh1=fork();
	if(pidh1==-1){
		printf("fallo en fork \n");
	}
	else if(pidh1==0){
		pidn1=fork();
		
		if(pidn1==-1){
			printf("fallo en fork \n");
		}
		else if(pidn1==0){
			printf("Proceso nieto 1 %d y mi padre es %d,acabo de crear el directorio nieto1\n",getpid(),getppid());
			fflush(stdout);
			system(comandoNieto1);
			exit(0);
		}
		else{
			wait(NULL);
			printf("Proceso hijo 1 %d y mi padre es %d \n", getpid(),getppid());
			fflush(stdout);
			system("ls ~/");
		}
		exit(0);
	}
	else{
		wait(NULL);
	}
	pidh2=fork();
	if(pidh2==-1){
		printf("fallo en fork \n");
	}
	else if(pidh2==0){
		pidn2=fork();
		
		if(pidn2==-1){
			printf("fallo en fork \n");
		}
		else if(pidn2==0){
			printf("Proceso nieto 2 %d y mi padre es %d,acabo de crear el directorio nieto2\n",getpid(),getppid());
			fflush(stdout);
			system(comandoNieto2);
			exit(0);
		}
		else{
			int status;
			waitpid(pidn2,&status,0);
			printf("Proceso hijo 2 %d y mi padre es %d \n", getpid(),getppid());
			fflush(stdout);
			system("ls ~/");
		}
		exit(0);
	}
	else{
		int status;
		waitpid(pidh2,&status,0);
	}
}
