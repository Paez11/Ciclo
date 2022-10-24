#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

void main(int argc, char *argv[]){
	printf("Nombre %s, proceso: %d", argv[0], getpid());
	system("./ej2");
	//execv("./ejercicios-C","./ej2.c",(char *)NULL);
}
