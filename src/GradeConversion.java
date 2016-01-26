import java.util.Scanner;

public class GradeConversion {

	public static void main(String[] args) {
		// enter a welcome message for the user

		System.out.println("Letter Grade Converter");
		System.out.println();

		int grade = 0;
		char letterGrade;

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// ask user to Enter their test score
			
			System.out.print("Enter your numerical grade (whole numbers only): ");
			
			//if user enters non-numeric data, the following try..catch statement will catch this and reloop the loop
			try {
				grade = Integer.parseInt(sc.nextLine());
			} catch (RuntimeException e) {
				System.out.println();
				System.out.println("Whoops! The data you entered was entered incorrectly.");
				System.out.println();
				continue;
			}
			//if user enters numeric data, the following loop executes to determine letter grade based on a range of values
			if (grade >= 0) {
				if (grade <= 100 && grade >= 88) {
					letterGrade = 'A';
					System.out.println("Grade: " + letterGrade);
				} else if (grade < 88 && grade >= 80) {
					letterGrade = 'B';
					System.out.println("Grade: " + letterGrade);
				} else if (grade < 80 && grade >= 67) {
					letterGrade = 'C';
					System.out.println("Grade: " + letterGrade);
				} else if (grade < 67 && grade >= 60) {
					letterGrade = 'D';
					System.out.println("Grade: " + letterGrade);
				} else if (grade < 60) {
					letterGrade = 'F';
					System.out.println("Grade: " + letterGrade);
				} else if(grade < 0 || grade > 100) {
					System.out.println("Please enter a numeric value between 0 and 100 only.");
					System.out.println();
					continue;
				}
				System.out.println("");
			}
			// ask user if they want to continue
			System.out.print("Would you like to continue? (y/n): ");
			choice = sc.nextLine();
		}
		System.out.println("Bye!");
	}
}

/*
 * else if (!sc.hasNextInt()) { System.out.println(
 * "Whoops! You entered invalid numerical data. Enter a numeric grade: "); grade
 * = Integer.parseInt(sc.nextLine());
 * 
 * if (grade <= 100 && grade >= 88) { letterGrade = 'A';
 * System.out.println("Grade: " + letterGrade); } else if (grade < 88 && grade
 * >= 80) { letterGrade = 'B'; System.out.println("Grade: " + letterGrade); }
 * else if (grade < 80 && grade >= 67) { letterGrade = 'C';
 * System.out.println("Grade: " + letterGrade); } else if (grade < 67 && grade
 * >= 60) { letterGrade = 'D'; System.out.println("Grade: " + letterGrade); }
 * else if (grade < 60) { letterGrade = 'F'; System.out.println("Grade: " +
 * letterGrade); } } //ask the user if they want to continue
 * System.out.println("Continue? (y/n): "); choice = sc.nextLine();
 * System.out.println(); } System.out.println("Bye!"); } }
 */

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * // ask user to enter their score
 * System.out.println("Enter your test score: ");
 * 
 * int grade = Integer.parseInt(sc.nextLine()); char letterGrade; do { switch
 * (grade) { case grade < 100: letterGrade = 'A';
 * System.out.println(letterGrade); break; case 87 - 80: letterGrade = 'B';
 * System.out.println(letterGrade); break; case : letterGrade = 'C';
 * System.out.println(letterGrade); break; case 66 - 60: letterGrade = 'D';
 * System.out.println(letterGrade); break; case 60 - 0: letterGrade = 'F';
 * System.out.println(letterGrade); break; } } while (sc.hasNextInt()); } }
 */
