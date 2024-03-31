package Binary;

import java.util.*;

public class Binary {
	
	static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		arr = new int[1000001];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i = 3; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		System.out.print(dfs(Num));
	}

	public static int dfs(int Num) {
		
		if(arr[Num] == -1) {
			arr[Num] = (dfs(Num - 1) + dfs(Num - 2)) % 15746;
		}
		
		return arr[Num];
	}
}
