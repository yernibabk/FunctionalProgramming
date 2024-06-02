package learning.customclasses;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		
		System.out.println(Stream.of(12,3,7,4,2).reduce(0, Integer::sum));
		//int[] intArray = {4,5,65,3};
		//System.out.println(List.of(intArray).stream());
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		System.out.println(IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum());
		List lsitInts = IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList());
		System.out.println(lsitInts);
		System.out.println(IntStream.rangeClosed(1, 50).reduce(1, (x, y) -> x * y));
		System.out.println(LongStream.rangeClosed(1, 10).reduce(1, (x, y) -> x * y));
		System.out.println(LongStream.rangeClosed(1, 10).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
	}

}
