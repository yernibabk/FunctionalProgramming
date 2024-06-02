package learning;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FP05FunctionalInterface {

	public static void main(String[] args) {

		//List<Integer> number = List.of(2,8,3,5,7,9);
		//System.out.println(randomIntegerSupplier.get());
		
//		UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
//		System.out.println(unaryOperator.apply(10));
//		
//		BiPredicate<Integer, String> biPredicate = (num, str) -> {
//			return num > 10 && str.length()>5;
//		};
//		
//		System.out.println(biPredicate.test(20, "yernibabu"));
		
		BiFunction<Integer, String, String> biFunction = (num, str) -> {
			return num + " " + str;
		};
		
		System.out.println(biFunction.apply(20, "I'm_Bi_Function"));
		
		
		BiConsumer<Integer, String> biConsumer = (num, str) -> {
			System.out.println(num);
			System.out.println(str);
		};
		
		biConsumer.accept(30, "testing");

	}

	private static Supplier<Integer> randomIntegerSupplier = () -> {
		Random random = new Random();
		return random.nextInt(1000);
	};
	


}
