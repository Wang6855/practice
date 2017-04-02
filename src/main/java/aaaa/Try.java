package aaaa;

public class Try {
	public static void main(String[] args) {

		System.out.println(testTry());
	}

	@SuppressWarnings("finally")
	public static String testTry() {
		try {
			System.out.println("try1");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch1");
			return "exit1";
		} finally {
			System.out.println("finally1");
			try {
				System.out.println("try2");
				throw new Exception();
			} catch (Exception e) {
				System.out.println("catch2");
				return "exit2";
			} finally {
				System.out.println("finally2");
			}
		}
	}
}
