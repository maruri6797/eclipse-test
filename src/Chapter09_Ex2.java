
public class Chapter09_Ex2 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b) + "です。");
	}
	static int gcd(int a, int b) {
//		while(b != 0) {
//			int c = b;
//			b = a % b;
//			a = c;
//		}
//		return a;
//	}
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
