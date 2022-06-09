
public class Zadatak {
	
	/*
	 * Racuna sumu kvadrata prvih n elemenata
	 * 
	 * n treba da bude pozitivni broj;
	 * 
	 *
	 */
	
	public int sumaKvadrata(int n) {
		int suma = 0;
		for(int i = 0; i < n; i++) {
			suma = i*i;
		}
		return suma;
	}

}
