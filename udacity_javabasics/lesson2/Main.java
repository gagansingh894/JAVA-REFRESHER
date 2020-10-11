class Main {

	public static void main(String[] args) {
		boolean isCold = true;
		boolean isLightGreen = false;
		boolean isLightYellow = true;

		if (isCold) {
			System.out.println("Wear a coat");
		}

		if (isLightGreen) {
			System.out.println("Drive!");
		} else if (isLightYellow) {
			System.out.println("Slow Down.");
		} else {
			System.out.println("Stop.");
		}

		int passcode = 5525;
		String coffeeType;

		switch(passcode) {
			case 555: coffeeType = "Espresso";
				break;
			case 312: coffeeType = "Vanilla Latte";
				break;
			default: coffeeType = "Unknown";
				break;
		}

		System.out.println(coffeeType);


	}
}