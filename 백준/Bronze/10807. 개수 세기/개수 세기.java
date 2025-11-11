import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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


		int count = Integer.parseInt(br.readLine());
		int result = 0;
		st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(br.readLine());

		for(int i = 0; i < count; i++) {
			if(Integer.parseInt(st.nextToken()) == target) {
				result++;
			}
		}
		System.out.println(result);

		bw.flush();
		bw.close();
		br.close();
	}
}
