package learning;
import java.util.List;

public class FP01Structure {

	public static void main(String[] args) {
		
		//printAllNumbersInListFuctional(List.of(1,6,9,4,3));
		//printEvenNumbersInListFuctional(List.of(1,6,9,4,3));
		//printOldNumberInListFunctional(List.of(1,6,9,4,3));
		//printAllCourses(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker"));
		//courseWith4Letters(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker"));
		//printSquresOfEvenNumber(List.of(1,6,9,4,3));
		printTheNumberOfCharsInCourse(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker"));
		
	}
	
	private static void printTheNumberOfCharsInCourse(List<String> courses) {
		courses.stream().map(course -> course.length()).forEach(System.out::println);
		
	}

	private static void printSquresOfEvenNumber(List<Integer> numbers) {
		
		numbers.stream().filter( num -> num % 2 == 0).map( num -> num * num).forEach(System.out::println);
	}


	private static void printAllCourses(List<String> courses) {
		
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}

	private static void courseWith4Letters(List<String> courses) {
		
		courses.stream().filter(course -> course.length() >=4).forEach(System.out::println);
	}


	private static void printOldNumberInListFunctional(List<Integer> nums) {
		nums.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFuctional(List<Integer> nums) {
		
		nums.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}
	
	private static void printAllNumbersInListFuctional(List<Integer> nums) {
		
		nums.stream().forEach(System.out::println);
	}
	
	
	
	
	private static boolean isEven(int n) {
		return n % 2 == 0;
	}	

}
