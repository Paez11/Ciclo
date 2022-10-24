#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

int main(){
		
	pid_t pid1,pid2;
	char nieto[20];
	char comando[100]="mkdir ~/";
	
	pid1=fork();
	if(pid1==-1){
		printf("fallo en fork \n");
	}
	else if(pid1==0){
		pid2=fork();
		if(pid2==-1){
			printf("fallo en fork \n");
		}
		else if(pid2==0){
			printf("Proceso nieto %d y mi padre es %d 						\n", getpid(),getppid());
			printf("Escribe el nombre del directorio: ");
			scanf("%s",nieto);
			strcat(comando, nieto);
			//execl("/bin/mkdir2","mkdir",comando,(char*)NULL);
			system(comando);
			exit(0);
		}
		else{
			wait(NULL);
			system("ls ~/");
			printf("Proceso hijo %d y mi padre es %d \n", getpid(), 				getppid());
		}
		exit(0);
	}
	else{
		wait(NULL);
	}

	return 0;
}
