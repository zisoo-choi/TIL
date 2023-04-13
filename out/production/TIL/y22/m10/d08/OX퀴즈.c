#include <stdio.h>
#include <string.h>
int main(){
	int n=0, i=0, j=0;
	char input[100]; //문자열을 넣어줄 배열 선언 
	
	scanf_s("%d", &n); //입력받는 testcase 값 
	
	for(i=0; i<n; i++){
		int sum=0, add=1; //add에 0으로 선언해버리면 1점이 아니라 0점부터 시작한다고 한다. 
		scanf_s("%s", &input); //문자열 입력시 배열의 이름만 쓰면 배열의 첫번째 주소값을 가리키고 있다. 
		
		for(j=0; j<strlen(input); j++){ //strlen을 이용하여 입력받은 문자열 길이를 구한다. 
			if(input[j] == 'O'){
				sum += add; //sum(0점부터 시작) = sum(0점) + add(1점); 
				add++; //add(2점, ...) 
			}
			if(input[j] == 'X'){
				add = 1;
			}
		}
		printf("%d\n", sum);
	}
	
	return 0;
}

/* 처음에 실패한 내 풀이 
#include <stdio.h>
int main(){
	int n=0, i=0, j=0, sum=0, cnt=0; //1. cnt가 0으로 시작하면 안되고, 여기에 선언되어서는 안된다. 
	
	scanf_s("%d", &n);
	char row[n]; //2. 배열의 크기가 작다. 
	char col;
	
	for(i=0; i<n; i++){
		for(j=i+1; j<80; j++){ 	//3. 두번째 for문에서는 j로 문자열의 길이를 읽어와야 한다.
								//j=0으로 시작해야한다. 
			scanf_s("%c", &row[j]); //4. 문자열 입력을 %s로 받고, &나 [j] 배열 생략. 
		}
		
		for(j=i+1; j<80; j++){
			if(row[j] == "O"){
				cnt++; 			//5. cnt가 먼저 플러스 되는 것이 아니다. 아래와 반대 
				sum += cnt;
			}
			else{
				cnt = 0; //다시 말하지만 cnt는 1로 초기화 해야한다. 
			}
			printf("cnt = %d\n", cnt); 	//6. 여기서 출력 아님 
		}
	}
										//여기서 sum 출력임 
	return 0;
}
*/