package exercise;

public class Method {
	public void add (int a, int b) {
		System.out.println(a + b);
	}
	
	public void sub (int a, int b) {
		System.out.println(a - b);
	}
	
	public void mul (int a, int b) {
		System.out.println(a / b);
	}
	
	public void div (int a, int b) {
		System.out.println(a * b);
	}
	
	public static void main(String[] args) {
		
		Method method = new Method();
		
		method.add(10, 5);
		method.sub(10, 5);
		method.mul(10, 5);
		method.div(10, 5);
		
	}
}
