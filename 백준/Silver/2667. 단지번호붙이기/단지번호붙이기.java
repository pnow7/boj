import java.io.*;
import java.util.*;

public class Main {

	static boolean[][] visited;
	static int[][] house;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n][n];
		house = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String num = br.readLine();
			for (int j = 0; j < n; j++) {
				house[i][j] = num.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (house[i][j] == 1 && visited[i][j] == false) {
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		
		sb.append(list.size()).append("\n");
		for (int result : list) {
			sb.append(result).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	static void dfs(int x, int y) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		visited[x][y] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if ((0 <= nx && nx < house.length) && (0 <= ny && ny < house.length)) { 
				if (house[nx][ny] == 1 && visited[nx][ny] == false) {
					visited[nx][ny] = true;
					dfs(nx, ny);
				}
			}
		}
	}
	
}
