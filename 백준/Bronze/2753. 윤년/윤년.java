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
		//br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/B_2753_윤년/input.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int year = Integer.parseInt(br.readLine());

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			bw.write("1\n");
		else
			bw.write("0\n");

		bw.flush();
		bw.close();
		br.close();
	}
}
