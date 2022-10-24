#include <unistd.h>
#include <stdio.h>

void main(int argc,char*argv[]){

	printf("Hola %s", argv[0]);
	printf("Proceso %d",getppid());
	
}
