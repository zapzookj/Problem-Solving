import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 유저 → 신고한 유저들
        Map<String, Set<String>> userReports = new HashMap<>();
        // 유저 → 신고당한 횟수
        Map<String, Integer> reportCount = new HashMap<>();

        // 초기화
        for (String id : id_list) {
            userReports.put(id, new HashSet<>());
            reportCount.put(id, 0);
        }

        // 1. 중복 신고 제거 후 처리
        for (String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0]; // 신고자
            String target = split[1];   // 피신고자

            if (!userReports.get(reporter).contains(target)) {
                userReports.get(reporter).add(target);
                reportCount.put(target, reportCount.get(target) + 1);
            }
        }

        // 2. 정지된 유저 목록 생성
        Set<String> banned = new HashSet<>();
        for (String id : id_list) {
            if (reportCount.get(id) >= k) {
                banned.add(id);
            }
        }

        // 3. 각 유저가 받은 메일 수 계산
        for (int i = 0; i < id_list.length; i++) {
            String reporter = id_list[i];
            Set<String> reported = userReports.get(reporter);

            for (String target : reported) {
                if (banned.contains(target)) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}