import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int finish = -1;	
		int current = scanner.nextInt();
		int counter = 1;
		int resultForOutput;
		while (current!=finish){
			if (counter%2 != 0){
				resultForOutput = 1;
					while(current > 0){
						resultForOutput = resultForOutput * current % 10;
						current=current/10;
				}
				System.out.println(resultForOutput);
				counter++;
			} else {
				
				resultForOutput = 0;
					while(current > 0){
						resultForOutput = resultForOutput + current%10;
						current=current/10;
				}
				System.out.println(resultForOutput);
				counter++;
			}

			current=scanner.nextInt();
			while(resultForOutput%2 != current%2){
			 	System.out.println("PLEASE REPEAT");
			 	current=scanner.nextInt();
			}
		}
	}
}