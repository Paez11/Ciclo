/**
Proceso padre
	-crea un hijo
	-el hijo envia frase al padre
	-el padre lee la frase y la escribe por pantalla
**/


#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

void main(){
	int fd[2];
	pid_t pidh;
	char buffer[100];
	
	pipe(fd);
	pidh=fork();
	if(pidh==-1){
		printf("fallo en el fork \n");
		exit(-1);
	}else if(pidh==0){
		close(fd[0]);
		printf("Proceso hijo : PID %d \n", getpid());
		fflush(stdout);
		getchar();
		write(fd[1],buffer,sizeof(buffer));
		close(fd[1]);
		
		
	}else{
		//wait(NULL);
		//printf("Proceso padre : PID %d \n", getpid());
		//fflush(stdout);
		close(fd[1]);
		read(fd[0],buffer,sizeof(buffer));
		printf("Proceso padre : PID %d \n", getpid());
		fflush(stdout);
		close(fd[0]);
		printf("Mensaje enviado: %s \n", buffer);
	}
	
}
