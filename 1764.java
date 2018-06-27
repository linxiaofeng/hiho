import java.util.Scanner;
public class Main{
	//异或运算 A ^ B = C ==> A = B ^ C
	//注意结果long
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int[] num;
		while(sc.hasNext()){
			n = sc.nextInt();
			num = new int[n];
			int r = 0;
			for(int i = 0; i < n; i++){
				num[i] = sc.nextInt();
				r = r ^ num[i];
			}
			if(r == 0){
				System.out.println((long)Math.pow(2,n)-2L);
			}
			else{
				System.out.println(0);
			}
		}
	}
}
