import java.util.Scanner;
import java.util.*;
public class Main{
	//int类型不足以存储数值
	//交换26和30两段代码会WA
	//可以直接写出数值，不需要列举
    public static void main(String[] args){
        String input;
        long integer,m;
        int n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            input = sc.next();
            n = input.length();
            m = (long) Math.pow(10,n);
            integer = Long.valueOf(input);
            if(integer > m/2){
                integer -= m/2;
            }    
            else{
                integer += m/2;
            }
            String t;
            long tmp;
            for(long i = 0; i < m/2; i++){
                                tmp = (integer - i + m) % m;
                if(test(format(tmp,n),n)){
                    System.out.println(format(tmp,n));
                    break;
                }
                tmp = (integer + i) % m; 
                if(test(format(tmp,n),n)){
                    System.out.println(format(tmp,n));
                    break;
                }

            }
        }
    }
    
	public static String format(long input,int n){
		String str = String.valueOf(input);
		if(str.length() == n-1){
			return "0" + str;
		}
		return str;
	}
	
    public static boolean test(String input,int n){        
        if(input.length() != n){
            return false;
        }
        Set<Character> sets = new HashSet<>();
        for(int i = 0;i < input.length(); i++){
            if(sets.contains(input.charAt(i))){
                return false;
            }
            else{
                sets.add(input.charAt(i));
            }
        }
        return true;
    }
}