import java.util.Scanner;

public class Portoberegning {
    public static void main(String[] args) {

        System.out.print("Indtast pakkens vægt:");
        Scanner input = new Scanner(System.in);
        //int vægt = input.nextInt();
        int vægt = input.nextInt();
        int pris = 0;




        if (vægt <= 0)    {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        } else if ( vægt < 100)  {
            pris = 25;System.out.println("levering vil koste " + pris + "kr.");

        } else if ( vægt < 250) {
            pris = 50;
            System.out.println("levering vil koste " + pris + "kr.");

        } else if (vægt < 500) {
            pris = 75;
            System.out.println("levering vil koste " + pris + "kr.");
        }

        else  {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        }


    }
}
