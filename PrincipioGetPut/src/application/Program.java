package application;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/*método que copia os elementos de uma lista para uma
outra lista que pode ser mais genérica que a primeira.*/
public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}
	
	public static void covariancia() {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		//list.add(20); Obs: erro de compilação
		
		/*
		 * get - OK
		 * put - ERROR
		*/
	}
	
	public static void contravariancia() {
		
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Eduardo");
		myObjs.add("José");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		//Number x = myNums.get(0); Obs: erro de compilação
		
		/*
		 * get - ERROR
		 * put - OK
		*/
	}
}
