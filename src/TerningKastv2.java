public class TerningKastv2 {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        int throw1 = terning1.faceValue;
        int throw2 = terning2.faceValue;
        int throwamount = 1;


        while (true) {
            System.out.println(throw1 + " + " + throw2);



            if (throw1 == 1 && throw2 == 1) {
                System.out.println("Snake eyes!");
                break;
            }
            terning1.roll();
            terning2.roll();
            throw1 = terning1.faceValue;
            throw2 = terning2.faceValue;
            throwamount++;

        }
        System.out.println("you rolled " + throwamount + " times!");
    }
}