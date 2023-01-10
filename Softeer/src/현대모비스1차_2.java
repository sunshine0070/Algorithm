import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 현대모비스1차_2 {

	public static void main(String[] args) throws IOException {
		
		// 임의의 문자열 입력받음 (문자열 내 띄어쓰기 존재)
		// 문자열의 한 단어마다 비용 2 소모
		// 총 비용 계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strArr = str.split(" ");
		int cost = 2;
		
		System.out.println(strArr.length * cost);
	}
	

}
