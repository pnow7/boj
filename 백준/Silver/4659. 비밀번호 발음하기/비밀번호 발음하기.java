import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String pwd = br.readLine();

			if (pwd.equals("end")) {
				break;
			}
			
			boolean availablePwd = checkPwd(pwd);
			
			sb.append("<").append(pwd).append("> is ");
            if (availablePwd) {
                sb.append("acceptable.").append("\n");
            } else {
                sb.append("not acceptable.").append("\n");
            }
		}
		
		System.out.print(sb.toString());
		br.close();
	}
	
	// 모음 판별
	private static boolean isParent(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		
		return false; 
	}
	
	// 비밀번호 판단
	private static boolean checkPwd(String pwd) {
		boolean hasParent = false;
		int parentCount = 0;
		int childCount = 0;
		
		char prevCh = 0;
		
		for (int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			
			if (isParent(ch)) {
				hasParent = true;
			}
			
			if (isParent(ch)) {
				parentCount++;
				childCount = 0;
			} else {
				parentCount = 0;
				childCount++;
			}
		
			if (parentCount >= 3 || childCount >= 3) {
				return false;
			}
			
			if (prevCh != 0) {
				if (ch == prevCh) {
					if (!(ch == 'e' || ch == 'o')) {
						return false;
					}
				}
			}
			
			prevCh = ch;
		}
		
		if (!hasParent) return false; 
		
		return true;
	}

}