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

		int size = 0;

		st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			st.nextToken();
			size++;
		}

		bw.write(size + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}
