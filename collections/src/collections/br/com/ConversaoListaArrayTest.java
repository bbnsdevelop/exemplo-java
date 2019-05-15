package collections.br.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoListaArrayTest {
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		numeros.forEach(n ->{
			System.out.println("numeros - " + n);
		});
		
		Integer[] numerosArray = new Integer [numeros.size()];
		
		List<Integer> numerosList = new ArrayList<Integer>(Arrays.asList(numerosArray));
		numerosList.add(6);
		
		System.out.println(Arrays.toString(numerosArray));
		
		System.out.println(numerosList.toString());
		
	}

}
