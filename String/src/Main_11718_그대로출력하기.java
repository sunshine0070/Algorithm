import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11718_그대로출력하기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
		}
	}
}
