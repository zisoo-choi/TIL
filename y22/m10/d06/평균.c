#include <stdio.h>
int main(){
	int n=0, i=0, max=0;
	int grade[1000];
	
	scanf_s("%d", &n); //시험 본 과목의 개수 N 
	
	for(i=0; i<n; i++){
		scanf_s("%d", &grade[i]); //현재 성적 grade 
		
		if(max < grade[i]){ 
			max = grade[i]; //성적 중 최고점
		}
	}
	
	double average=0;
	
	for(i=0; i<n; i++){
		average+= (double)grade[i]/(double)max*100; //점수/최고점*100 
	}
	
	printf("%.2lf", average/n);
	
	return 0;
}
