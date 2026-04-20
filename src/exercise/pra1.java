package exercise;

public class pra1 {
	public static void main(String[] args) {
		String[] StringList = new String[args.length];
		for(int i = 0;i < args.length;i++) {
			StringList[i] = args[i];
		}
		for(int i = 0;i < StringList.length;i++) {
			System.out.println(StringList[i]);
		}
		
	}
}
