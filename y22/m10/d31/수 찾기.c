#include <stdio.h>
int main(){
	int low=0, mid=0, high=0;
	int i=0, j=0;
	int n=0, m=0;
	
	scanf_s("%d", &n);
	
	int arr[100010]={0};
	
	for(i=0; i<n; i++){
		scanf_s("%d", &arr[i]);
	}
	
	scanf_s("%d", &m);
	
	high = n+m;
	mid = (low+high)/2;
	
	for(i=mid; i<high; i++){
		scanf_s("%d", &arr[i]);
	}
	
	for(i=mid; i<high; i++){
		int num=0;
		for(j=low; j<=mid-1; j++){
			if(arr[i] == arr[j]){
				num = 1;
			}
		}
		printf("%d\n", num);
	}
	
	return 0;
}
