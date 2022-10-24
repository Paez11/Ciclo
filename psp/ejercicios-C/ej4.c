#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(){

	pid_t pid;
	pid=fork();
	int variable=6;
	printf("variable %d \n",variable);
	/*
	switch (pid){
		case -1:
			printf("fallo en fork");
			break;
		case 0:
			variable--;
			printf("%d",variable);
			printf("Proceso hijo : PID %d \n", getpid());
			break;
		default:
			pid=wait(NULL);
			variable++;
			printf("%d",variable);
			printf("Proceso padre: PID %d \n", getpid());
			break;
	}
	*/
	if(pid==-1){
		printf("fallo en fork");
	}
	else if(pid==0){
		variable--;
		printf("\n %d",variable);
		printf("Proceso hijo : PID %d \n", getpid());
	}
	else{
		variable++;
		printf("\n %d",variable);
		printf("Proceso padre : PID %d \n", getpid());
	}
	
	return 0;
}
