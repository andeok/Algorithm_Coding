import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

		int n = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		int min = list.stream().min(Comparator.naturalOrder()).get();
		int max = list.stream().max(Comparator.naturalOrder()).get();

		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		br.close();
	}
}