
import java.util.Scanner;

public  class VucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        double kilo,boy;
        double indeks;

        System.out.println("kilonuzu giriniz:");
        kilo= inp.nextDouble();

        System.out.println("boyunuzu giriniz:");
        boy= inp.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.println("vucüt kitle indeksiniz:"+indeks);
    }
}
