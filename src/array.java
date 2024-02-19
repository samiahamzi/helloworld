import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] number = new int[8];
        number[0] = 34;
        number[7] = 117;


        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        String[] word = new String[3];
        word[0] = "Hej";
        word[1] = "med";
        word[2] = "dig";
        System.out.println();
        for (String ekek : word){
            System.out.print(ekek + " ");
        }
        System.out.println();


        ArrayList<String> ord = new ArrayList<>();
        ord.add("Hej");
        ord.add("med");
        ord.add("dig");
        for (String navn : ord) {
            System.out.print(navn + " ");


        }

        double[] tal = {3.4, 2.5, 1.2, 6.7};
        System.out.println();

        System.out.println(tal[2]);
        System.out.println(tal.length);
    }
}
