package aaaa;

public class Test1 {
	public static void main(String[] args) {
		Integer a = 200;
		Integer b = 200;
		Integer d = new Integer(200);
		int c = 200;
		System.out.println(a == d);
		System.out.println(c == d);
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
		
		System.out.println(getBofeiNaQiYa(3));

	}

	public static int getBofeiNaQiYa(int n) {
		return (n == 1 || n == 2) ? 1 : (getBofeiNaQiYa(n - 1) + getBofeiNaQiYa(n - 2));

	}
}
