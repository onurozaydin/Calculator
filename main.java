package java101;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		 int num1, num2, choose;

	        Scanner inp = new Scanner(System.in);

	        System.out.print("1. Sayıyı giriniz: ");
	        num1 = inp.nextInt();

	        System.out.print("2. Sayıyı giriniz: ");
	        num2 = inp.nextInt();

	        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
	        System.out.print("Seçiminiz: ");
	        choose = inp.nextInt();

	        switch (choose) {
	            case 1:
	                System.out.println("Toplam: " + (num1 + num2));
	                break;
	            case 2:
	                System.out.println("Çıkarma: " + (num1 - num2));
	                break;
	            case 3:
	                System.out.println("Çarpma: " + (num1 * num2));
	                break;
	            case 4:
	                if (num2 == 0) {
	                    System.out.println("Bir sayı 0'a bölünemez!");
	                    break;
	                }
	                System.out.println("Bölme: " + (num1 / num2));
	                break;
	            default:
	                System.out.println("Yanlış seçim yaptınız!");

	}

}
}
