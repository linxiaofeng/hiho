import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        //String reg = "[Mm][Aa][Rr][Ss][Hh][Tt][Oo][Mm][Pp]";
        String reg = "(?i)marshtomp";
		String replacement = "fjxmlhx";
        while(sc.hasNext()){
            input = sc.nextLine();
            input = input.replaceAll(reg,replacement);
            System.out.println(input);
        }
    }
}