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
		//br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/B_10171_고양이/input.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("|\\_/|\n");
		bw.write("|q p|   /}\n");
		bw.write("( 0 )\"\"\"\\\n");
		bw.write("|\"^\"`    |\n");
		bw.write("||_/=\\\\__|\n");

		bw.flush();
		bw.close();
		br.close();
	}
}