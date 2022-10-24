#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(){

	pid_t pid;
	pid=fork();
	int a1, a2, a3;
	printf("Introduce dos variables:");
	scanf("%d %d",&a1,&a2);
	printf("variables %d %d \n",a1,a2);

	if(pid==-1){
		printf("fallo en fork");
	}
	else if(pid==0){
		a3=a1-a2;
		printf("\n %d",a3);
		printf("Proceso hijo : PID %d \n", getpid());
	}
	else{
		pid=wait(NULL);
		a3=a1+a2;
		printf("\n %d",a3);
		printf("Proceso padre : PID %d \n", getpid());
	}
	
	return 0;
}
