import java.util.Collections;
import java.util.List;

public final class Immutable {

    private final String name;
    private final List<Integer> locations;
    private final Address address;

    // Constructor for initialization
    public Immutable(String name, List<Integer> locations, Address address) {
        this.name = name;
        // Create a defensive copy to ensure the original list is not modified externally
        this.locations = Collections.unmodifiableList(locations != null ? List.copyOf(locations) : null);
        // Make sure to use an immutable or properly encapsulated Address object
        this.address = (address != null) ? new Address(address) : null;
    }

    // Getter methods for accessing the fields
    public String getName() {
        return name;
    }

    public List<Integer> getLocations() {
        // Return an unmodifiable view of the locations list to prevent modifications
        return (locations != null) ? Collections.unmodifiableList(locations) : null;
    }

    public Address getAddress() {
        // Return a defensive copy or an immutable version of the Address object
        return (address != null) ? new Address(address) : null;
    }
}
