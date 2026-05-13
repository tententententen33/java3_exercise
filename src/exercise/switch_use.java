package exercise;

public class switch_use {
	public static void main(String[] args) {
		int day = 2;

		switch (day) {
		    case 1:
		        System.out.println("月曜日");
		    case 2:
		        System.out.println("火曜日");
		    case 3:
		        System.out.println("水曜日");
		}
		
		System.out.println("----------------------");
		
		int day2 = 2;

		String result = switch (day2) {
		    case 1 -> "月曜日";
		    case 2 -> "火曜日";
		    case 3 -> "水曜日";
		    default -> "その他";
		};

		System.out.println(result);
	}
}
