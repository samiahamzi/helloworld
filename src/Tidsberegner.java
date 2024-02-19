import java.util.Scanner;
public class Tidsberegner {
    public static void main(String[] args) {


        //Integer input
        Scanner input = new Scanner(System.in);
        int timer  = input.nextInt();
        int minutter = input.nextInt();
        int sekunder = input.nextInt();

        //Tidsberegner fra input
        int sekundersidenmidnat = ((timer*60*60)+minutter*60)+sekunder;


        System.out.println("Der er gået " + sekundersidenmidnat + " sekunder siden midnat");


    }
}
