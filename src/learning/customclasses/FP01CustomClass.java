package learning.customclasses;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP01CustomClass {

	public static void main(String[] args) {
		
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 9001, 91),
				new Course("Spring Boot", "Framework", 1000, 91),
				new Course("API", "Microservices", 9000, 87),
				new Course("AWS", "Cloud", 9000, 95),
				new Course("Azure", "Cloud", 654, 86)
				);
		
		//courses.stream().filter(reviewSoreGreaterThan90Predicate()).forEach(System.out::println);
		//System.out.println(courses.stream().allMatch(reviewSoreGreaterThan95Predicate()));
		//System.out.println(courses.stream().anyMatch(reviewSoreGreaterThan90Predicate()));
		

		//Predicate<Course> reviewSoreLessThan85Predicate =  course -> course.getReviewScore()< 85;
		
		//System.out.println(courses.stream().noneMatch(reviewSoreLessThan85Predicate));
		 
		// Comparator<Course> sortByNoOfStudents =  Comparator.comparingInt(Course::getNoOfStudents);
		 
		// System.out.println(courses.stream().sorted(sortByNoOfStudents).collect(Collectors.toList()));
		 
		 //Comparator<Course> sortByReviewReversed =  Comparator.comparing(Course::getReviewScore).reversed();
		 
		 //System.out.println(courses.stream().sorted(sortByReviewReversed).collect(Collectors.toList()));
		 
		 Comparator<Course> sortByReviewReversedAndNoOfStudents =  Comparator.comparingInt(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed();
		 
		
		 System.out.println(courses.stream().sorted(sortByReviewReversedAndNoOfStudents).collect(Collectors.toList()));

		 
		 System.out.println(courses.stream().sorted(sortByReviewReversedAndNoOfStudents).limit(3).collect(Collectors.toList()));
		 
		 System.out.println(courses.stream().takeWhile(course -> course.getReviewScore() >= 91).collect(Collectors.toList()));		
		 
		 System.out.println(courses.stream().min(sortByReviewReversedAndNoOfStudents));
		 System.out.println(courses.stream().max(sortByReviewReversedAndNoOfStudents));
		 
		 Predicate<Course> reviewSoreGreaterThan99Predicate1 = course -> course.getReviewScore() > 99;
		 System.out.println(courses.stream().filter(reviewSoreGreaterThan99Predicate1).min(sortByReviewReversedAndNoOfStudents).orElse(new Course("Azure", "Cloud", 654, 86)));
		 
		 
		 Predicate<Course> reviewSoreGreaterThan93Predicate2 = course -> course.getReviewScore() > 90;
		 
		 System.out.println(courses.stream().filter(reviewSoreGreaterThan93Predicate2).findFirst());
		 
		 Predicate<Course> reviewSoreGreaterThan99Predicate3 = course -> course.getReviewScore() > 90;
		 
		 System.out.println(courses.stream().filter(reviewSoreGreaterThan99Predicate3).findAny());
		 System.out.println("**************************");
		 System.out.println(courses.stream().filter(reviewSoreGreaterThan99Predicate3).mapToInt(st -> st.getNoOfStudents()).count());
		 
		 System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
		 //{Cloud=[Course [name=AWS, category=Cloud, noOfStudents=9000, reviewScore=99], Course [name=Azure, category=Cloud, noOfStudents=654, reviewScore=86]], Microservices=[Course [name=API, category=Microservices, noOfStudents=9000, reviewScore=87]], Framework=[Course [name=Spring, category=Framework, noOfStudents=9001, reviewScore=91], Course [name=Spring Boot, category=Framework, noOfStudents=1000, reviewScore=91]]}

		 System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
		 //{Cloud=2, Microservices=1, Framework=2}
		
		 System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
				 Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		 
		 System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, 
				 Collectors.mapping(Course::getName, Collectors.toList()))));
		
	}

	private static Predicate<Course> reviewSoreGreaterThan90Predicate() {
		return course -> course.getReviewScore()> 90;
	}
	
	private static Predicate<? super Course> reviewSoreGreaterThan95Predicate() {
		return course -> course.getReviewScore()> 95;
	}
	
	private static Predicate<? super Course> reviewSoreGreaterThan99Predicate() {
		return course -> course.getReviewScore()> 99;
	}


}






class Course {

	
	private String name;
	private String category;
	private int noOfStudents;
	private int reviewScore;
	
	public Course(String name, String category, int noOfStudents, int reviewScore) {
		super();
		this.name = name;
		this.category = category;
		this.noOfStudents = noOfStudents;
		this.reviewScore = reviewScore;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", noOfStudents=" + noOfStudents + ", reviewScore="
				+ reviewScore + "]";
	}

	
	
}
