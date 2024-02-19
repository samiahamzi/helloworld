import java.util.Random;

public class terningkast {
    public static void main(String[] args) {


        Random rand = new Random();

        int terningsvar = 0;
        int count = 0;


        while (!(terningsvar == 7)) {
            int Terning = rand.nextInt(6)+1;
            int Terning2 = rand.nextInt(6)+1;
            terningsvar = Terning + Terning2;
            System.out.println(Terning + " + " + Terning2 + " = " + terningsvar);
            count++;




        }
        System.out.println(count);
    }
}