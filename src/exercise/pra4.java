package exercise;

public class pra4 {
	public static void main(String[] args) {
		int[] intList;
		intList = new int[5];
		int a = 10;
		for (int i = 0;i < intList.length; i++) {
			intList[i] = a;
			a++;
		}
		for (int i = 0;i < intList.length; i++) {
			System.out.println(intList[i]);
		}
		String[] StringList = {"りんご","バナナ","ぶどう"};
		for (int i = 0;i < StringList.length; i++) {
			System.out.println(StringList[i]);
		}
	}
}
