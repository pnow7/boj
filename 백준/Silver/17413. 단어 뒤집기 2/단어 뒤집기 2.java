import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		String S = br.readLine();
		boolean isTag = false;
		
		for (char ch : S.toCharArray()) {
			if (ch == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				isTag = true;
				sb.append(ch);
			} 
			else if (ch == '>') {
				isTag = false;
				sb.append(ch);
			} 
			else if (isTag) {
				sb.append(ch);
			} else {
				if (ch == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(ch);
				} 
                else {
					stack.push(ch);
				}
			}
		}
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}