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
}
