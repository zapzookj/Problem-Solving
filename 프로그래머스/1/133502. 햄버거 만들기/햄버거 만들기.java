import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ingredient.length; i++) {
            list.add(ingredient[i]);
            if (list.size() >= 4 && list.get(list.size() - 4) == 1 &&
                list.get(list.size() - 3) == 2 && list.get(list.size() - 2) == 3 &&
                list.get(list.size() - 1) == 1) {
                for (int j = 0; j < 4; j++) {
                    list.remove(list.size() - 1);
                }
                answer++;
            }
        }
        
        return answer;
    }
}