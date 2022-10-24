/**
Hacer un programa que trabaje con dos procesos
el proceso original tendrá un array de enteros
El proceso hijo suma la 1º mitad de los numeros
El proceso padre suma la 2º mitad de los numeros
Cada uno mostrara la suma
**/

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

void main(){
	int fd[2];
	pid_t pidh;
	int numeros[]={2,4,1,5,7,4,3,6};
	int numerosSize = sizeof(numeros)/sizeof(int);
	int inicio,fin,sumatotal;
	int suma1 = 0;
	int suma2 = 0;
	pipe(fd);
	pidh=fork();
	if(pidh==-1){
		printf("fallo en el fork \n");
		exit(-1);
	}else if(pidh==0){
		close(fd[0]);
		printf("Proceso hijo : PID %d \n", getpid());
		fflush(stdout);
		inicio=0;
		fin=numerosSize/2;
		for(int i=inicio; i<fin ; i++){
			suma1 += numeros[i];
		}
		printf("suma parcial = %d \n", suma1);
		write(fd[1],&suma1,10);
		close(fd[1]);
		
		
	}else{
		//wait(NULL);
		close(fd[1]);
		read(fd[0],&suma1,10);
		inicio=numerosSize/2;
		fin=numerosSize;
		for(int i=inicio; i<fin ; i++){
			suma2 += numeros[i];
		}
		printf("Proceso padre : PID %d \n", getpid());
		fflush(stdout);
		printf("suma parcial = %d \n", suma2);
		close(fd[0]);
		sumatotal=suma1+suma2;
		printf("suma total = %d \n", sumatotal);
	}
}
