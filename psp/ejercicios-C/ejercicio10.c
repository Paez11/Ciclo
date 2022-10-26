/**
Diseñar un programa que trate la señal SIGINT (CTRL-C) y la señal SIGTSTP (CTRL-Z) y se quede a la espera por una señal
(con un bucle infinito). Cada vez que reciba la señal SIGINT debe abrir para añadir en el fichero señales.txt, y escribir su
número de proceso y el número de señal Recibida. Terminar el proceso cuando se envíe SIGTSTP, mostrando antes un mensaje que
diga "El proceso xxx ha finalizado su ejecución"
**/
#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <string.h>

void manejador(int segnal){
	FILE *fich;
	if(segnal==SIGINT){
		fich = fopen("señales.txt","a");
		fprintf(fich,"Proceso %d Numero de la señal %d \n",getpid(),segnal);
		fclose(fich);
		//crear_fichero(segnal);
	}else if(segnal==SIGTSTP){
		printf("Proceso %d finalizado \n",getpid());
		exit(0);
	}
}

/*
struct t_reg{
	int num;
	char chad[10];
	char car;
};

int crear_fichero(int segnal){
	FILE *fich;
	int i,er_dev = 0;
	struct t_reg r;
	
	if((fich = fopen("señales.txt","a")) == NULL){
		printf("Error en apertura del fichero para escritura \n");
		er_dev=1;
	}
	else{
		fich = fopen("señales.txt","a");
		printf("El proceso %d ha finalizado",getpid());
	}
	return er_dev;
}
*/

int main(){
	
	signal( SIGINT, manejador);
	signal( SIGTSTP, manejador);
	while(1){
		//sleep(1);
		pause();
	}
	
	return 0;	
}
