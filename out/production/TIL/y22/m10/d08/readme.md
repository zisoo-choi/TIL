# 2022.10.08
결국 하다가 문자열을 배열에 저장해놓고 하나씩 빼서 계산하는 방법을 모르겠어서 검색했다.

1. strlen을 이용해서 문자열의 길이를 구해야했고, 이걸 사용하려면 <string.h> 불러와야 하는 것.

* strlen : 문자열의 길이를 구한다. 문자열의 끝을 알리는 NULL 문자를 제외하고, 실제 들어가 있는 글자의 개수를 반환한다. (공백포함)

2. 현재 코드에서 add(내가 작성했던 코드에서는 cnt)가 0이 아닌 1부터 시작해야 했던 것.

3. 그 외) 수정사항 많았음. 그러므로 그냥 잘 몰랐던 것.

시간이 나면, 이 문제도 어떻게 돌아가는 지 제대로 이해 해봐야겠다.