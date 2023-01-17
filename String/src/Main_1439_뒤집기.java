import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1439_뒤집기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int countOne = 0;
		int countZero = 0;
		// 맨 첫자리에 따라 0덩어리 개수 또는 1덩어리 개수 증가
		if(str.charAt(0) == '0') countZero++;
		else countOne++;
		
		// 앞의 값과 다를때, 0이면 0덩어리 개수 증가, 1이면 1덩어리 개수 증가
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i-1) != str.charAt(i)) {
				if(str.charAt(i) == '0') countZero++;
				else countOne++;
			}
		}
		System.out.println(Math.min(countZero, countOne));
	}

}
