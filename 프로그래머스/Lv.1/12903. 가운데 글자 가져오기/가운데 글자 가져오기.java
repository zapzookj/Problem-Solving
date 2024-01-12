class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        if(arr.length % 2 == 1){
            answer = String.valueOf(arr[arr.length / 2]);
        }else{
            answer = String.valueOf(arr[arr.length / 2 -1]) + String.valueOf(arr[arr.length / 2]);
        }
        return answer;
    }
}

//String.valueOf() : ()안에 주어진 값을 문자열로 변환하는 메서드