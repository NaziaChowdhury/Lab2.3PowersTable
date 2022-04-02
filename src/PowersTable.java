import java.util.Scanner;

public class PowersTable {
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int userInt = scanner.nextInt();
		setUpTable();
		
		for (int i = 1; i <= userInt; i++) {
			System.out.println(i +"         | " +(i * i) +"          |" + "  " +(i * i * i));
			
		}
		
		System.out.println("Do you want to continue?");
		scanner.nextLine();
		String answer = scanner.nextLine();
	

		if (answer.toLowerCase().equals("yes")) {
			main(null);
		} else if (answer.toLowerCase().equals("no")) {
			System.out.println("Thank you.");
		} else {
			System.out.println("Please enter yes or no");
		}
		
		scanner.close();
		
	}
	
	public static void setUpTable() {
		System.out.println("");
		System.out.println("Here is your table!");
		System.out.println("");
		System.out.println("number    |  squared   |  cubed");
		System.out.println("--------  |  --------  |  --------");
		
		}
		}
	
	


