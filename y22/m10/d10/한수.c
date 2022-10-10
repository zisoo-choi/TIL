#include <stdio.h>
int main(){
	int n=0, i=0, cnt=0;
	scanf_s("%d", &n);
	
	int hun=0, ten=0, one=0;
	
	for(i=1; i<=n; i++){
		hun = (i/100); //백의자리 
		ten = (i/10%10); //십의자리
		one = (i%10); //일의자리 
		
		//1의 자리와 10의 자리는 한수인정
		//그러나 100의 자리는 등차수열인지 확인해야 한다. 
		if((hun == NULL) && ((one != NULL) || (ten != NULL))){
			cnt++;
		}
		else if(hun != NULL){
			if((ten - hun) == (one - ten)) cnt++;
		}
	}
	printf("%d", cnt);
	return 0;
}