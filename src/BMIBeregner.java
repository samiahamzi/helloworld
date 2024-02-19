import java.util.Scanner;

import static java.lang.Math.pow;

public class BMIBeregner {
    public static void main(String[] args) {

        System.out.print("Her kan du beregne din BMI. Indtast din højde og derefter vægt.");
        //Double input
        Scanner input = new Scanner(System.in);
        double height  = input.nextDouble();
        double kg = input.nextDouble();
        double bmi = kg/pow(height, 2);

        System.out.println("Din BMI er: " + bmi);

        String vaegt;

        if (bmi < 18.5)    {
        vaegt = "undervægtig";
        } else if (bmi < 25)  {
            vaegt = "normalvægtig";

        } else if (bmi < 30) {
            vaegt = "overvægtig";

        } else  {
            vaegt = "svært overvægtig";
        }

        System.out.println("Du er " + vaegt);





    }
}


