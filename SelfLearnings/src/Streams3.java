import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Streams3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(21,32,13,44,45);
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%5==0;	
			}	
		};
		System.out.println(values.stream().
				filter(p).
				map(i->i*2).
				findFirst().
				orElse(0));
//		System.out.println(values.stream().filter(p)
////				.filter(i->i%5==0)
//				.reduce(0,(c,e)->Integer.sum(c, e)));
	}
}
