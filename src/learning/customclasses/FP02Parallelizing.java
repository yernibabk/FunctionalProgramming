package learning.customclasses;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FP02Parallelizing {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		
		System.out.println(System.currentTimeMillis()-time);//without parallel: 911 milisecs  - with parall :310

	}

}
