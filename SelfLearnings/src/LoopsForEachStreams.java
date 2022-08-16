import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LoopsForEachStreams {
	
	public static void main(String[] args) {
		
	
//		External Iteration --outside for loop extracts data
		
//		for(int i=0;i<values.size();i++) {
//			System.out.println(values.get(i));
//		}
//		
//		Iterator<Integer> i = values.iterator(); //create object of Iterator interface 
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		for(int j:values)
//			System.out.println(j);
		
//		Internal Iteration --stream API used to fetch data	
		//for each consumes a method of Consumer interface
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};

		Consumer<Integer> c = (Integer i)->System.out.println(i);
		values.forEach(c);
		
//		values.forEach(new Consumer<Integer>() {
//			
//			public void accept(Integer i)
//			{
//				System.out.println(i);
//			}
//		} );
//		values.forEach(i->System.out.println(i));
		
		values.forEach(System.out::println); //Method reference passing method as a parameter call by method
	}
}
