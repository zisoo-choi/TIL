#include <stdio.h>
int main(){
	int c=0, i=0, j=0;
	scanf_s("%d", &c);
	
	int n=0, grade[1000];
	double average[100];
	
	for(i=0; i<c; i++){
	 	scanf_s("%d", &n);
	 	
	 	for(j=0; j<n; j++){
	 		scanf_s("%d", &grade[j]);
	 		average[i] += (double)grade[j];
		}
		average[i] = average[i]/(double)n;
		
		int cnt=0;
		for(j=0; j<n; j++){
	 		if(average[i] < grade[j]) cnt++;
		}
		printf("%.3lf%%\n", (double)cnt*100/n);
	}
	return 0;
}
