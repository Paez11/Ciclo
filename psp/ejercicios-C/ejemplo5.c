#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

int main(){
	int fd[2];
	int fd_file[2];
	pid_t pid;
	
	pipe(fd);
	
	pid=fork();
	
	if(pid==-1){
		printf("fallo en fork \n");		
	}else if(pid==0){
		close(fd[0]);
		dup2(fd[1],STDOUT_FILENO);
		close(fd[1]);
		execlp("/bin/ls","ls","-l",NULL); //con esto escribo en el file descriptor de la salida estandar de linux (STDOUT)	
	}else{
		fd_file = open("pruebaEjemlo5.txt", O_WRONLY);
		close(fd[1]);
		dup2(fd[0],STDOUT_FILENO);		
		close(fd[0]);
		dup2(fd_file,STDIN_FILENO);
		execlp("/bin/grep","grep","Pipe",NULL);		
	}
}
