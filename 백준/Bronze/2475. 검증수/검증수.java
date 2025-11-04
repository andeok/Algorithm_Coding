import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}

	public int getSquare(int one) {
		return one * one;
	}

	public void solution() throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		//br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/B_2166_다각형의면적/input.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		st = new StringTokenizer(br.readLine());

		int a = getSquare(Integer.parseInt(st.nextToken()));
		int b = getSquare(Integer.parseInt(st.nextToken()));
		int c = getSquare(Integer.parseInt(st.nextToken()));
		int d = getSquare(Integer.parseInt(st.nextToken()));
		int e = getSquare(Integer.parseInt(st.nextToken()));

		bw.write((a + b + c + d + e) % 10 + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}
