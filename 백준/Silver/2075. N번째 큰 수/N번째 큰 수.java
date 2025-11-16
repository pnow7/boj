import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if (minHeap.size() < N) {
					minHeap.add(num);
				} else if (num > minHeap.peek()) {
					minHeap.poll();
					minHeap.add(num);
				}
			}
		}
		
		System.out.println(minHeap.poll());
		br.close();
	}

}