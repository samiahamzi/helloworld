import java.util.Scanner;
public class Ha {
    public static void main (String[] args) {

        int StudentAge = 20;
        double StudentGpa = 5.52;
        boolean HasPerfectAttendance = false;

        String studentfirstname = "Sami ";
        String studentlastname = "Ahamzi";
        char StudentFirstInitial = studentfirstname.charAt(0);
        char StudentLastInitial = studentlastname.charAt(0);
        String studentfullname = studentfirstname + studentlastname;

        System.out.println(HasPerfectAttendance);
        System.out.println(StudentAge);
        System.out.println(StudentGpa);
        System.out.println(StudentFirstInitial);
        System.out.println(StudentLastInitial);
        System.out.println("Hello World Again!");
        System.out.println(studentfirstname + " " + studentlastname + " Has a GPA of " + StudentGpa);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        StudentGpa = input.nextDouble();
        System.out.println(studentfullname + " now has a GPA of " + StudentGpa);



    }
}
