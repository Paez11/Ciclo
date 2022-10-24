#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(){

	pid_t pid1,pid2,pid3;
	
	pid1=fork();
	if(pid1==-1){
		printf("fallo en fork \n");
	}
	else if(pid1==0){
		wait(NULL);
		printf("Proceso hijo %d y mi padre es %d \n", getpid(), getppid());
	}
	else{
		wait(NULL);
		pid2=fork();
		if(pid2==-1){
			printf("fallo en fork \n");
		}
		else if(pid2==0){
			wait(NULL);
			printf("Proceso hijo %d y mi padre es %d \n", getpid(), 				getppid());
		}
		else{
			wait(NULL);
			pid3=fork();
			if(pid3==-1){
				printf("fallo en fork \n");
			}
			else if(pid3==0){
				wait(NULL);
				printf("Proceso hijo %d y mi padre es %d \n", 					getpid(), getppid());
			}
			else{
				wait(NULL);
				pid3=fork();
			}
		}
	}
	
	
	return 0;
}
