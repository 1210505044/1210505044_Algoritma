import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomNum = new Random();
        int sayilar[] =new int[10000];
        for (int i=0;  i<10000;i++){
            sayilar[i] = randomNum.nextInt(10001);
        }

        int enbuyuk= sayilar[0];
        for(int i=0 ; i< sayilar.length; i++){
            if (enbuyuk<sayilar[i]){
                enbuyuk = sayilar[i];
            }
        }

        System.out.println(enbuyuk);

        long TBasla= System.nanoTime();
        long TBit = System.nanoTime();
        long RunTime = TBit - TBasla;
        System.out.println("Çalışma süresi="+RunTime);


    }
}
