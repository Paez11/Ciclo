/**
Crear un proceso que genere dos hijos.
El padre mandará al primer hijo una cadena cualquiera.
El primer hijo concatenará a la cadena que el padre le ha enviado otra cadena, y le enviará el resultado a su hermano (segundo hijo).
El segundo hijo de nuevo concatenará otra cadena, y enviará el resultado total al padre.
El padre mostrará por pantalla el mensaje final.
**/

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

void main(){
	int fdh1[2],fdh2[2],fdp[2];
	pid_t pidh1,pidh2;
	char buffer[100];
	char mensaje[]="hola hijo1";
	char mensaje2[]=", hola hermano";
	char mensaje3[]=", hola papa";

	pipe(fdh1);
	pipe(fdh2);
	pipe(fdp);
	
	pidh1=fork();
	
	if(pidh1==-1){
		printf("fallo en fork \n");
	}
	else if(pidh1==0){
		read(fdp[0],buffer,sizeof(buffer));
		printf("Proceso hijo %d \n", getpid());
		fflush(stdout);
		printf("mi padre me ha dicho: %s \n",buffer);
		close(fdp[1]);
		close(fdp[0]);
		strcat(mensaje, mensaje2);
		write(fdh1[1],mensaje,100);
	}
	else{	
		write(fdp[1],mensaje,sizeof(mensaje));
		printf("Proceso padre %d \n", getpid());
		fflush(stdout);
		printf("%s \n",mensaje);
	}

	pidh2=fork();
	
	if(pidh2==-1){
		printf("fallo en fork \n");
	}
	else if(pidh2==0){
		read(fdh1[0],buffer,sizeof(buffer));
		printf("Proceso hijo %d \n", getpid());
		fflush(stdout);
		printf("mi hermano me ha dicho: %s \n",buffer);
		close(fdh1[1]);
		close(fdh1[0]);
		strcat(buffer, mensaje3);
		write(fdh2[1],buffer,100);
	}
	else{
		int status;
		waitpid(pidh2,&status,0);
		read(fdh2[0],buffer,sizeof(buffer));
		printf("Proceso padre %d \n", getpid());
		fflush(stdout);
		printf("mi hijo 2 me ha dicho: %s \n",buffer);
		close(fdh2[1]);
		close(fdh2[0]);
	}
}
