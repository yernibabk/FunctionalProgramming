package learning.customclasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP01CustomClassFlatMap {

	public static void main(String[] args) {
		
		
		List<String> customCourses = List.of("Spring", "Spring Boot", "aws", "Azure", "API");
	//	String singleString = customCourses.stream().collect(Collectors.joining(" "));
	//	System.out.println(singleString);
		
	//	System.out.println(customCourses.stream().map(cour -> cour.split(" ,")).collect(Collectors.toList()));
		//Stream of string[] = Steam of strings
		//Stream[["s", "p","r"..], ["s","r",..."t"],..]  => ["s","r","-",....."t"]
		
		/* Each element of the stream replaced with the content of mapped stream (Arrays::stream)
		 * ["s","p","r","i","n","g"] => "s","p","r","i","n","g"
		 */
		
//		System.out.println(customCourses.stream().map(cr -> cr.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
//		
//		System.out.println(customCourses.stream().map(cr -> cr.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
//		
//
		List<String> customCourses2 = List.of("Spring", "Spring Boot", "aws", "Azure", "API");
//		
//		System.out.println(customCourses.stream().flatMap(course -> customCourses2.stream().
//				map(course2 -> List.of(course, course2))).collect(Collectors.toList()));
		
//		System.out.println(customCourses.stream().flatMap(course -> customCourses2.stream().
//				map(course2 -> List.of(course, course2))).filter(list -> list.get(0).equals(list.get(1))).collect(Collectors.toList()));
		
		System.out.println(customCourses.stream().flatMap(course -> customCourses2.stream()
				.filter(course2 -> course2.length() == course.length()).
				map(course2 -> List.of(course, course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList()));
		
		
		
		
		
		
		
//		System.out.println(customCourses.stream().map(course -> course.split(" ")).collect(Collectors.toList()));
//		System.out.println(customCourses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
//		
//		List<String> customCourses2 = List.of("AI", "Spring", "aws", "Azure", "API", "ML");
//		System.out.println(customCourses.stream().flatMap(course -> customCourses2.stream().map(customCou2 -> List.of(customCourses, customCou2)))
//		.collect(Collectors.toList()));
//		
//		System.out.println("**************************");
//		System.out.println(customCourses.stream().flatMap(course -> customCourses2.stream().map(customCou2 -> List.of(customCourses, customCou2)))
//		.filter(list -> list.get(0).equals(list.get(1))).collect(Collectors.toList()));
		
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
