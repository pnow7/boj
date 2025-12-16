import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
        
		int N = Integer.parseInt(br.readLine());
		
		while (N-- >0) {
			String[] fileName = br.readLine().split("\\.");
			int fileType = fileName.length - 1;
			
			map.put(fileName[fileType], map.getOrDefault(fileName[fileType], 0) + 1);
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list, (o1, o2) -> {
			return o1.compareTo(o2); 
		});
		
		for (String key : list) {
			Integer value = map.get(key);
			
			System.out.println(key + " " + value);
		}
		br.close();
	}

}