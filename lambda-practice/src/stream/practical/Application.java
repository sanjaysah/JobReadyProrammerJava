package stream.practical;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
	
	public static void main(String[] args) throws IOException {
		
//		IntStream
//		.range(1, 10)
//		.forEach((x) -> System.out.print(x));
//	//System.out.println();
		
//		IntStream //Integer Stream with skip
//		.range(1,10)
//		.skip(5)
//		.forEach((x) -> System.out.print(x+", "));
		
//		int val = IntStream // IntStream with Sum
//				.range(1, 5)
//				.sum();
//			System.out.println(val);
		
//		//Stream.of , sorted and find first
//		Stream.of("Hello", "bottle", "Africa")
//			.sorted()
//			.findFirst()
//			.ifPresent((x) -> System.out.println(x));
		
//		// Stream from Array, sort, filter and print
//		String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
//		Stream.of(items)
//			.filter((x) -> x.startsWith("t"))
//			.sorted()
//			.forEach((x) -> System.out.print(x+", "));
		
//		//Average of squares of an int array
//		Arrays.stream(new int[] {2, 4, 6, 8, 10})
//		.map((x) -> x*x)
//		.average()
//		.ifPresent((x) -> System.out.print(x));
		
//		// Stream from a list, map, filter, sorted and print
//		List<String> listofStrings = Arrays.asList("car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy");
//		listofStrings.stream()
//		.map((x) -> x.toLowerCase())
//		.filter((x) -> x.startsWith("c"))
//		.sorted()
//		.forEach((x) -> System.out.println(x+", "));
		
//		// Read from files and stream
//		Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
//		lines.sorted()
//		.filter((x) -> x.length()>6)
//		.forEach((x) -> System.out.println(x+", "));
//		lines.close();
		
//		//Read words from files and covert to collection and print
//		List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
//				.filter((x) -> x.contains("th"))
//				.collect(Collectors.toList());
//		words.forEach((x) -> System.out.print(x+", "));
		
//		//Read comma separated words, map, filter, count and print
//		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
//		int rowCount = (int) rows
//				.map(x -> x.split(","))
//				.filter(x -> x.length>3)
//				.count();
//				System.out.println(rowCount+" Good rows.");
//				rows.close();
		
		//Read comma separated words, map, filter, count and print
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		rows.map(x -> x.split(","))
				.filter(x -> x.length>3)
				.filter(x -> Integer.parseInt(x[1].trim()) >15)
				.forEach(x -> System.out.println(x[0].trim()+" "+x[2].trim()+" "+x[3].trim()));
				rows.close();
		
	}

}
