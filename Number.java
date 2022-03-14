import java.util.Scanner;

//import java.util.Scanner;
    class NumberDigits {

		int number, r;
	
		void insert_value() {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
			
		}
		void digit() {
			//int r;
			//System.out.println(r);

	          //int number;
			while(number > 0) {
				
				r = number % 10;
				System.out.println(r);
				number = number / 10;
			}
			
		}
	
	}
	public class Number {

		
		public static void main(String[] args) {
			
			
			NumberDigits obj = new NumberDigits();
			obj.insert_value();
			obj.digit();
			
			
			

		}

	


	}

	
