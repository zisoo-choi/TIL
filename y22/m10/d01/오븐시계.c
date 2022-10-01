#include <stdio.h>
int main(){
	int A=0, B=0, C=0;
	
	scanf_s("%d %d", &A, &B);
	scanf_s("%d", &C);
	
	int t=0, m=0;
	
	B = B + C;
	if(B >= 60){
		m = B % 60; //ºÐ 
		t = B / 60; //½Ã°£
		
		A = A + t;

		if(A>=24){
			A = A % 24;
		}
		printf("%d %d", A, m);
	} else {
		printf("%d %d", A, B);
	}
	return 0;
}
