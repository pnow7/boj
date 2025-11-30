import java.io.*;
import java.util.*;

class RoomNumberCheck {
	
	private static int[] count = new int[10];
	
	public RoomNumberCheck(String number) {
		for (char c : number.toCharArray()) {
			int dist = c - '0';
			
			if (dist == 6 || dist == 9) {
				count[6]++;
			} else {
				count[dist]++;
			}
		}
	}
	
	public int getRequiredSets() {
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			if (i == 6 || i == 9) {
				continue;
			}
			
			max = Math.max(max, count[i]);
		}
		
		int sixNine = (count[6] + 1) / 2;
		return Math.max(max, sixNine);
	}
	
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		System.out.println(new RoomNumberCheck(n).getRequiredSets());
		br.close();
	}
	
}