import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamsFunctions {
	public static void main(String[] args) {
//	List<Integer> values = Arrays.asList(1,2,3,4,5);
////		values.forEach(i->doubleIt(i));
//		values.forEach(StreamsFunctions::doubleIt);
//	}
//	public static void doubleIt(int i) {
//		System.out.println(i*2);
//	}	
	List<Integer> values2= new ArrayList<>();
	for(int i=0;i<10;i++)
		values2.add(i);
//	values2.parallelStream().forEach(System.out::println);
//	values2.stream().forEach(System.out::println);
	
	
//	Function<Integer,Integer> f = new Function<Integer,Integer>(){
//
//		@Override
//		public Integer apply(Integer i) {
//			
//			return i*2;
//		}
//	};
//	
//	BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
//		int res=0;
//		public Integer apply(Integer t, Integer u) {
//			return t+u;
//		}
//	};
//	
//	Stream s = values2.stream();
//	Stream s1 = s.map(f);
//	
//	Integer result = (Integer) s1.reduce(0,b);
//	
//	s1.forEach(System.out::println);
	
//	SHORT HAND
	Stream<Integer> s = values2.stream();
//	Stream<Integer> s1 = s.map(i->i*2);
//	Integer result = s1.reduce(0, (c,e)->c+e);
	
//	Integer result = s.map(i->i*2).reduce(0, (c,e)->c+e);
	
//	System.out.println(values2.stream().map(i->i*2).reduce(0, (c,e)->c+e));
	System.out.println(values2.stream().map(i->i*2).reduce(0, (c,e)->Integer.sum(c, e)));	
	}
}
