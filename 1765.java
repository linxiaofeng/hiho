import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,cur;
		int[] num,count;
		while(sc.hasNext()){
			n = sc.nextInt();
			num = new int[n];
			count = new int[n];
			for(int i = 0; i < n; i++){
				num[i] = sc.nextInt();
				count[i] = 0;
			}
			Arrays.sort(num);
			for(int i = 0; i < n; i++){
				cur = sc.nextInt();
				for(int j = 0; j < n; j++){
					if(num[j] <= cur){
						count[j]++;
					}
					else{
						break;
					}
				}
			}	
			int result = 1;
			for(int i = 0; i < n; i++){
				if(count[n-1-i] <= i){
					result = 0;
					break;
				}
				result *= (count[n-1-i] - i);
			}
			System.out.println(result);
		}
	}
}
