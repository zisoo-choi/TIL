#include <stdio.h>
int main(){
	int n=0, sum=0;
	scanf_s("%d",&n); //숫자의 개수 N 
	
	char num[n];
	scanf_s("%s", num); //숫자 N개가 공백없이 주어진다.
	
	int j=0;
	for(j=0; j<n; j++){ //개인적으로 배열에 어떻게 들어갔는지 확인
		printf("num[%d] : %d, %c\n", j, num[j], num[j]);
	}
	
	int i=0;
	for(i=0; i<n; i++){ //문자열을 정수로 계산
		sum+=num[i]-'0';
	}
	printf("%d", sum);
	return 0;
}

/* 실패한 풀이 과정
#include <stdio.h>
int main(){
	int i=0, j=0, n=0, add=0;
	
	scanf_s("%d", &n);

	char num[n];
	do{
		scanf_s("%s", &num[j]);
	}
	while(i==1);
	
	char *ptr = strtok(num);

	while(ptr != NULL){
		add += ptr;
		ptr = strtok(NULL, "");
	}
	printf("%d\n", add);

	return 0;
}*/