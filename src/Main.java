import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int fizik,kimya,biyoloji,muzik,mat,not = 0;

        Scanner log=new Scanner(System.in);

        System.out.println("Fizik notunu giriniz.");
        fizik=log.nextInt();

        System.out.println("Kimya notunu giriniz.");
        kimya=log.nextInt();

        System.out.println("Biyoloji notunu giriniz.");
        biyoloji=log.nextInt();

        System.out.println("Muzik notunu giriniz.");
        muzik=log.nextInt();

        System.out.println("Matematik notunu giriniz.");
        mat=log.nextInt();

        double ort= (fizik+kimya+biyoloji+muzik+mat)/5;
        System.out.println("Ortalamanız: "+ort);



        if(ort<=54){
            System.out.println("Sinifta Kaldiniz");

        }else {
            System.out.println("Tebrikler gectiniz.");

        }





    }
}
