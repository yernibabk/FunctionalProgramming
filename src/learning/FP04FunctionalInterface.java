package learning;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04FunctionalInterface {

	public static void main(String[] args) {

		List<Integer> number = List.of(2,8,3,5,7,9);
		//number.stream().filter(ThreeMultiplePredicate() ).forEach(System.out::println);
		//filterAndPrintNumber(number, n-> n%3 ==0);
	   List<Integer> sqrNumber = mapAndCreateNewList(number, n -> n * n );
	   List<Integer> quebeNumber = mapAndCreateNewList(number, n -> n * n * n);
	   System.out.println(quebeNumber);

	}

	private static List<Integer> mapAndCreateNewList(List<Integer> number, Function<Integer, Integer> mapFunction) {
		return number.stream().map(mapFunction).collect(Collectors.toList());
	}

	
	

//	private static void squareTheGivenNumber(List<Integer> number, Function<? super Integer> function) {
//		number.stream().map(function).forEach(System.out::println);
//		
//	}

	private static void filterAndPrintNumber(List<Integer> number, Predicate<? super Integer> predicate) {
		number.stream().filter(predicate).forEach(System.out::println);
		
	}

	private static Predicate<? super Integer> ThreeMultiplePredicate() {
		return num -> num%3 == 0;
	}

}
