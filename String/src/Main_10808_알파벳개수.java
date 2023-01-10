import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10808_알파벳개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] cntArr = new int[26];
		
		for(char c : str.toCharArray()) {
			int num = c - 'a';
			System.out.print(num + " ");
			cntArr[num]++;
		}
		
//		for(int i=0; i<cntArr.length; i++) {
//			System.out.print(cntArr[i] + " ");
//		}
	}
}
