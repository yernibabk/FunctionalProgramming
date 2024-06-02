package learning;

import java.util.List;
import java.util.function.Supplier;

public class FP05MethodReference {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker");
		
		courses.stream().map(String::toUpperCase).forEach(FP05MethodReference::print);
		
		Supplier<String> sup = () -> new String();
		Supplier<String> sup2 = String::new;
	}
	
	private static void print(String str) {
		System.out.println(str);
	}

}
