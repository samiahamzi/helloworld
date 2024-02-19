public class Tid {
    public static void main(String[] args) {
        int Sekunder = 35;
        int Minutter = 10;
        int Timer = 11;
        int SidenMidnat = ((Timer*60*60)+(Minutter*60)+Sekunder);
        int IndtilMidnat = ((12*60*60)+(49*60)+25);
        int MinutBrugt = 26;
        int TimeBrugt = 0;
        int MinutEfter = 36;


        System.out.println(Sekunder);
        System.out.println(Minutter);
        System.out.println(Timer);
        System.out.println("Der er gået " + SidenMidnat + " sekunder siden midnat.");
        System.out.println("Der er " + IndtilMidnat + " sekunder indtil midnat.");
        System.out.println("Opgaven blev startet klokken: " + Timer + ":" + Minutter);
        System.out.println("Der er blevet brugt " + MinutBrugt + " minutter på opgaven.");
        System.out.println("klokken er " + Timer + ":" + MinutEfter + " og opgaven er færdig.");
    }
}
