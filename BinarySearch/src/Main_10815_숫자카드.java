import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_10815_숫자카드 {

	static int N, M;
	static int[] nCard, mCard;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		nCard = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nCard[i] = Integer.parseInt(st.nextToken());
		}
		
		M = Integer.parseInt(br.readLine());
		mCard = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			mCard[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nCard);
		
//		for(int i=0; i<N; i++) {
//			System.out.print(nCard[i] + " ");
//		}
//		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			if(BinarySearch(mCard[i]) == -1) {
				sb.append("0").append(" ");
			}
			else {
				sb.append("1").append(" ");
			}
		}
		
		System.out.println(sb);
	}
	
	static int BinarySearch(int num) {
		
		int l = 0;
		int r = N-1;
		int m;
		
		while(l<=r) {
			m = (l+r)/2;
			if(nCard[m] < num) {
				l = m+1;
			}
			else if(nCard[m] > num) {
				r = m-1;
			}
			else
				return m;
		}
		return -1;
	}
}
