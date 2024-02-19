import java.util.Random;

public class Terning {
    Random rand = new Random();
    int MAX = 6;
    int faceValue = rand.nextInt(MAX)+1;



    public void roll(){
        faceValue = rand.nextInt(MAX)+1;
    }

}
