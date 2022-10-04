/* 첫번째 : 검색을 통한 구현 
#include <stdio.h>
int main(){
	int num[9];
	int i=0, index=0, max=0;
	
	for(i=0; i<9; i++){
		scanf_s("%d", &num[i]);
		
		if(max < num[i]){
			max = num[i];
			index = i;
		}
	}printf("%d, %d\n", max, index+1);
	
	return 0;
} */

//두번째 : 처음에 하려고 했던 동적할당을 이용해서 구현 + 살짝 수정 
#include <stdio.h>
int main(){
	int size = 9;
	int *num = (int*)malloc(sizeof(int) * size);
	int i=0, index=0, max=0;
	
	for(i=0; i<9; i++){
		scanf_s("%d", &num[i]);
		
		if(max < num[i]){
			max = num[i];
			index = i;
		}
	}printf("%d\n%d\n", max, index+1);
	
	free(num); //메모리 해제 
	
	return 0;
}
