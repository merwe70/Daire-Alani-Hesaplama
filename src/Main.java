import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner input= new Scanner(System.in);
        System.out.println("Yarıçap giriniz : ");
        int yaricap =input.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz : ");
        int aciOlcüsü = input.nextInt();

        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        double sonuc = (pi * (yaricap*yaricap)*aciOlcüsü)/360;
        System.out.println("Daire diliminin alanı : " + sonuc);
        }
    }
