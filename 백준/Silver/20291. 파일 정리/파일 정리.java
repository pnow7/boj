import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		TreeMap<String, Integer> map = new TreeMap<>();
		int N = Integer.parseInt(br.readLine());
		
		while (N-- >0) {
			String[] fileName = br.readLine().split("\\.");
			int fileType = fileName.length - 1;
			
			map.put(fileName[fileType], map.getOrDefault(fileName[fileType], 0) + 1);
		}
		
		
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			
			sb.append(key).append(" ").append(value).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}