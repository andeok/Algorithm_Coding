import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int j = 1; j <= n; j++) {
            q.offer(j);
        }

        while (q.size() > 1) {
            q.poll();
            Integer temp = q.poll();
            q.offer(temp);
        }

        System.out.println(q.poll());
        sc.close();
    }
}