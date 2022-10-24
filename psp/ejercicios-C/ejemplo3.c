#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
void main(){
	
	printf("Ejemplo exec():");
	printf("Los archivos del directorio son:");
	//execl("/bin/ls","ls","-l",(char *)NULL);
	system("ls -l");
	printf("¡¡¡ Esto no se ejecuta !!!");
}
