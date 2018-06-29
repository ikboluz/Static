package staticVariable;

public class EtsyTest {
	public static void main(String[] args) {
//		Etsy etsy=new Etsy();
		Etsy.navigate(TestData.url);
		
		Etsy.login(TestData.url, TestData.password);
		
		Etsy.search(TestData.searchItem);
		
		Etsy etsy=new Etsy();
		etsy.search("leather jacket");
	}

}
