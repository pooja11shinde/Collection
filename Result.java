import java.util.Scanner;

class Result {
	int marathi;
	int english;
	int hindi;
	int maths;
	int chemistry;
	int total;
	double percentage;
	float average;
	char grade;
	
	void insert(int m, int e, int h, int m1, int c) {
       marathi = m;
english = e;
hindi = h;
maths = m1;
chemistry = c;
}
	
	void total() {
		total = marathi + english + hindi + maths + chemistry;
		System.out.println("Total Marks Of Each Subject: " + total);
	}
	
	void avg() {
		average = (marathi + english + hindi + maths + chemistry)/5;
		System.out.println("Average of Total Subject: " + average);
	}
	
	void percentage() {
		percentage = ((double)total/500*100);
		System.out.println("Percentage of Total Subject: " + percentage);
	}
	
	void grade() {
		System.out.println("The Students Grades: ");
		if(percentage >= 80) {
			System.out.println("Grade is A");
		}
		
		else if(percentage >= 60 && percentage < 80) {
			System.out.println("Grade is B");
		}
		else if(percentage >= 40 && percentage < 60) {
			System.out.println("Grade is C");
		}

		else if(percentage <= 40) {
			System.out.println("Grade is D");
		}
		
		else {
			System.out.println("You Are Fail");
		}
	}
	

//class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Result res = new Result();
		
		int m,e,h,m1,c;
		System.out.println("Enter marks of marathi: ");
		m = sc.nextInt();
		
		System.out.println("Enter marks of english: ");
		e = sc.nextInt();
		
		System.out.println("Enter marks of hindi: ");
		h = sc.nextInt();
		
		System.out.println("Enter marks of maths: ");
		m1 = sc.nextInt();
		
		System.out.println("Enter marks of chemistry: ");
		c = sc.nextInt();
		
		res.insert(m,e,h,m1,c);
		
		res.total();
		res.avg();
		res.percentage();
		res.grade();

	}

}

