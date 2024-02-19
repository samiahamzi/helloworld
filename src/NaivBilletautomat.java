import java.util.Scanner;

import static java.lang.Math.abs;


public class NaivBilletautomat {

    private int pris;
    private int saldo = 0;
    private int total = 0;

    Scanner input = new Scanner(System.in);

    public NaivBilletautomat (int billetpris){
        this.pris = billetpris;

    }

    public int getPris(){
        return pris;
    }

    public int getSaldo(){
        return saldo;
    }
    public void Indbetal(int kroner){
        this.saldo = saldo + kroner;
    }

    public int getTotal(){
        total = saldo - pris;
        return total;
    }

    public void printBillet(){


        System.out.println("Billet pris er " + getPris());
        System.out.println("din nuværende saldo er " + getSaldo());


        while(true){
            if (getTotal() < 0){
                System.out.println("Du mangler stadigvæk at indbetale " + abs(getTotal()));
                Indbetal(input.nextInt());

            }
            else{

                System.out.println("You have paid the full amount");
                break;

            }


        }

    }


}
