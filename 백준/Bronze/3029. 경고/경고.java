import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] currentTime = br.readLine().split(":");  
		String[] targetTime = br.readLine().split(":");
		
		int currentSec = Integer.parseInt(currentTime[0]) * 3600 + Integer.parseInt(currentTime[1]) * 60 + Integer.parseInt(currentTime[2]);
		int targetSec = Integer.parseInt(targetTime[0]) * 3600 + Integer.parseInt(targetTime[1]) * 60 + Integer.parseInt(targetTime[2]);
		int waitSec = 0;
		
		if (targetSec > currentSec) {
			waitSec = targetSec - currentSec;
		} else {
			waitSec = (targetSec + 86400) - currentSec;
		}
		
		int hour = waitSec / 3600;
		int min = (waitSec % 3600) / 60;
		int sec = waitSec % 60;
		
		System.out.printf("%02d:%02d:%02d", hour, min, sec);
		br.close();
	}

}