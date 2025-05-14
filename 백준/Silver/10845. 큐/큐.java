import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String cmd = sc.next();
            switch (cmd) {
                case "push":
                    queue.addLast(sc.nextInt());
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append('\n');
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
        sc.close();
    }
}