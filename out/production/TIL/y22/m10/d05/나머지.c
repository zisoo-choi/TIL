/*#include <stdio.h>
int main(){
	int i=0, j=0, count=0, result=0;
	int res[10], input=0;
	
	for(i=0; i<10; i++){
		scanf_s("%d", &input);
		res[i]=input%42;
	}
	
	for(i=0; i<10; i++){
		for(j=i+1; j<10; j++){
			if(res[j] == res[i]) count++;
		}
		if(count == 0) result++;
	}
	printf("cnt = %d\n", result);
 
	return 0;
}*/

#include <stdio.h>

int main(void) {
    
    int input, result=0, i=0, j=0;
    int remain[10];
    
    for(i=0; i<10; i++) {
        scanf_s("%d", &input);
        remain[i] = (input % 42);
    }
    
    for(i=0; i<10; i++) {
        int count=0; // �ʱ�ȭ
        for(j=i+1; j<10; j++) { // ���� ���� ���� ���
            if(remain[i] == remain[j]) count++;
        }
        if (count == 0) result++; // ���� ���� ���� ��� ������ ���ش�
    }
    
   printf("%d", result);
}
