import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int i=1,sayi,toplam=0,bolen=0;
        double sonuc;

        System.out.println("Kaça kadar hesaplansın? ");
        sayi = giris.nextInt();
       while (i < sayi){
           if(i%3==0 && i%4==0){
               toplam += i;
               bolen++;
           }
           i++;
       }
       if (bolen==0){
           bolen=1;

       }
       sonuc = toplam / bolen;
        System.out.println("Sonuç = "+sonuc);






}
}
