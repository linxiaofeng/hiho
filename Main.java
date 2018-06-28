import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		String input;
		Scanner sc = new Scanner(System.in);
		int[] min;
		int length;
		int minValue;
		while(sc.hasNext()){
			input = sc.nextLine();
			length = input.length();
			min = new int[length];
			for(int i = 0; i < length; i++){
				min[i] = i+1;
			}
			for(int i = 3; i < length; i++){
				for(int j = i/2+1; j < i;j++){
					String src = input.substring(j,i+1);
					String target = input.substring(0,j);
					if(isSubString(src,target)){
						if(min[j-1]+1 < min[i]){
							min[i] = min[j-1]+1;
							break;
						}
					}
				}
				if(min[i-1]+1 < min[i]){
					min[i] = min[i-1]+1;
				}
			}
			System.out.println(min[length-1]);

		}
	}
	public static boolean isSubString(String src, String target){
		int pos = 0;
		char cur;
		for(int i = 0; i < src.length(); i++){
			cur = src.charAt(i);
			while(pos < target.length() && target.charAt(pos) != cur){
				pos++;	
			}
			if(pos < target.length()){
				pos++;
			}
			else{
				return false;
			}
		}
		return true;
	}
}
