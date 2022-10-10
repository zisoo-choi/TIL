#include <stdio.h>
long long sum(int *a, int n){
	int i=0;
	long long res=0;
	for(i=0; i<n; i++){
		res += a[i];
	}
	return res;
}
