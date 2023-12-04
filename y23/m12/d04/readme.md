# 2022.12.04
프로그래머스 > 코딩테스트 연습 > Summer/Winter Coding(~2018) > [영어 끝말잇기](https://school.programmers.co.kr/learn/courses/30/lessons/12981)

### HashSet?
[참고 블로그](https://velog.io/@acacia__u/hashSet)
- List 등과는 다르게 순서가 보장되지 않는다.
- 중복을 자동으로 제거해준다.
- null 을 값으로 허용한다.

HashSet 은 Set 인터페이스에서 지원하는 구현 클래스이다.<br>
때문에 Set 의 성질을 그대로 상속받는다는 것이 특징이다.<br>
<br>
Set 은 비선형 구조이기 떄문에 '순서'의 개념과 '인덱스'가 존재하지 않는다.<br>
때문에 값을 추가, 삭제하는 경우 Set 내부에 해당 값을 검색하여 해당 기능을 수행해야 한다.<br>
이로인해 처리 속도가 List 구조에 비해 느리다는 것이 단점이다.<br>

#### HashSet의 구현
HashSet 내부 코드를 보면 HashMap 을 사용하여 구현되어 있는 것을 볼 수 있다.<br>
1. HashSet 생성
```
HashSet<String> animal = new HashSet<String>(); // 타입 지정 가능
HashSet<String> animals2 = new HashSet<>(); // 타입 생략 가능 => 빈 HashSet 생성 시 사용
HashSet<String> animals3 = new HashSet<>(10); // 초기 용량 설정
HashSet<String> animals4 = new HashSet<>(animals1); // animal의 모든 값을 가진 HashSet 생성
HashSet<String> animals5 = new HashSet<>(Arrays.asList("tiger", "lion", "fox")); // 초기값 지정 가능
```
2. HashSet 요소 값 추가<br>
생성된 Hash에 add() 메소드를 호출하여 값을 추가 가능하다.
```
HashSet<String> animals = new HashSet<>()
animals.add("tiger");
animals.add("lion");
animals.add("fox");

// HashSet은 저장 순서가 보장되지 않기에 특정 위치에 값을 추가하거나 할 수는 없다는 것을 명심 !
```
만약 입력되는 값이
- HashSet 내부에 존재하지 않는다면 그 값을 추가하고 true를 반환한다.
- 존재한다면 false를 반환한다.
<br>

3. HashSet 크기 구하기<br>
size() 메소드를 사용하여 Hash의 크기를 구할 수 있다.
```
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));

// set 크기 : 3
System.out.println(set.size());
```

4. HashSet 요소 값 삭제<br>
   remove(value) 와 clear() 메소드를 사용하여 Hash값을 제거할 수 있다.
```
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));

// 값 1 제거
set.remove(2);

// 모든 값을 제거
set.clear();
```
만약 삭제하려는 값이
- HashSet 내부에 존재한다면 그 값을 삭제하고 true를 반환한다. 
- HashSet 내부에 존재하지 않는 다면, false를 반환한다.
<br>
5. HashSet 요소 값 검색<br>
   원하는 값에 대해 contains(value) 메소드를 통해 Hash 내부에 존재하는 지 확인이 가능하다.
```
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));

// set내부에 값 1이 있다면 true 출력, 없다면 false 출력
System.out.println(set.contains(1)); 
```

6. HashSet 요소 값 출력
<br>
Set 컬렉션을 그냥 'print' 처리 할 경우 대괄호( '[ ]' )로 묶여 Set의 전체값이 출력된다.<br>
때문에, 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자 (Iterator)를 사용해 출력해야 한다.
```
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));

// 출력결과 : [1,2,3]
System.out.println(set); 

Iterator iter = set.iterator();	

while(iter.hasNext()) {              // hasNext() : 가져올 객체가 있다면 true 리턴, 없다면 false 리턴
    System.out.println(iter.next()); // next() : Iterator에서 하나의 객체를 가져올 수 있는 메소드
}
```

### 생각
컬렉션 프레임워크에 대해서 잘 몰라서 HashSet을 쓸 생각을 못했다.<br>
처음에 문제를 읽고 절차를 생각하다보니, 그냥 구조가 원형 큐 같은건가? 라고만 생각했다.<br>
그래서 풀어보려고 했으나 모르겠어서, 40분쯤에 일찍 답을 보고 이해를 해야겠다 싶었다.<br>
HashSet을 어떻게 쓸지는 이제 알았다.<br>
그러나
```
      for (int i = 1; i < words.length; i++) {
            // 이미 사용한 단어인지 또는 끝말잇기 규칙에 맞지 않는지 확인
                                             // words[i].charAt(0) : 현 글자의 첫 번재 글자
                                                                  // words[i - 1].charAt(words[i - 1].length() - 1) : 앞 글자의 마지막 글자
            if (usedWords.contains(words[i]) || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                // 탈락자 정보 저장 | [0]: 탈락자, [1]: 라운드
                answer[0] = (i % n) + 1;  // 번호는 1부터 시작하므로 +1
                answer[1] = (i / n) + 1;  // 차례는 1부터 시작하므로 +1
                // 문제의 조건에 따라 첫 번째 오류가 발생한 경우 바로 반복문 종료
                break;
            }

            // HashSet 에 현재 단어 추가
            usedWords.add(words[i]);
       }
```
해당 코드는 탈락자와 차례를 저장하는 부분인데,<br>
answer[0] = (i % n) + 1; 이런 부분에 있어서 전혀 생각도 못해본 방식이었다.<br>
모든 세상의 일은 코드로 구현이 가능하다고 생각해왔는데<br>
혼자 힘으로 풀지 못해 아쉽지만, 이렇게 HashSet 에 대해서 배운거라 생각한다.<br>
내일은 관련된 문제를 풀면서 직접 더 익혀보도록 해야겠다.