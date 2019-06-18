import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int finish = -1;	
		int current; // = scanner.nextInt();
		boolean isNeedSumm = true;
		boolean isInputCorrect = true;
		while (current!=finish){
			current = scanner.nextInt();
			if isInputCorrect {
				if (isNeedSumm){
					while(current > 0){
						resultForOutput = resultForOutput + current % 10;
						current=current/10;
					}
				System.out.println(resultForOutput);
				counter++;

			} else {
				continue;
			}

			
			//считаем произведение 


			// } else {
				
			// 	resultForOutput = 0;
			// 		while(current > 0){
			// 			resultForOutput = resultForOutput + current%10;
			// 			current=current/10;
			// 	}
			// 	System.out.println(resultForOutput);
			// 	counter++;
			// }

			// current=scanner.nextInt();
			// while(resultForOutput%2 != current%2){
			//  	System.out.println("PLEASE REPEAT");
			//  	current=scanner.nextInt();
			// }
		}
	}
}