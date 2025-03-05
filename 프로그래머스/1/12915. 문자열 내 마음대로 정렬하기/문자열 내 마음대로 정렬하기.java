import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            int compareChar = Character.compare(a.charAt(n), b.charAt(n));
            return (compareChar != 0) ? compareChar : a.compareTo(b);
        });
        
        return strings;
    }
}
// 문제의 제한 조건을 제외하고 목적만을 본다면, 결국 주어지는 문자열을 '정렬'하는 것이다.
// Arrays.sort(a, b) 메서드를 통해, 주어진 제한 조건을 자세히 정의하는 b를 람다 식으로 정의한다면,
// 효율적으로 문제를 해결할 수 있다. 해당 코드에서 제한 조건 b는 (a, b) -> {람다식} 이 되겠다.