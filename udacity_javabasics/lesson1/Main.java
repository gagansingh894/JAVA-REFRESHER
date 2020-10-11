class Main {

	public static void main(String[] args) {
		// Print
		System.out.println("Hello, World");
		System.out.println(2 + 3);

		// Variable Declaration and Updation
		String name;
		name = "Gagandeep";
		int passengers = 0;
		passengers += 5;
		System.out.println(passengers);

		// String operations
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		String fname = "Mr";
		String lname = "Robot";
		System.out.println(fname + ' ' + lname);
		System.out.println("My name is " + name + " and i can carry " + passengers + " passengers");
	}
}