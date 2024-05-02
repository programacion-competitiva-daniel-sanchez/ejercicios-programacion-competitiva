// https://codeforces.com/problemset/problem/379/A

import java.util.Scanner;

public class A_Watermelon{
	public static void main(String[] args) {
		// Time complexity: O(1) Constant runtime
		// Space complexity: O(1) Constant space
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0 && n != 2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}