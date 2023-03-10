import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main_13702_이상한술집 {

	static int N, K, num;
	static int ans;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		num = arr[N-1];
		
		if(N>1) {
			binarySearch();
		}
		else {
			ans = arr[0];
		}
		System.out.println(ans);
	}
	
	static void binarySearch() {
		int start = 1;
		int end = num;
		int mid;
		
		while(start<=end) {
			mid = (start+end)/2;
			int cnt = 0;
			// 각 n ml 들을 num으로 나눠서 cnt에 저장 -> 몇잔 나오나 확인
			for(int n : arr) {
				cnt += n/mid;
			}
			
			// 잔이 사람수보다 더 많으면 더 나눌수있음
			if(cnt>=K) {
				start = mid+1;
			}
			else {
				end = mid-1;
				ans = end;
			}
		}
	}
}
