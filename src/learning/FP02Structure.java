package learning;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP02Structure {

	public static void main(String[] args) {
		
		List<Integer> numbers = (List.of(1,6,9,4,3));
		//int sum = addListStructure(numbers);
		//System.out.println(sum);
		//int result  = sumOfOddNumbersinList(numbers);
		//System.out.println(result);	
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker");
		//printSortedOrderForCourse(courses);
		//printCourseByLength(courses);
		//printDistinctNumbers(numbers);
		//List<Integer> doubles = doubleTheList(numbers);
		//doubles.stream().forEach(System.out::println);
		//List<Integer> evenNumberList = evenNumberedList(numbers);
		//evenNumberList.stream().forEach(System.out::println);
		List<Integer> courseLength = CourseTitleLength(courses);
		courseLength.stream().forEach(System.out::println);
		
	}
	
	
	
	private static List<Integer> CourseTitleLength(List<String> courses) {
		return courses.stream().map(num -> num.length()).collect(Collectors.toList());
	}



	private static List<Integer> evenNumberedList(List<Integer> numbers) {
		return numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
	}


	private static List<Integer> doubleTheList(List<Integer> numbers) {
		return numbers.stream().map( num -> num * num).collect(Collectors.toList());
	}


	private static void printCourseByLength(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
	}


	private static void printSortedOrderForCourse(List<String> courses) {
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
	}


	private static void printDistinctNumbers(List<Integer> numbers) {
		numbers.stream().sorted().distinct().forEach(System.out::println);
		
	}


	private static int sumOfOddNumbersinList(List<Integer> numbers) {
		return numbers.stream().filter(num -> num % 2 == 1).reduce(0, (a, b) -> a+b);
		
	}


	private static int sum(int a, int b) {
		return a + b;
	}

	private static int addListStructure(List<Integer> numbers) {
	
		//return numbers.stream().reduce(0, FP02Structure::sum);
		//return numbers.stream().reduce(0, (x, y) -> x + y);
		//return numbers.stream().reduce(0, (x, y) -> { return (x + y);});
		return numbers.stream().reduce(0, Integer::sum);
	}
	
	

}
