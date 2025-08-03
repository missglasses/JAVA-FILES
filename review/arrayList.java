// Import ArrayList
import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {

		ArrayList<String> shopList = new ArrayList<String>();
		
		shopList.add("milk");
		shopList.add("eggs");
		shopList.add("bread");

		shopList.add("milk");

		System.out.println(shopList);

		shopList.set(2, "rye-bread");

		shopList.remove("milk");

		System.out.println(shopList);
		System.out.println(shopList.size());
	}
}
