import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 정수를 문자열로 변환하여 각 자릿수를 배열에 저장
        char[] digits = Long.toString(n).toCharArray();

        // 각 자릿수를 큰 순서로 정렬
        Arrays.sort(digits);

        // 배열을 역순으로 읽어 새로운 정수 생성
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedNumber.append(digits[i]);
        }

        // 문자열을 정수로 변환하여 반환
        return Long.parseLong(reversedNumber.toString());
    }
}