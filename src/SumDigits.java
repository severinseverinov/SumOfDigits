import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int number,digit=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        number=input.nextInt();

        while(number!=0){
            digit+=(number%10);
            number/=10;
        }

        System.out.println("Girilen sayının basamak rakamlarının toplamı = "+digit);
    }
}
