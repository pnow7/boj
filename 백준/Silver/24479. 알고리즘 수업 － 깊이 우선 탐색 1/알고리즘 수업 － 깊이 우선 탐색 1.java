import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer>[] graph;
	static int[] order;
	static int count = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N + 1];
		order = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < M; i++ ) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph[i]);
		}
		
		DFS(R);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(order[i]).append('\n');
		}
		System.out.print(sb.toString());
		
		br.close();
	}
	
	static void DFS(int startNode) {
		order[startNode] = count;
		
		count++;
		
		for (int nextNode : graph[startNode]) {
			if (order[nextNode] == 0) {
				DFS(nextNode);
			}
		}
	}
}