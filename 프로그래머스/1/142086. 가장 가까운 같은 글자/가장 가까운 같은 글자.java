import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        int[] result = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            if (map.containsKey(charArr[i])) {
                result[i] = i - map.get(charArr[i]);
            } else {
                result[i] = -1;
            }
            
            map.put(charArr[i], i);
        }
        
        return result;
    }
}

// 만약 해시맵을 사용한다면 위 코드보다 시간 복잡도를 크게 줄일 수 있다. 문제상황에 따른 자료구조 활용을 좀 더 연습하자.

// public int[] solution(String s) {
//         int[] answer = new int[s.length()];
//         HashMap<Character, Integer> indexMap = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char currentChar = s.charAt(i);

//             if (indexMap.containsKey(currentChar)) {
//                 answer[i] = i - indexMap.get(currentChar);
//             } else {
//                 answer[i] = -1;
//             }

//             indexMap.put(currentChar, i);
//         }
//         return answer;
//     }