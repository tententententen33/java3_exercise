package exercise;

public class for_kakutyou {
	public static void main(String[] args) {
		//一次元配列
		int[] num = {1,2,3,4,5};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("---------------------------");
		for (int i : num) {
			System.out.println(i);
		}
		//二次元配列
		int number = 1;
		int[][] n = new int[3][3];
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				n[i][j] = number++;
			}
		}
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				System.out.println(n[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int[] i : n) {
			for(int j : i) {
				System.out.println(j);
			}
			System.out.println();
		}
		
		//三次元配列
		int number1 = 1;
		int[][][] n1 = new int[3][3][3];
		for(int i = 0; i < n1.length; i++) {
			for(int j = 0; j < n1[i].length; j++) {
				for(int k = 0; k < n1[i][j].length; k++) {
					n1[i][j][k] = number1++;
				}
			}
		}
		for(int[][] i : n1) {
			for(int[] j : i) {
				for(int k : j) {
					System.out.println(k);
				}
				System.out.println();
			}
		}
	}
}
