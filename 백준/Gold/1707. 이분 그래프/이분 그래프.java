import java.io.*;
import java.util.*;

public class Main {

	// 0: 미방문, 그룹1: 1, 그룹2: 2
	private static int[] color;
	private static ArrayList<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int k = Integer.parseInt(br.readLine());
		
		while (k-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			color = new int[v + 1];
			graph = new ArrayList[v + 1];
			
			for (int i = 1; i <= v; i++) {
				graph[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < e; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()); 
				int y = Integer.parseInt(st.nextToken());
				
				graph[x].add(y);
				graph[y].add(x);
			}
			
			boolean isBipartite = true;
			
			for (int i = 1; i < v + 1; i++) {
				if (color[i] == 0) {
					if (!bfs(i)) {
						isBipartite = false;
						break;
					}
				}
			}
			
			sb.append(isBipartite ? "YES" : "NO").append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	private static boolean bfs(int start) {
		Queue<Integer> q = new ArrayDeque<>();
		
		color[start] = 1;
		q.offer(start);
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			int nextColor = (color[cur] == 1) ? 2 : 1;
				
			for (int next : graph[cur]) {
				if (color[next] == color[cur]) return false;
				
				if (color[next] == 0) {
					color[next] = nextColor;
					q.offer(next);
				}
			}
		}
		
		return true;
	}
	
}
