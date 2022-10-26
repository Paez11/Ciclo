/*
Comunicar 3 procesos hijos (P1, P2 Y P3, son hermanos entre ellos), usando
dos pipes, de manera que:
-P1 envia a P2 ls -l
-P2 recoge el mensaje y usando grep e selecciona lineas que contengan e, enviando
a P3
P3 recoge P2 y aplica wc
*/
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>

void main(){
	int fd[2],fd2[2];
	pid_t pidh1,pidh2,pidh3;


	pipe(fd);
	pipe(fd2);
	
	pidh1=fork();
	
	if(pidh1==-1){
		printf("fallo en fork \n");
	}
	else if(pidh1==0){

		close(fd[0]);
		dup2(fd[1],STDOUT_FILENO);
		close(fd[1]);
		execlp("/bin/ls","ls","-l",NULL);
		//printf("Proceso hijo %d \n", getpid());
	}
	else{	
		//printf("Proceso padre %d \n", getpid());
		close(fd[1]);
		pidh2=fork();
		
		if(pidh2==-1){
			printf("fallo en fork \n");
		}
		else if(pidh2==0){
			
			close(fd[1]);
			close(fd2[0]);
			
			dup2(fd[0],STDIN_FILENO);
			close(fd[0]);
			//execlp("/bin/grep","grep","Pipe",NULL);
			//execlp("/bin/wc","wc","-l",NULL);
			
			dup2(fd2[1],STDOUT_FILENO);
			close(fd2[1]);
			execlp("/bin/grep","grep","e",NULL);
			//printf("Proceso hijo %d \n", getpid());
			
		}else{
			//printf("Proceso padre %d \n", getpid());
			close(fd2[1]);
			pidh3=fork();
			if(pidh3==-1){
				printf("fallo en fork \n");
			}
			else if(pidh3==0){
			
				//wait(NULL);
				//printf("Proceso hijo %d \n", getpid());
				close(fd2[1]);
				dup2(fd2[0],STDIN_FILENO);
				close(fd2[0]);
				execlp("/bin/wc","wc","-l",NULL);
				//exit(0);
			}
		}
	}
}
