/**
Desarrolla un programa en C, que cree un proceso hijo y un proceso nieto. El proceso hijo debe escribir al padre el mensaje: "Hola papá,¿Hablamos?". El proceso nieto debe escribir al abuelo el mensaje: "hola abuelo, ¿Cómo estás?". El proceso padre debe leer los dos mensajes.
**/
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

void main(){
	int fdh[2],fdn[2];
	pid_t pidh,pidn;
	char buffer[100];
	char stringh[]="Hola papa,¿Hablamos?";
	char stringn[]="Hola abuelo,¿Como estas?";
	
	pipe(fdh);
	pipe(fdn);
	pidh=fork();
	if(pidh==-1){
		printf("fallo en fork \n");
	}
	else if(pidh==0){
		pidn=fork();
		if(pidn==-1){
			printf("fallo en fork \n");
		}
		else if(pidn==0){
			wait(NULL);
			write(fdh[1],stringn,sizeof(stringn));
			printf("Proceso nieto  %d \n",getpid());
			fflush(stdout);
			printf("%s \n",stringn);
		}
		else{
			write(fdh[1],stringh,sizeof(stringh));
			printf("Proceso hijo %d \n", getpid());
			fflush(stdout);
			printf("%s \n",stringh);
		}
	}
	else{
		wait(NULL);
		close(fdh[1]);
		read(fdh[0],buffer,sizeof(buffer));
		printf("mi hijo me ha dicho: %s \n",buffer);
		close(fdh[0]);
		close(fdn[1]);
		read(fdn[0],buffer,sizeof(buffer));
		printf("mi nieto me ha dicho: %s \n",buffer);
		close(fdn[0]);
		
	}
	
	
}
