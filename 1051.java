import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c,n,m,max,result,tmp;
        int[] nums;
        while(sc.hasNext()){
            c = sc.nextInt();
            for(int i = 0; i < c; i++){
                n = sc.nextInt();
                m = sc.nextInt();
                nums = new int[n];
                for(int j = 0; j < n; j++){
                    nums[j] = sc.nextInt();
                }
				if(m >= n){
                    System.out.println(100);
                    continue;
                }
                max = 0;
                for(int j = 0; j <= n - m; j++){
                    if(j == 0){
                        tmp = nums[m] - 1;
                    }    
                    else if (j == n - m){
                        tmp = 100 - nums[j];
                    }
                    else{
                        tmp = nums[m+j] - nums[j-1] - 1;
                    }
                    if(tmp > max){
                        max = tmp;
                    }
                }    
                System.out.println(max);
            }
        }    
    }
}
