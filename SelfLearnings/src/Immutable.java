import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Immutable {
	
	
	final private  String name;
	final private  List<Integer> locations;
	final private  Address address;
	
//	public Immutable() {}
	public Immutable(String name, List<Integer> dataLocations,Address address) {
		
		this.name = name;
		this.locations = dataLocations;
		this.address = address;
//		List<Integer> temp = new ArrayList<>(dataLocations);
//		this.locations = new ArrayList<>(dataLocations);
	}

	public String getName() {
		return name;
	}

	public List<Integer> getLocations() {
		return new ArrayList<>(locations);
//		return Collections.unmodifiableList(locations);
	}
		
	public Address getAddress() {
//		return this.address;
//		return new Address(address);
		return address.getInstance(address);
	}

	@Override
	public String toString() {
		return "Immutable [name=" + name + ", locations=" + locations + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		String name = "hello";
		
		Address add = new Address("Goa",2456,"india");
		System.out.println("here hashcode"+add.hashCode());
		
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
			al.add(i);
		
		Immutable obj = new Immutable(name,al,add);
		System.out.println(obj);
		Address address = obj.getAddress();

		System.out.println("new  hashcode"+address.hashCode());
		address.setCity("Pune");
		System.out.println(obj);
		List<Integer> temp = obj.getLocations();
		temp.add(234);
		
		System.out.println(obj.getName());
		obj.getLocations().add(22);
	}
}



