#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>

int main(int argc, char *argv[]){

	pid_t pid;
	pid=fork();
	printf("Hola soy %d y mi padre es: PID %d \n", getpid(), getppid());
	switch (pid){
		case -1:
			printf("fallo en fork");
			break;
		case 0:
			printf("Proceso hijo : PID %d \n", getpid());
			break;
		default:
			pid=wait(NULL);
			printf("Proceso padre: PID %d \n", getpid());
			break;
	}
	return 0;
}
