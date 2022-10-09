#include <stdio.h>
#include <string.h>
int main(){
	int c=0, i=0, j=0, k=0;
	scanf_s("%d", &c);
	
	int n=0, grade[100];
	
	for(i=0; i<c; i++){
		double average=0;
	 	scanf_s("%d", &n);
	 	
	 	for(j=0; j<n; j++){
	 		scanf_s("%d", &grade[j]);
	 		
	 		average += (double)grade[j];
			
		 }printf("average = %.2lf%%\n", average/(double)n);
	 }
	return 0;
}
