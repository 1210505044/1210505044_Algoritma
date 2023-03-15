import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomNum = new Random();
        int sayilar[] =new int[10000];
        for (int i=0;  i<10000;i++){
            sayilar[i] = randomNum.nextInt(10001);
        }
        for(int j=1 ; j <10000;j++){
            for(int i = 0; i<10000-j;i++){

                if(sayilar[i]>sayilar[i+1]){
                    int degistir;
                    degistir =sayilar[i];
                    sayilar[i]=sayilar[i+1];
                    sayilar[i+1]=degistir;

                }
            }
        }
        for (int i=0 ; i<10000; i++){

            System.out.print(sayilar[i] +"-");

        }


        long TBasla= System.nanoTime();
        long TBit = System.nanoTime();
        long RunTime = TBit - TBasla;
        System.out.println("Çalışma süresi="+RunTime);


    }
}