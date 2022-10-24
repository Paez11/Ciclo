#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(){
		
	pid_t pid;
	
	for(int i=0;i<6;i++){
		pid=fork();
		if(pid==-1){
			printf("fallo en fork \n");
		}
		else if(pid==0){
			printf("Proceso hijo %d y mi padre es %d \n", getpid(), 				getppid());
			exit(0);
		}
		else{
			wait(NULL);
		}
	}

	return 0;
}
