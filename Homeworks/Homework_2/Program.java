class Program {
	public static void main(String[] args) {
		int number = 13765;
		System.out.println("count of 5000 = "  + number/5000);
		number = number % 5000;
		System.out.println("count of 1000 = "  + number/1000);
		number = number % 1000;
		System.out.println("count of 500 = "  + number/500);
		number = number % 500;
		System.out.println("count of 100 = "  + number/100);
		number = number % 100;
		System.out.println("count of 50 = "  + number/50);
		number = number % 50;
		System.out.println("count of 10 = "  + number/10);
		number = number % 10;
		System.out.println("count of 5 = "  + number/5);
		number = number % 5;
		System.out.println("count of 2 = "  + number/2);
		System.out.println("count of 1 = "  + number%2);
		
	}
}