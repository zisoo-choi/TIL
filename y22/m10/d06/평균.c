#include <stdio.h>
int main(){
	int n=0, i=0, max=0;
	int grade[1000];
	
	scanf_s("%d", &n); //���� �� ������ ���� N 
	
	for(i=0; i<n; i++){
		scanf_s("%d", &grade[i]); //���� ���� grade 
		
		if(max < grade[i]){ 
			max = grade[i]; //���� �� �ְ���
		}
	}
	
	double average=0;
	
	for(i=0; i<n; i++){
		average+= (double)grade[i]/(double)max*100; //����/�ְ���*100 
	}
	
	printf("%.2lf", average/n);
	
	return 0;
}
