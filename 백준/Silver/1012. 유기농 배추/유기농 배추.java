import java.io.*;
import java.util.*;

public class Main {

	static int[][] land;
	static boolean[][] visited;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			land = new int[m][n];
			visited = new boolean[m][n];
			
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				land[x][y] = 1;
			}
			
			count = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (land[i][j] == 1 && visited[i][j] == false) {
						dfs(i, j);
						count++;
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void dfs(int x, int y) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if ((0 <= nx && nx < land.length) && (0 <= ny && ny < land[0].length)) {
				if (visited[nx][ny] == false && land[nx][ny] == 1) {
					visited[nx][ny] = true;
					dfs(nx, ny);
				}
			}
		}
	}
	
}