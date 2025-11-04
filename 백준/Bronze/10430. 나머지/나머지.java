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
		//br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/BOJ_102_루프/input.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		bw.write((A + B) % C + "\n");
		bw.write(((A % C) + (B % C)) % C + "\n");
		bw.write((A * B) % C + "\n");
		bw.write(((A % C) * (B % C)) % C + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}
