import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
    private static final boolean Answered = false;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Timer tm = new Timer();
        int correctAnswer = 0;
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                if (!Answered) {
                    System.out.println("\n Times up!!");
                    System.exit(0);
                }
            }
        };
        System.out.println("You have 15 seconds to answer the following each question");
        System.out.println("choose in which type of quiz you wants to attend");
        System.out.println("1. General Science");
        System.out.println("2. General Knowledge");
        System.out.println("3. History");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Wow !! you selected General Science, its a good choice");
                //question 1
                System.out.println("Which planet is known as red planet");
                System.out.println("Options: ");
                System.out.print(" 1.Earth\n 2.Mars\n 3.Jupiter\n 4.Uranus\n");
                tm.schedule(tt,15000);
                int Q1O = sc.nextInt();
                if (Q1O == 2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //question 2
                System.out.println("Which element has Atomic number 1");
                System.out.println("Options: ");
                System.out.print(" 1.Hydrogen\n 2.Uranium\n 3.Potassium\n 4.None of These\n");
                int Q2O = sc.nextInt();
                if (Q2O == 1) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //question 3
                System.out.println("Study of living organism called ?");
                System.out.println("Options: ");
                System.out.print(" 1.History\n 2.Thermodynamics\n 3.Equilibrium\n 4.Biology\n");
                int Q3O = sc.nextInt();
                if (Q3O == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 4
                System.out.println("What is the powerhouse of cell");
                System.out.println("Options: ");
                System.out.print(" 1.Nucleus\n 2.Vacuole\n 3.Cell Wall\n 4.Mitochondria\n");
                int Q4O = sc.nextInt();
                if (Q4O == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 5
                System.out.println("Which element element is radioactive");
                System.out.println("Options: ");
                System.out.print(" 1.Hydrogen\n 2.Uranium\n 3.Potassium\n 4.Iron\n");
                int Q5O = sc.nextInt();
                if (Q5O == 2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 6
                System.out.println("Who Purposed theory of relativity ?");
                System.out.println("Options: ");
                System.out.print(" 1.Albert Einstein\n 2.Stephen Hawking\n 3.J.Carles\n 4.JJ Thomson\n");
                int Q6O = sc.nextInt();
                if (Q6O == 1) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 7
                System.out.println("What is the hardest natural substance on Earth ?");
                System.out.println("Options: ");
                System.out.print(" 1.Graphite\n 2.Sandstone\n 3.Igneous Stone\n 4.Diamond\n");
                int Q7O = sc.nextInt();
                if (Q7O == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 8
                System.out.println("What is the smallest unit of Matter ?");
                System.out.println("Options: ");
                System.out.print(" 1.Molecule\n 2.Atom\n 3.Quartz\n 4.None of these\n");
                int Q8O = sc.nextInt();
                if (Q8O == 2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 9
                System.out.println("What is the largest planet in our solar system");
                System.out.println("Options: ");
                System.out.print(" 1.Earth\n 2.Jupiter\n 3.Saturn\n 4.Mars\n");
                int Q9O = sc.nextInt();
                if (Q9O == 2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 10
                System.out.println("Who known as the father of physics");
                System.out.println("Options: ");
                System.out.print(" 1.Albert Einstein\n 2.Stephen Hawking\n 3.Issac Newton\n 4.JJ Thomson\n");
                int Q10O = sc.nextInt();
                if (Q10O == 3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                System.out.println(correctAnswer + " Is your Score out of 10");
                break;
            case 2:
                System.out.println("Wow !! you selected General Knowledge, its a good choice");
                //question 1
                System.out.println("In Which country you find Great founder reef");
                System.out.println("Options: ");
                System.out.print(" 1.France\n 2.India\n 3.USA\n 4.Australia\n");
                tm.schedule(tt,15000);
                int Q1OA = sc.nextInt();
                if (Q1OA == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //question 2
                System.out.println("Which is the smallest country in the world by land ");
                System.out.println("Options: ");
                System.out.print(" 1.Azerbaijan\n 2.Armenia\n 3.Vatican City\n 4.Bhutan\n");
                int Q2OA = sc.nextInt();
                if (Q2OA == 3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //question 3
                System.out.println("In which year did the Titanic sink ?");
                System.out.println("Options: ");
                System.out.print(" 1.1963\n 2.1972\n 3.1912\n 4.2007\n");
                int Q3OA = sc.nextInt();
                if (Q3OA == 3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 4
                System.out.println("How many continents on Earth ?");
                System.out.println("Options: ");
                System.out.print(" 1.3\n 2.5\n 3.9\n 4.7\n");
                int Q4OA = sc.nextInt();
                if (Q4OA == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 5
                System.out.println("What is currency of japan ?");
                System.out.println("Options: ");
                System.out.print(" 1.Yen\n 2.Rupee\n 3.Japanese Dollar\n 4.Yen\n");
                int Q5OA = sc.nextInt();
                if (Q5OA == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 6
                System.out.println("Who Discovered Penicillin ?");
                System.out.println("Options: ");
                System.out.print(" 1.Alexander Flemming\n 2.Hund's\n 3.Faraday\n 4.JJ Thomson\n");
                int Q6OA = sc.nextInt();
                if (Q6OA == 1) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 7
                System.out.println("Longest river on Earth ?");
                System.out.println("Options: ");
                System.out.print(" 1.Amazon\n 2.Ganga\n 3.Brahmaputra\n 4.Nile\n");
                int Q7OA = sc.nextInt();
                if (Q7OA == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 8
                System.out.println("Who is the father of computer ?");
                System.out.println("Options: ");
                System.out.print(" 1.Charles Babbage\n 2.Newton\n 3.D.ritchee\n 4.None of these\n");
                int Q8OA = sc.nextInt();
                if (Q8OA == 1) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 9
                System.out.println("What is the largest planet in our solar system");
                System.out.println("Options: ");
                System.out.print(" 1.Earth\n 2.Jupiter\n 3.Saturn\n 4.Mars\n");
                int Q9OA = sc.nextInt();
                if (Q9OA == 2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 10
                System.out.println("Who known as the father of physics");
                System.out.println("Options: ");
                System.out.print(" 1.Albert Einstein\n 2.Stephen Hawking\n 3.Issac Newton\n 4.JJ Thomson\n");
                int Q10OA = sc.nextInt();
                if (Q10OA == 3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                System.out.println(correctAnswer + " Is your Score out of 10");
                break;
            case 3:
                System.out.println("Wow !! you selected History, its a good choice");
                //question 1
                System.out.println("When was the Declaration of Independence signed?");
                System.out.println("Options: ");
                System.out.print(" 1.July 4,1776\n 2.August 2,1776\n 3.September 17,1787\n 4.June 21,1788\n");
                tm.schedule(tt,15000);
                int Q1OB = sc.nextInt();
                if (Q1OB ==2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //question 2
                System.out.println("The United States bought Alaska from which country?");
                System.out.println("Options: ");
                System.out.print(" 1.Canada\n 2.Norway\n 3.Russia\n 4.Sweden\n");
                int Q2OB = sc.nextInt();
                if (Q2OB ==3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //question 3
                System.out.println("Who was the fourth president of the United States?");
                System.out.println("Options: ");
                System.out.print(" 1.Thomas Jefferson\n 2.James Madison\n 3.John Adams\n 4.Benjamin Franklin\n");
                int Q3OB = sc.nextInt();
                if (Q3OB ==2) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 4
                System.out.println("Which era marked a switch from agricultural practices to industrial practices?");
                System.out.println("Options: ");
                System.out.print(" 1.The Renaissance\n 2.The Enlightenment\n 3.The Industrial Revolution\n 4.The Victorian Era\n");
                int Q4OB = sc.nextInt();
                if (Q4OB ==3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 5
                System.out.println("What was the name of the series of programs and projects President Franklin D. Roosevelt enacted during The Great Depression?");
                System.out.println("Options: ");
                System.out.print(" 1. The New Frontier\n 2.The Great Society\n 3. The New Deal\n 4.The Fair Deal\n");
                int Q5OB = sc.nextInt();
                if (Q5OB == 3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 6
                System.out.println("The 19th Amendment guarantees ____ the right to vote.");
                System.out.println("Options: ");
                System.out.print(" 1.The Men\n 2.Immigrants\n 3.Africans Americans\n 4.Women\n");
                int Q6OB = sc.nextInt();
                if (Q6OB == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 7
                System.out.println("Which four presidents are on Mount Rushmore?");
                System.out.println("Options: ");
                System.out.print(" 1.George Washington, Abraham Lincoln, Thomas Jefferson, and Theodore Roosevelt\n 2.John F. Kennedy, Ronald Reagan, Bill Clinton, and Barack Obama\n 3.Franklin D. Roosevelt, Harry S. Truman, Dwight D. Eisenhower, and Lyndon B. Johnson\n 4.Richard Nixon, Gerald Ford, Jimmy Carter, and George H.W. Bush\n");
                int Q7OB = sc.nextInt();
                if (Q7OB == 1) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 8
                System.out.println("Who was the first woman to make a million dollars in the United States?");
                System.out.println("Options: ");
                System.out.print(" 1.Amelia Earhart\n 2.Susan B. Anthony\n 3.Harriet Tubman\n 4.Madam C.J. Walker\n");
                int Q8OB = sc.nextInt();
                if (Q8OB == 4) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 9
                System.out.println("Which year was George H.W. Bush elected president?");
                System.out.println("Options: ");
                System.out.print(" 1.1980\n 2.1984\n 3.1988\n 4.1992\n");
                int Q9OB = sc.nextInt();
                if (Q9OB == 3) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                //Question 10
                System.out.println("What do the stripes on the American flag represent?");
                System.out.println("Options: ");
                System.out.print(" 1.The 13 original colonies\n 2.The 50 states\n 3.The Founding Fathers\n 4.The Revolutionary War battles\n");
                int Q10OB = sc.nextInt();
                if (Q10OB == 1) {
                    System.out.println("Correct Answer!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong Answer");
                }
                System.out.println(correctAnswer + " Is your Score out of 10");
                break;

            case 4:
                System.out.println("You successfully Exit the Quiz !! ");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

