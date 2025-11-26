import java.io.*;
import java.util.*;

public class Main {
	
	private static int[][] box;
	
	private static final int[] DX = {-1, 1, 0, 0};
	private static final int[] DY = {0, 0, -1, 1};
	private static int maxDay = 0;
	
	private static class Tomato {
		int x;
		int y;
		int day;
		
		Tomato(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Tomato> q = new ArrayDeque<>();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		box = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 1) {
					q.offer(new Tomato(i,j, 0));
				}
			}
		}
		
		bfs(q);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(maxDay);
		br.close();
	}
	
	private static void bfs(Queue<Tomato> q) {
		while(!q.isEmpty()) {
			Tomato current = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = current.x + DX[i];
				int ny = current.y + DY[i];
				
				if (0 <= nx && nx < box.length && 0 <= ny && ny < box[0].length) {
					if (box[nx][ny] == 0) {
						box[nx][ny] = 1;
						q.offer(new Tomato(nx, ny, current.day + 1));
					}
				}
			}
			
			maxDay = Math.max(maxDay, current.day);
		}
	}

}