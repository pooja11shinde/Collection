import java.util.Scanner;
public class sumofDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				int mul = 1, r ;
				while (num != 0) {
		r = num % 10 ;
		num = num/10 ;
		mul = mul*r ;
		
		//sum = sum + r;
		//div = div/ r;
		//sub = sub - r;
				}
				System.out.println("Mul of the digits :: " + mul);
				
		// TODO Auto-generated method stub

	}

}
