import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		bfs(n, k);
		br.close();
	}
	
	static void bfs(int startNode, int endNode) {
		Deque<Integer> q = new ArrayDeque<>();
		
		int[] time = new int[100001];
		Arrays.fill(time, -1);
		
		time[startNode] = 0;
		q.offer(startNode);
		
		while (!q.isEmpty()) {
			int currentNode = q.poll();
			int[] count = {currentNode - 1, currentNode + 1, currentNode * 2};
			
			if (currentNode == endNode) break;
			
			for (int nextNode : count) {
				if (0 <= nextNode && nextNode <= 100000) {
					if (time[nextNode] == -1) {
						time[nextNode] = time[currentNode] + 1;
						q.offer(nextNode);
					} 
				}
			}
		}
		
		System.out.println(time[endNode]);
	}
	
}
