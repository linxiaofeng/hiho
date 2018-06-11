import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
		String tmp;
		char t;
        char[][] maps;
        char[][] locN = new char[3][3];
        char[][] locE = new char[3][3];
        char[][] locS = new char[3][3];
        char[][] locW = new char[3][3];
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            maps = new char[n][m];
			tmp = sc.nextLine();
            for(int i = 0; i < n; i++){
				tmp = sc.nextLine();
                for(int j = 0; j < m && j < tmp.length(); j++){
                    maps[i][j] = tmp.charAt(j);
                }
            }
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					System.out.print(maps[i][j] + " ");
				}
				System.out.println("");
			}
            for(int i = 0; i < 3; i++){
				tmp = sc.nextLine();
                for(int j = 0; j < 3 && j < tmp.length(); j++){
                    t = tmp.charAt(j);
                    locN[i][j] = t;
                    locE[2-j][i] = t;
                    locS[2-i][2-j] = t;
                    locW[j][2-i] = t;
                }
            }
            for(int i = 1; i < n - 1; i++){
                for(int j = 1; j < m - 1; j++){
                    if(isMatch(maps,i,j,locN) || isMatch(maps,i,j,locE) || isMatch(maps,i,j,locS) || isMatch(maps,i,j,locW)){
                        System.out.println(i + " " + j);
                        continue;
                    }    
                }
            }
        }
    }
    public static boolean isMatch(char[][] maps, int n, int m, char[][] loc){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(maps[n-1+i][m-1+j] != loc[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}