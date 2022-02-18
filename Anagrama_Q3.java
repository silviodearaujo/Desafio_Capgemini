package q3.anagrama;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrama_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entrada:");
		String palavra = scan.next();

		System.out.println("Saída:");
		validadorAnagrama(palavra);

		scan.close();

	}

	static void validadorAnagrama(String palavra) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i; j < palavra.length(); j++) {
				char[] letras = palavra.substring(i, j + 1).toCharArray();
				Arrays.sort(letras);
				String letra = new String(letras);
				if (map.containsKey(letra))
					map.put(letra, map.get(letra) + 1);
				else
					map.put(letra, 1);
			}
		}
		int contagemAnagrama = 0;
		for (String anagrama : map.keySet()) {
			int q = map.get(anagrama);
			contagemAnagrama += (q * (q - 1)) / 2;
		}
		System.out.println(contagemAnagrama);
	}

}
