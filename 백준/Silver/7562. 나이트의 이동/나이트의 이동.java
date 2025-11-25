import java.io.*;
import java.util.*;

public class Main {
    
    static int[][] chess;
    static boolean[][] visited;
    
    static class Night {
        int x;
        int y;
        
        public Night(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int l = Integer.parseInt(br.readLine());
         
            chess = new int[l][l];
            visited = new boolean[l][l];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            
            Night startNight = new Night(startX, startY);
            
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            
            Night endNight = new Night(endX, endY);
            
            bfs(startNight, endNight);
            System.out.println(chess[endNight.x][endNight.y]);
        }
        
        br.close();
    }
    
    static void bfs(Night start, Night end) {
        Queue<Night> q = new ArrayDeque<>();
        
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
        
        visited[start.x][start.y] = true;
        q.offer(start);
        
        while (!q.isEmpty()) {
            Night current = q.poll();
            
            if (current.x == end.x && current.y == end.y) break;
            
            for (int i = 0; i < 8; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                if ((0 <= nx && nx < chess.length) && (0 <= ny && ny < chess[0].length)) {
                    if (visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        chess[nx][ny] = chess[current.x][current.y] + 1;
                        q.offer(new Night(nx, ny));
                    }
                }
            }
        }
    }
    
}