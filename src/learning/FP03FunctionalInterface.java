package learning;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP03FunctionalInterface {

	public static void main(String[] args) {

		List<Integer> number = List.of(2,8,3,5,7);
		int sum = number.stream().reduce(0, sumBinaryOperator1);
		System.out.println(sum);

	}

	private static BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
	
	private static  BinaryOperator<Integer> sumBinaryOperator1 = new BinaryOperator<Integer>() {

		@Override
		public Integer apply(Integer t, Integer u) {
			// TODO Auto-generated method stub
			return t+u;
		}
	};

}
