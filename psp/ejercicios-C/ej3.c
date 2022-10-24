#include<stdio.h>
#include<stdlib.h>

int main(){
	
	printf("Creando fichero....\n");
	system("ls ~/ejercicios-C>f1.txt");
	printf("El contenido del escritorio es: ");
	system("gedit f1.txt");
		
	return 0;
}
