import java.lang.Math;

class Main {

	public static void main(String[] args) {

		chorus("Gagan");
		int z = add(2,3);

		System.out.println(z);
		System.out.println(randomGen(10));
	}

	public static void chorus(String name) {
		System.out.println("Hello " + name);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int randomGen(int r) {
		int randomNumber = (int) (Math.random() * r) + 1;
		return randomNumber;
	}


}