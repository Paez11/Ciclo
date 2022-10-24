/**
El padre envia un "hola hijo" al proceso hijo y
el hijo imprime el mensaje del padre y responde
luego. el padre imprime la respuesta del hijo
**/

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

void main(){
	int fd[2];
	char buffer1[]="hola hijo";
	char buffer2[]="hola papa";
	pid_t pidh;

	pipe(fd);
	pidh=fork();
	if(pidh==-1){
		printf("fallo en el fork \n");
		exit(-1);
	}else if(pidh==0){
		//wait(NULL);
		printf("Proceso hijo : PID %d \n", getpid());
		fflush(stdout);
		read(fd[0],buffer1,sizeof(buffer1));
		printf("mi padre me ha dicho %s \n", buffer1);
		close(fd[0]);
		write(fd[1],buffer2,sizeof(buffer2));
		printf("%s \n",buffer2);
		
		
	}else{
		write(fd[1],buffer1,sizeof(buffer1));
		printf("Proceso padre : PID %d \n", getpid());
		printf("%s \n",buffer1);
		fflush(stdout);
		wait(NULL);
		printf("Proceso padre : PID %d \n", getpid());
		read(fd[0],buffer2,sizeof(buffer2));
		printf("Mi hijo me ha respondido %s \n", buffer2);
		close(fd[0]);
		close(fd[1]);
	}
}
