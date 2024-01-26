// class Solution {
//     public int solution(int number, int limit, int power) {
//         int answer = 0;
//         for(int i = 1; i<=number; i++){
//             int temp = 0;
//             for(int j = 1; j<=i; j++){
//                 if(i % j == 0){
//                     temp++;
//                     if(temp > limit){
//                         answer += power;
//                         break;
//                     }
//                 }
//             }
//             if(temp<=limit){
//                 answer += temp;
//             }
//         }
//         return answer;
//     }
// }
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisors = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisors[j]++;
            }

            if (divisors[i] > limit) {
                answer += power;
            } else {
                answer += divisors[i];
            }
        }
        
        return answer;
    }
}