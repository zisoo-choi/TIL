#include <stdio.h>
int main(){
	int n=0, i=0, j=0, sum=0, cnt=0;
	
	scanf_s("%d", &n);
	char row[n];
	char col;
	
	for(i=0; i<n; i++){
		for(j=i+1; j<80; j++){
			scanf_s("%c", &row[j]);
		}
		
		for(j=i+1; j<80; j++){
			if(row[j] == "O"){
				cnt++;
				sum += cnt;
			}
			else{
				cnt = 0;
			}
			printf("cnt = %d\n", cnt);
		}
	}
	
	return 0;
}
