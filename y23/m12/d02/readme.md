# 2022.12.02
프로그래머스 > 코딩테스트 입문 > 연습문제 > [최솟값 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12941)

## Arrays.sort 란?
자바에서 배열 정렬을 할때 java.util.Arrays 클래스의 sort()메소드를 이용하여 정렬을 한다.<br>

### 오름차순 정렬
```
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] arr = {1, 3, 4, 2, 5};
        String[] strArr = {"A", "C", "B", "E", "D"};
        
        Arrays.sort(arr);
        for(int x : arr) System.out.print(x + ", ");
        // arr: [1, 2, 3, 4, 5] 출력
        
        Arrays.sort(strArr);
        for(String x : strArr) System.out.print(x + ", ");
        // strArr: [A, B, C, D, E] 출력
    }
}
```

### 내림차순 정렬
내림차순 정렬할 때는 Collections.reverseOrder() 함수를 사용한다.<br>
내림차순은 byte, char, int, long 같은 Primitive Type 배열에는 적용 불가능하다.<br>
Integer, String 같은 Wrapper Class를 사용해야 한다.
```
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] arr = {1, 3, 4, 2, 5};
        Integer[] arr2 = {1, 3, 4, 2, 5};
        String[] strArr = {"A", "C", "B", "E", "D"};
        
        Arrays.sort(arr, Collections.reverseOrder());
        // error
        
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int x : arr2) System.out.print(x + ", ");
        // arr2: [5, 4, 3, 2, 1] 출력
        
        Arrays.sort(strArr, Collections.reverseOrder());
        for(String x : strArr) System.out.print(x + ", ");
        // strArr: [E, D, C, B, A] 출력
    }
}
```
[Arrays.sort 참고 블로그](https://velog.io/@skwx50000/java-Arrays.sort%EC%97%90-%EB%8C%80%ED%95%B4%EC%84%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90)

### 생각
쉬운 문제라고 하는데, 나는 어려웠다.<br>
각 두 개의 배열에서 A 배열은 오름차순 * B 배열은 내림차순 형태로 1:1로 곱해준 누적 값이 나올 수 있는 최솟값이다.<br>
라는 말이 이해가 영 안간다. 하지만 그렇다고 한다.<br>
다른 예시 문제들도 만들어서 그려가면서 계산해봤는데, 저 공식대로 풀어야 답이 나온다.<br>

- A 배열 오름차순 정렬
- B 배열 내림차순 정렬
- A 배열과 B 배열을 1:1 로 곱해준다.
- 곱해준 값을 누적해서 더한 결과 값이 나올 수 있는 최솟값이다.

이런 로직이다. <br>

해당 문제에서는 int 배열이었기 때문에 Collections.reverseOrder() 함수를 사용하진 못했다.<br>
그래서 둘다 오름차순으로 정렬한 후,<b>
sum += A[i] * B[A.length-i-1];</b> 연산을 할 때, B 배열의 인덱스를 반대로 가져오도록 하였다.