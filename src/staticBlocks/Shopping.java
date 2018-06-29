package staticBlocks;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
	
	static List<String> itemsToBuy;
	
	static {
		itemsToBuy=new ArrayList<>();
		itemsToBuy.add("coffee");
		itemsToBuy.add("tea");
		itemsToBuy.add("juice");
		itemsToBuy.add("water");
		System.out.println("In Static Block");		
	}
	
	public static void showShoppingList() {
		System.out.println(itemsToBuy);
	}
	
	public Shopping() {
		System.out.println("In Shopping Constraction");
	}
	
	public static void buy(String item) {
		itemsToBuy.remove(item);
		System.out.println("Buying: "+item);
	}
	
	public void returnItems(String item) {
		System.out.println("Returning: "+item);
	}
	

}
