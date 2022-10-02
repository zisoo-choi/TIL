#include <stdio.h>
int main(){
	int a=0, b=0, c=0, rel=0;
	int max=0, equl=0;
	
		scanf_s("%d %d %d", &a, &b, &c);
	
		if((a==b)&&(b==c)&&(a==c)){
			rel = 10000 + a * 1000;
			printf("%d", rel);
		}
		else if((a==b)||(a==c)||(b==c)){
			equl = a;
			if(equl == b){
				equl = b;
			}
			else if(equl == c){
				equl = c;
			}
			else{
				equl = b;
			}
			rel = 1000 + equl * 100;
			printf("%d", rel);
		}
		else if((a!=b)&&(b!=c)&&(c!=a)){
			if(a>max){
				max = a;
				if(b>max){
					max = b;
					if(c>max){
						max = c;
					}
				}
				else if(c>max){
					max = c;
				}
				rel = max * 100;
			}
			printf("%d", rel);
		}
	return 0;
}
