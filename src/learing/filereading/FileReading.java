package learing.filereading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		//Files.lines(Paths.get("files.txt")).forEach(System.out::println);
		//Files.lines(Paths.get("files.txt")).map(str -> str.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(System.out::println);
		
		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);

	}

}
