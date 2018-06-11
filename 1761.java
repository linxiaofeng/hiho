import java.util.Scanner;
public class Main{
	//注意洗两次的结果与原结果相同，否则会TLE
    public static void main(String[] args){
        int n,t,p;
        int[] nums;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n = sc.nextInt();
            t = sc.nextInt();
            p = (int) Math.pow(2,n);
            nums = new int[p];
            for(int i = 0; i < p; i++){
                nums[i] = sc.nextInt();
            }
            for(int i = 0; i < t % 2; i++){
                shuffle(nums,0,p-1);
            }    
            for(int i = 0; i < p; i++){
                System.out.println(nums[i]);
            }
        }
    }
    public static void shuffle(int[] nums, int start, int end){
        int tmp;
        if(end - start <= 1){
            tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
			return;
        }    
        int splitter = (end - start + 1)/2;
        shuffle(nums,start,start+splitter-1);
        shuffle(nums,start+splitter,end);
		for(int i = start; i < start+splitter; i++){
            tmp = nums[i];
            nums[i] = nums[i+splitter];
            nums[i+splitter] = tmp;
        }
    }
}