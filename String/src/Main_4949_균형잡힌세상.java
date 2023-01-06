import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949_균형잡힌세상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str, ans;
		while(true) {
			str = br.readLine();
			ans = "yes";
			
			// == 쓰면 null 포인터에러남
//			if(str == ".") break;
			if(str.equals(".")) break;
			
			Stack<Character> stack = new Stack<>();
			for(int i=0; i<str.length(); i++) {
				// 열림 기호는 다 넣기
				char c = str.charAt(i);
				if(c == '(' || c == '[') {
					stack.push(c);
				}
				// 닫힘 기호일때 
				// 1. 스택 비어있으면 no
				// 2. 짝 안맞으면 no
				else if(c == ')') {
					if(stack.empty() || stack.peek() != '(') {
						ans = "no";
						break;
					}
					else {
						stack.pop();
					}
				}
				else if(c == ']') {
					if(stack.empty() || stack.peek() != '[') {
						ans = "no";
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			
			if(stack.empty()) {
				// 스택이 비면 yes
				System.out.println(ans);
			}
			else {
				// 스택이 남아있으면 no
				ans = "no";
				System.out.println(ans);
			}
		}
	}
}
