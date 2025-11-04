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
		//br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/BOJ_2588_곱셈/input.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		bw.write(A * (B.charAt(2) - '0') + "\n");
		bw.write(A * (B.charAt(1) - '0') + "\n");
		bw.write(A * (B.charAt(0) - '0') + "\n");
		bw.write(A * Integer.parseInt(B) + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}
