#include <unistd.h>
#include <stdio.h>
#include <signal.h>

void manejador (int sig){
	printf("Numero de señal %d",sig);
}

int main(void){

	sig(SIGIO,manejador);
	while(1){
		printf("probando...\n");
		sleep(2);
	}
	return 0;
}
