// https://codeforces.com/problemset/problem/1680/B
import java.util.Scanner;

public class B_Robots {

    // Time complexity: O(N*M)
    // Space complexity: O(1) Constant time complexity
    public static String solve(int n, int m, String[] matrix){
        int[] min_point = {-1, -1};
        int min_row = n;
        int min_column = m;
        for(int i = 0; i<n; i++){
            for (int j = 0; j < m; j++) {
                char cell = matrix[i].charAt(j);
                if(cell == 'R'){
                    if(min_point[0] == -1 && min_point[1] == -1){
                        min_point[0] = i;
                        min_point[1] = j;
                    }
                    if(i < min_row)
                        min_row = i;
                    if(j < min_column)
                        min_column = j;
                    if(!(min_point[0] == min_row && min_point[1] == min_column)){
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int t = lector.nextInt();
        for(int i = 0; i< t; i++){
            int n = lector.nextInt();
            int m = lector.nextInt();
            String[] matrix = new String[n];
            for(int j = 0; j<n; j++){
                matrix[j] = lector.next();
            }
            System.out.println(solve(n, m, matrix));
        }
    }
}
