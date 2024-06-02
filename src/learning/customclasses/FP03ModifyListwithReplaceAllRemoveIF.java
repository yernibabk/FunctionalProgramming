package learning.customclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03ModifyListwithReplaceAllRemoveIF {

	public static void main(String[] args) {
		
		
		List<String> customCourses = List.of("Spring", "Spring Boot", "aws", "Azure", "API");
		//customCourses.replaceAll(str -> str.toUpperCase());
		
		//System.out.println(customCourses);
		
		List<String> customCorseModifiable = Arrays.asList("Spring", "Spring Boot", "aws", "Azure", "API");
		customCorseModifiable.replaceAll(st -> st.toUpperCase());
		System.out.println(customCorseModifiable);
		
		List<String> customCorseModifiable2 = new ArrayList();
		customCorseModifiable2.add("Spring");
		customCorseModifiable2.add("aws");
		
		customCorseModifiable2.removeIf(cr -> cr.length()> 3);
		System.out.println(customCorseModifiable2);

		//System.out.println(customCourses.stream().peek(System.out::println).filter(cr -> cr.length()> 11).map(String::toUpperCase).peek(System.out::println));
		
		//System.out.println(customCourses.stream().peek(System.out::println).filter(cr -> cr.length()> 8).map(String::toUpperCase).peek(System.out::println).findFirst());
		//when terminal operation execute then the intermediate opr will execute
	
}






//class Course {
//
//	
//	private String name;
//	private String category;
//	private int noOfStudents;
//	private int reviewScore;
//	
//	public Course(String name, String category, int noOfStudents, int reviewScore) {
//		super();
//		this.name = name;
//		this.category = category;
//		this.noOfStudents = noOfStudents;
//		this.reviewScore = reviewScore;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public int getNoOfStudents() {
//		return noOfStudents;
//	}
//
//	public void setNoOfStudents(int noOfStudents) {
//		this.noOfStudents = noOfStudents;
//	}
//
//	public int getReviewScore() {
//		return reviewScore;
//	}
//
//	public void setReviewScore(int reviewScore) {
//		this.reviewScore = reviewScore;
//	}
//
//	@Override
//	public String toString() {
//		return "Course [name=" + name + ", category=" + category + ", noOfStudents=" + noOfStudents + ", reviewScore="
//				+ reviewScore + "]";
//	}
//
//	
	
}
