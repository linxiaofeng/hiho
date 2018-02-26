import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numA,numB;
		while(sc.hasNext()){
			numA = sc.nextInt();
			numB = sc.nextInt();
			System.out.println(numA+numB);
		}
		
	}
}
