import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}

	public void solution() throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		//br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/B_9498_시험성적/input.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int score = Integer.parseInt(br.readLine());

		if (score >= 90 && score <= 100) {
			bw.write("A" + "\n");
		} else if (score >= 80 && score < 90) {
			bw.write("B" + "\n");
		} else if (score >= 70 && score < 80) {
			bw.write("C" + "\n");
		} else if (score >= 60 && score < 70) {
			bw.write("D" + "\n");
		} else {
			bw.write("F" + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}