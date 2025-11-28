import java.io.*;
import java.util.*;

public class Main {

	private static int[] board;
	private static boolean[] visited;
	
	private static class Node {
		int position;
		int depth;
		
		Node (int position, int depth) {
			this.position = position;
			this.depth = depth;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		board = new int[101];
		visited = new boolean[101];
		
		for (int i = 1; i < 101; i++) {
			board[i] = i;
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			board[x] = y;
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			board[u] = v;
		}
		
		System.out.println(bfs());
		br.close();
	}
	
	private static int bfs() {
		Queue<Node> q = new ArrayDeque<>();

		q.offer(new Node(1, 0));
		visited[1] = true;
		
		while(!q.isEmpty()) {
			Node currentNode = q.poll();
			int position = currentNode.position;
			int depth = currentNode.depth;
			
			if (position == 100) return depth;
			
			for (int i = 1; i <= 6; i ++) {
				int next = position + i;
				
				if (next > 100) continue;
				
				next = board[next];
				
				if (visited[next] == false) {
					visited[next] = true;
					q.offer(new Node(next, depth + 1));
				}
			}
		}
		
		return 0;
	}

}