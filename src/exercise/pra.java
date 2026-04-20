package exercise;

public class pra {
	public static void main(String[] args) {
		int[] intlist;
		String[] Stringlist;
//		int a;
//		int b;
//		a = 10;
//		b = 0;
		intlist = new int[5];
		
		int a = 10;
		for (int i = 0; i < intlist.length; i++) {
			intlist[i] = a;
			a++;
		}
		for (int i = 0; i < intlist.length; i++) {
			System.out.println(intlist[i]);
		}
		
		Stringlist = new String[]{"りんご","バナナ","ぶどう"};
		
		String[] StringlistCope = new String[3];
		
		for(int i = 0; i < Stringlist.length; i++) {
			StringlistCope[i] = Stringlist[i];
		}
		
		for(int i = 0; i < Stringlist.length; i++) {
			System.out.println(StringlistCope[i]);
		}
	}
}
