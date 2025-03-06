class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            if (num != 0) {
                String str = String.valueOf(i);
                sb.append(str.repeat(num));
            }
        }
        
        StringBuilder reverseSb = new StringBuilder(sb).reverse();
        sb.append("0");
        sb.append(reverseSb);
        
        return sb.toString();
    }
}
// StringBuilder의 .reverse() 메서드를 사용해 문자열을 뒤집을 수 있다.