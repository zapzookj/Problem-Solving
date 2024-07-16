class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        
        // 시작 위치 찾기
        int[] startPosition = findStartPosition(park);
        int currentY = startPosition[0];
        int currentX = startPosition[1];
        
        // 명령 수행
        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);
            
            // 이동 후의 잠정적인 새로운 위치 계산
            int newY = currentY;
            int newX = currentX;
            boolean isValid = true;
            
            for (int i = 0; i < distance; i++) {
                if (direction.equals("N")) {
                    newY--;
                } else if (direction.equals("S")) {
                    newY++;
                } else if (direction.equals("W")) {
                    newX--;
                } else if (direction.equals("E")) {
                    newX++;
                }
                
                // 공원을 벗어나거나 장애물을 만나면 무효 처리
                if (newY < 0 || newY >= H || newX < 0 || newX >= W || park[newY].charAt(newX) == 'X') {
                    isValid = false;
                    break;
                }
            }
            
            // 유효한 이동이면 위치 업데이트
            if (isValid) {
                currentY = newY;
                currentX = newX;
            }
        }
        
        return new int[] {currentY, currentX};
    }
    
    private static int[] findStartPosition(String[] park) {
        for (int y = 0; y < park.length; y++) {
            for (int x = 0; x < park[y].length(); x++) {
                if (park[y].charAt(x) == 'S') {
                    return new int[] {y, x};
                }
            }
        }
        return null;  // 시작 지점이 항상 주어진다는 조건이 있으므로 여기는 실행되지 않음
    }
}