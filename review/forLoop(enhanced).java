import java.util.HashSet;

public class CityDisplay {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        for (String city: cities) {
         	
            System.out.println(city);
        }
    }
}
