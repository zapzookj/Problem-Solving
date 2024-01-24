import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num = 0;
        boolean check = false;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <= nums.length-3; i++){
            num1 = nums[i];
            for(int j = i+1; j <= nums.length-2; j++){
                num2 = nums[j];
                for(int z = j+1; z <= nums.length-1; z++){
                    num3 = nums[z];
                    list.add(num1+num2+num3);
                }
            }
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            for(int j = 2; j <= Math.sqrt(list.get(i)); j++){
                if(list.get(i) % j == 0){
                    check = false;
                    break;
                }
                check = true;
            }
            if(check == true){
                answer++;
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}