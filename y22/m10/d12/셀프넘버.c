#include <stdio.h>
int main(){
	int n[100001];
	int i=0, temp=0;
	
	for(i=1; i<=10000; i++){ //1부터 10000까지 셀프 넘버 기록 
		temp = i;
		while(temp < 10000){
			if(n[i] == 0){
				n[self(temp)] = 1; //해당 수(셀프넘버)를 제외한 나머지 거르기 
			}
			temp = self(temp);
		}
	}
	
	for(i=1; i<=10000; i++){ //셀프넘버 출력 
		if(n[i] == 0){
			printf("%d\n", i);
		}
	} 
	return 0;
}

int self(int n){
	return n + (n%10000)/1000 + (n%1000)/100 + n/10%10 + n%10;
}


/* 혼자 구현했던 오답 
#include <stdio.h>
int main(){
	int n[100001];
	int i=0, temp=0;
	
	for(i=1; i<=10000; i++){
		temp = i;
		while(i < 10000){
			if(n[self(temp)] != 0){
				n[self(temp)] = 1;
				temp = self(temp);
			}
		}	
	}
	for(i=1; i<=10000; i++){ //셀프넘버 출력 
		if(n[i] == 0){
			printf("%d\n", i);
		}
	} 
	return 0;
}

int self(int n){ //생성자 있는 수 
	return n + (n%10000)/1000 + (n%1000)/100 + n/10%10 + n%10;
}
*/
