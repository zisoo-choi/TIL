# 2022.10.03
처음에 문제 이해가 잘 안되서 예제 입력을 배열로 만들고 했다가 뭔가 이상함을 감지하고, 문제 이해만 하려고 잠깐 검색을 해봤다.

문제가 이해되고, 바로 코드 짜는데 분명 이론적으로는 잘 돌아가야 하는데 이상하게 틀렸다고 해서 또 당황했다.

보니까 12번째 줄에서 입력받을 때, decimal 맨 뒤에 \n를 붙였던 게 문제였다. ("%d %d\n" -> 바로 이 부분..)

나랑 같은 이유로 문제가 생긴 예의 설명
https://groups.google.com/g/han.comp.lang.c/c/HmiWd6iVO_E?pli=1

c 구현은 이제 그만하고, 파이썬 공부 시작해야 하는데 못하고 있다.