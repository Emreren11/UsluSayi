import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int a,b,sonuc=1;

        System.out.print("Üstü alınacak sayı: ");
        a=inp.nextInt();

        System.out.print("Üst olacak sayı: ");
        b=inp.nextInt();

        for (int i=1; i<=b; i++)
        {
            sonuc*=a;
        }
        System.out.println(a+" sayısının "+b+" kuvveti: "+sonuc);
    }
}