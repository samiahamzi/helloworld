import java.util.Scanner;

public class Tommeberegner {
    public static void main(String[] args) {

        System.out.print("Indtast en længde i tommer: ");
    //Double input
        Scanner input = new Scanner(System.in);
        double Inch  = input.nextDouble();
        final double CM_PR_INCH = 2.54;
        double centimeter = (Inch*CM_PR_INCH);


        System.out.println(Inch + " tommer svarer til " + centimeter + " centimeter");




}
}


