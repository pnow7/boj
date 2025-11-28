import java.io.*;
import java.util.*;

public class Main {
    
    private static final int[] DX = {-1, 1, 0, 0};
    private static final int[] DY = {0, 0, -1, 1};
    
    private static int n, m;
    private static int[][] map;
    private static boolean[][][] visited;
    
    private static class Node {
        int x, y, dist, broken;
        Node(int x, int y, int dist, int broken) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.broken = broken;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
        visited = new boolean[n][m][2];
        
        for (int i = 0; i < n; i++) {
            String num = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = num.charAt(j) - '0';
            }
        }
        
        System.out.println(bfs());
        br.close();
    }
    
    private static int bfs() {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(0, 0, 1, 0));
        visited[0][0][0] = true;
        
        while (!q.isEmpty()) {
            Node current = q.poll();
            
            if (current.x == n - 1 && current.y == m - 1) return current.dist;
            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + DX[i];
                int ny = current.y + DY[i];
                
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (map[nx][ny] == 1 && current.broken == 0) {
                        if (visited[nx][ny][1] == false) {
                            visited[nx][ny][1] = true;
                            q.offer(new Node(nx, ny, current.dist + 1, 1));
                        }
                    } else if (map[nx][ny] == 0) {
                        if (visited[nx][ny][current.broken] == false) {
                            visited[nx][ny][current.broken] = true;
                            q.offer(new Node(nx, ny, current.dist + 1, current.broken));
                        }
                    }
                }
            }
        }
        
        return - 1;
    }
    
}