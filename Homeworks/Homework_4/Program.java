import java.util.Scanner;
class Program {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int finish = -1;
		int current = scanner.nextInt();
		int result[] = new int[10];

		while(current != finish){

			while (current > 0) {
				int i;
				i = current % 10;
				result[i]++;
				current = current / 10;

			}

			current = scanner.nextInt();
		}

		for (int i=0; i < 10; i++){
			if (result[i] != 0) {
			    System.out.println(i + " - " + result[i]);
			}
		}
	}
}