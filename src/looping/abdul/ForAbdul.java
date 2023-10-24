package looping.abdul;

import java.util.Scanner;

public class ForAbdul {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//variabel
		char c;
		int angka;
		
		boolean yt = true;
		System.out.println();
		do{
			//input
			System.out.print("MASUKAN KARAKTER 'AbduL' : ");
			c = scan.next().charAt(0);
		    System.out.print("MASUKAN UKURAN 'AbduL' : ");
		    angka = scan.nextInt();
		    System.out.println();
	
		    //proses+output
		    for (int x = 1; x <= ((angka-1)*4)+6; x++){
				for (int y = 1; y <= ((angka-1)*18)+23; y++){
					if ((((y > (angka+1)-x && y < 3+((angka-1)*2)+x) || (y >= 6+((angka-1)*4) && y <= 6+((angka-1)*5)) 
					|| (y >= 14+((angka-1)*10) && y <= 14+((angka-1)*11)) || (y >= 16+((angka-1)*12) && y <= 16+((angka-1)*13)) 
					|| (y >= 19+((angka-1)*14) && y <= 19+((angka-1)*15)) || (y >= 21+((angka-1)*16) && y <= 21+((angka-1)*17))) && x <= angka) 
					|| ((y <= angka || (y >= 4+((angka-1)*2) && y <= 4+((angka-1)*3)) || (y >= 6+((angka-1)*4) && y <= 6+((angka-1)*5)) 
					|| ((y >= 6+((angka-1)*4) && y < 8+((angka-1)*6)+(x-angka-1) 
					|| y > 12+((angka-1)*9)-(x-angka-1) && y <= 14+((angka-1)*11)) && x > angka+1 && x <= angka*2+1) 
					|| (y >= 14+((angka-1)*10) && y <= 14+((angka-1)*11)) || (y >= 16+((angka-1)*12) && y <= 16+((angka-1)*13)) 
					|| (y >= 19+((angka-1)*14) && y <= 19+((angka-1)*15)) 
					|| (y >= 21+((angka-1)*16) && y <= 21+((angka-1)*17))) && x > angka && x <= angka*2+1) 
					|| ((y <= angka || (y >= 4+((angka-1)*2) && y <= 4+((angka-1)*3)) || (y <= 4+((angka-1)*3) && x > angka*2+1 && x <= angka*3+1) 
					|| (y >= 6+((angka-1)*4) && y <= 6+((angka-1)*5)) || (y >= 9+((angka-1)*6) && y <= 9+((angka-1)*7)) 
					|| (y >= 11+((angka-1)*8) && y <= 11+((angka-1)*9)) || (y >= 14+((angka-1)*10) && y <= 14+((angka-1)*11)) 
					|| (y >= 16+((angka-1)*12) && y <= 16+((angka-1)*13)) || (y >= 19+((angka-1)*14) && y <= 19+((angka-1)*15)) 
					|| (y >= 21+((angka-1)*16) && y <= 21+((angka-1)*17))) && x > angka*2+1 && x <= angka*3+2) || ((y <= angka 
					|| (y >= 4+((angka-1)*2) && y <= 4+((angka-1)*3)) || (y >= 6+((angka-1)*4) && y <= 9+((angka-1)*7)-(x-(angka*3)-2)) 
					|| (y >= 11+((angka-1)*8)+(x-(angka*3)-2) && y <= 14+((angka-1)*11)) 
					|| (y >= 16+((angka-1)*12)+(x-(angka*3)-2) && y <= 19+((angka-1)*15)-(x-(angka*3)-2)) 
					|| (y >= 21+((angka-1)*16))) && x > angka*3+2)){
						System.out.print(c+" ");
					}else {
						System.out.print("  ");
					}
			    }
			System.out.println();
			}
		    System.out.println();
		}while(yt==true);	

	}

}
