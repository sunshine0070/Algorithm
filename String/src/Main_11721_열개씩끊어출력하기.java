import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			if(i!=0 && i%10==0) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
	}
}
