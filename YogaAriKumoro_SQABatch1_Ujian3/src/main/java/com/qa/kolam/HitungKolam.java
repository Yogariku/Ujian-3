package com.qa.kolam;

public class HitungKolam {
	
	//keliling kolam = 4 (p+l+t)
	public double kelilingKolam (double panjang , double lebar, double tinggi) {
		
		return 4 * (panjang+lebar+tinggi);
	}
	
	//volume kolam = pxlxt
	public double volumeKolam (double panjang, double lebar, double tinggi) {
				
		return panjang*lebar*tinggi;
	}
}
