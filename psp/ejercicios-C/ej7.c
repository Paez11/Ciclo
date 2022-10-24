#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(){
		
	pid_t pid1,pid2;
	
	for(int i=0;i<3;i++){
		pid1=fork();
		if(pid1==-1){
			printf("fallo en fork \n");
		}
		else if(pid1==0){
			printf("Proceso hijo %d y mi padre es %d \n", getpid(), 				getppid());
			pid2=fork();
			if(pid2==-1){
				printf("fallo en fork \n");
			}
			else if(pid2==0){
				printf("Proceso nieto %d y mi padre es %d 						\n", getpid(),getppid());
				exit(0);
			}
			else{
				wait(NULL);
			}
			exit(0);
		}
		else{
			wait(NULL);
		}
	}

	return 0;
}
