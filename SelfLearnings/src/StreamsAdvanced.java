import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsAdvanced {

	public static void main(String[] args) throws IOException {
		
		//1.  Integer Stream
//		IntStream
//		.range(0, 10)
//		.forEach(System.out::println);
		
		//2. Integer Stream with Skip
		
//		IntStream
//		.range(1, 10)
//		.skip(4)
//		.forEach(x->System.out.println(x));
		
		//3. Integer Stream with Sum
		
//		System.out.println(
//		IntStream
//		.range(1, 10)
//		.sum());
//		System.out.println();
		
		
		//4. Stream.of sorted findFirst
//		Stream.of("Ava","Aner","Abd")
//		.sorted()
//		.findFirst()
//		.ifPresent(System.out::print);
		
		// 5 Sort From an Array Stream Filter Print
//		String names[] = {"Volvo", "BMW", "Ford", "Mazda","Mto","Merc"};
//		Arrays.stream(names) //same as Stream.of(names)
//		.filter(x->x.startsWith("M"))
//		.sorted()
//		.forEach(System.out::println);
		
		//6 average of squares of an int numbers
//		Arrays.stream(new int[] {2,4,6,8})
//		.map(x->x*x)
//		.average()
//		.ifPresent(System.out::println);
		
		//7 Stream from List, Filter and print
//		List<String> people = Arrays.asList("Al","Ankit","Brent","Sarika","Hans");
//				people.stream()
//				.map(String::toLowerCase)
//				.filter(x->x.startsWith("a"))
//				.forEach(System.out::println);
		
//		String filename="bands.txt";
//	    Path pathToFile = Paths.get(filename);
//	    System.out.println(pathToFile.toAbsolutePath());
		
		// 8. Stream rows from text file, sort, filter, and print
//				Stream<String> bands = Files.lines(Paths.get("src/bands.txt"));
//				bands
//					.sorted()
//					.filter(x -> x.length() > 13)
//					.forEach(System.out::println);
//				bands.close();
//				
		
		// 8. Stream rows from text file, sort, filter, save to List
//		Stream<String> bands = Files.lines(Paths.get("src/bands.txt"));
//		bands
//			.sorted()
//			.filter(x -> x.contains("jit"))
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
//		bands.close();
		
		// 10. Stream rows from CSV file and count
//		Stream<String> rows1 = Files.lines(Paths.get("src/data.txt"));
//		int rowCount = (int)rows1
//			.map(x -> x.split(","))
//            .filter(x -> x.length == 3)
//			.count();
//		System.out.println(rowCount + " rows.");
//		rows1.close();
		
		
		// 11. Stream rows from CSV file, parse data from rows
//		Stream<String> rows2 = Files.lines(Paths.get("src/data.txt"));
//		rows2
//			.map(x -> x.split(","))
//            .filter(x -> x.length == 3)
//			.filter(x -> Integer.parseInt(x[1]) > 15)
//			.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
//		rows2.close();
		
		
		// 12. Stream rows from CSV file, store fields in HashMap
//		Stream<String> rows3 = Files.lines(Paths.get("src/data.txt"));
//		Map<String, Integer> map = new HashMap<>();
//		map = rows3
//			.map(x -> x.split(","))
//            .filter(x -> x.length == 3)
//			.filter(x -> Integer.parseInt(x[1]) > 15)
//			.collect(Collectors.toMap(
//                x -> x[0],
//                x -> Integer.parseInt(x[1])));
//		rows3.close();
//		for (String key : map.keySet()) {
//			System.out.println(key + "  " + map.get(key));
//		}
		
		
		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8)
			.reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);
		
		
		// 14. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
			.summaryStatistics();
		System.out.println(summary);
		
//		https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
//		https://www.youtube.com/watch?v=f5j1TaJlc0w
			
	}

}
