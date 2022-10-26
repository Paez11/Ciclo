/*
*Programar comando cat ejemplo.txt | wc -l
*existe ejemplo.txt
*/
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>

void main(){
	int fd[2];
	pid_t pidh1,pidh2;


	pipe(fd);
	
	pidh1=fork();
	
	if(pidh1==-1){
		printf("fallo en fork \n");
	}
	else if(pidh1==0){

		close(fd[0]);
		dup2(fd[1],STDOUT_FILENO);
		close(fd[1]);
		execlp("/bin/cat","cat","ejemplo.txt",NULL); 
	}
	else{	
		pidh2=fork();
		
		if(pidh2==-1){
			printf("fallo en fork \n");
		}
		else if(pidh2==0){

			close(fd[1]);
			dup2(fd[0],STDIN_FILENO);
			close(fd[0]);
			execlp("/bin/wc","wc","-l",NULL);
		}
	}
}
