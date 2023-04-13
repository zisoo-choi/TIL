#include <stdio.h>
int main(){
	int x=0, n=0;
	int i=0, res=0;

	scanf_s("%d\n%d", &x, &n);
	
	int *a = malloc(sizeof(int)*n);
	int *b = malloc(sizeof(int)*n);
	
	for(i=0; i<n; i++){
		scanf_s("%d %d", &a[i], &b[i]);
		res += a[i]*b[i];
	}
	
	if(res == x){
		printf("Yes");
	}else{
		printf("No");
	}
	
	return 0;
}
