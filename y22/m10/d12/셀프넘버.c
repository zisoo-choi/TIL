#include <stdio.h>
int main(){
	int n[100001];
	int i=0, temp=0;
	
	for(i=1; i<=10000; i++){ //1���� 10000���� ���� �ѹ� ��� 
		temp = i;
		while(temp < 10000){
			if(n[i] == 0){
				n[self(temp)] = 1; //�ش� ��(�����ѹ�)�� ������ ������ �Ÿ��� 
			}
			temp = self(temp);
		}
	}
	
	for(i=1; i<=10000; i++){ //�����ѹ� ��� 
		if(n[i] == 0){
			printf("%d\n", i);
		}
	} 
	return 0;
}

int self(int n){
	return n + (n%10000)/1000 + (n%1000)/100 + n/10%10 + n%10;
}


/* ȥ�� �����ߴ� ���� 
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
	for(i=1; i<=10000; i++){ //�����ѹ� ��� 
		if(n[i] == 0){
			printf("%d\n", i);
		}
	} 
	return 0;
}

int self(int n){ //������ �ִ� �� 
	return n + (n%10000)/1000 + (n%1000)/100 + n/10%10 + n%10;
}
*/
