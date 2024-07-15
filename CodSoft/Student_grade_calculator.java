import java.util.Scanner;
//Method for calculating the sun of marks obtained by student
public class Student_grade_calculator {
    public static int Sum(int ...Mark){
        int sum = 0;
        for (int Marks: Mark){
            sum += Marks;
        }
        return sum;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks obtained in Maths");
        int Maths_marks = input.nextInt();
        System.out.println("Enter the marks obtained in Physics");
        int Physics_marks = input.nextInt();
        System.out.println("Enter the marks obtained in Chemistry");
        int Chemistry_marks = input.nextInt();
        System.out.println("Enter the marks obtained in Biology");
        int Biology_marks = input.nextInt();
        System.out.println("Enter the marks obtained in English");
        int English_marks = input.nextInt();
        int Total_Marks = Sum(Maths_marks,Physics_marks,Chemistry_marks,Biology_marks,English_marks);
        int Percentage = Total_Marks/5;
        System.out.println("Total marks for the given subjects is "+ Total_Marks);
        System.out.println("Average percentage of the subjects "+Percentage+"%");
        char Grade = ' ';
        if (Percentage<33.33){
            Grade = 'F';
            System.out.println("Grade achieved by student is "+Grade);
        } else if (Percentage>33.33 && Percentage<40) {
            Grade = 'E';
            System.out.println("Grade achieved by student is "+Grade);
        } else if (Percentage>40 && Percentage<60) {
            Grade = 'D';
            System.out.println("Grade achieved by student is "+Grade);
        } else if (Percentage>60 && Percentage<80) {
            Grade = 'C';
            System.out.println("Grade achieved by student is "+Grade);
        } else if (Percentage>80 && Percentage<90)  {
            Grade = 'B';
            System.out.println("Grade achieved by student is "+Grade);
        } else {
            Grade = 'A';
            System.out.println("Grade achieved by student is "+Grade);
        }
    }
}
