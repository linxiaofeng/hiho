import java.util.Scanner;
public class Main{
	//尝试计算最长子序列，WA，没有注意子序列第一位与firstString的关系
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String from,to;
        while(sc.hasNext()){
            n = sc.nextInt();
            for(int i = 0;i < n; i++){
                int maxmax = 0;
                from = sc.next();
                to = sc.next();
                boolean r = test(from,to,from) || test(to,from,from);
                if(r){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
	}
	public static boolean test(String start,String next, String target){
	    int firstIndex = 0;
	    int nextIndex = 0;
	    boolean isFirst = true;
	    char ch;
	    int index;
	    for(int i = 0; i < target.length(); i++){
	        ch = target.charAt(i);
	        if(isFirst){
	            firstIndex = start.indexOf(ch,firstIndex);
	            if(firstIndex == -1){
	                return false;
	            }
	            firstIndex++;
	            isFirst = !isFirst;
	        }
	        else{
	            nextIndex = next.indexOf(ch,nextIndex);
	            if(nextIndex == -1){
	                return false;
	            }
	            nextIndex++;
	            isFirst = !isFirst;
	        }
	    }
	    return true;
	}
}