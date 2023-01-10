import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 현대모비스 채용연계형 교육생 1기 코테 복기 기반
public class 현대모비스1차_1 {

	public static void main(String[] args) throws IOException {
		
		// A, B 입력받고 사칙연산 출력 (혹시 모르니 형변환 추가)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println((float)A/B);
	}

}
