package polindrom_sayilar;

import java.util.Scanner;

public class polindrom_sayilar {

	static boolean polindrom(int a) {

		int x = a, tersSayi = 0, sonBasamak;

		while (x != 0) {

			sonBasamak = x % 10;
			tersSayi = (tersSayi * 10) + sonBasamak;
			x /= 10;
		}

		if (a == tersSayi) {
			System.out.println(a + " polindrom sayıdır.");
			return true;
		} else {
			System.out.println(a + " polindrom sayı değildir.");
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayı girin: ");
		int sayi = scan.nextInt();
		
		System.out.println(polindrom(sayi));

	}

}
