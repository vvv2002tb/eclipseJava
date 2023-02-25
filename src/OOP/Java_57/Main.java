package OOP.Java_57;

import java.awt.Choice;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double moneyPlayer = 5000f;
		Scanner sc = new Scanner(System.in);
		
		
		Locale lc = new Locale("us", "US");
		NumberFormat numf = NumberFormat.getInstance(lc);
		int choice = 0;
		
		do {
			System.out.println("----------Moi ban lua chon----------");
			System.out.println("Chon (1) de tiep tuc choi.");
			System.out.println("Chon (2) de thoat.");
			System.out.print("Lua chon cua ban: ");
			choice = sc.nextInt();
			if (choice == 2)  {
				System.err.print("ban da thoat");
				System.exit(0);
			}
			if(choice == 1) {
				System.out.println("----------Bat dau choi----------");
				System.out.println("So du: " + numf.format(moneyPlayer) + "$, ban muon cuoc bao nhieu?");
				double mucCuoc = 0;
				do {
					
					System.out.print("Dat cuoc (0<sotiencuoc<= " + numf.format(moneyPlayer) +"$): ");
					 mucCuoc = sc.nextDouble();
				} while (mucCuoc <= 0 || mucCuoc > moneyPlayer);
				
				int luaChonTaiXiu = 0;
				do {
					
					System.out.print("Chon (1) Tai, Chon (2) Xiu: ");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int value1 = xucXac1.nextInt(5) + 1;
				int value2 = xucXac1.nextInt(5) + 1;
				int value3 = xucXac1.nextInt(5) + 1;
				
				int tong = value1 + value2 + value3;
				
				
				System.out.println("Ketqua: " + value1 + " - " + value2 +  " - " + value3 );
				
				if (tong >=3 && tong <= 10) {
					System.out.println("ket qua: XIU");
					if (luaChonTaiXiu == 2) {
						moneyPlayer += mucCuoc*0.95;
						System.out.println("Ban da thang +" + mucCuoc*1.95);
						System.out.println("So Du: " + numf.format(moneyPlayer));
					} else {
						moneyPlayer -= mucCuoc;
						System.err.println("Ban da thua!");
						System.out.println("So Du: " + numf.format(moneyPlayer));
					}
					
				} else {
					System.out.println("ket qua: Tai");
					if (luaChonTaiXiu == 1) {
						moneyPlayer += mucCuoc*0.95;
						System.out.println("Ban da thang +" + mucCuoc*0.95);
						System.out.println("So Du: " + numf.format(moneyPlayer));
					} else {
						moneyPlayer -= mucCuoc;
						System.err.println("Ban da thua!");
						System.out.println("So Du: " + numf.format(moneyPlayer));
					}
				}
				
			}
		} while (choice == 1); 
	}
}
