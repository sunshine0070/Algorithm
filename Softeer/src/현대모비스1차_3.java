import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 현대모비스1차_3 {

	public static void main(String[] args) throws IOException {
		
		// 유림이가 자기 MBTI 무작위로 바꿔서 태범이에게 알려줌
		// 유림이 원래 MBTI 구하기
		// 태범 MBTI와 유림 MBTI 중 다른 것의 개수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		if(str.contains("E")) {
			sb.append("E");
		}
		else if(str.contains("I")) {
			sb.append("I");
		}
		
		if(str.contains("S")) {
			sb.append("S");
		}
		else if(str.contains("N")) {
			sb.append("N");
		}
		
		if(str.contains("F")) {
			sb.append("F");
		}
		else if(str.contains("T")) {
			sb.append("T");
		}
		
		if(str.contains("J")) {
			sb.append("J");
		}
		else if(str.contains("P")) {
			sb.append("P");
		}
		
		
		System.out.println(sb);
		
		
	}
}
