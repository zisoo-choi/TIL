# 2022.10.12
어제 셀프넘버하고 자기로 했는데 안했다. 그래서 오늘 했다.

처음에 생각한 바로는 생성자가 있는 수를 먼저 구하고 1에서 10000까지의 그냥 수에서 생성자 수를 빼면 셀프넘버가 나오지 않을까 했는데, 안나왔고 제대로 구현도 못했다.

그래서 힌트를 얻고자 구글링을 했다.

https://tre2man.tistory.com/120 이 블로그에서 먼저 코드는 보지 않고, 어떤 절차로 접근했는지 풀이하신 글을 먼저 읽었다.

에라토스테네스의 체를 이용해서 푸셨다고 했다.

즉, 어떠한 배열을 만들어서 배열의 위치를 셀프 넘버를 판별하는 수로 생각하고, 배열 안의 내용을 0과 1로 나누어서 셀프넘버가 맞는지 아닌지를 판별하는 알고리즘으로 생각하고 풀었다고 한다.

대충은 이해했으나 완벽히는 아직 좀 더 이해 중

# 2022.10.13
위의 블로그에서 배열의 값을 10001로 주는데, 이렇게 주면 런타임 에러가 난다.

그래서 배열 값을 100001로 주면 에러가 나지 않는다는 점? 말고는 문제가 되는 점도 없고 이해 완료 !