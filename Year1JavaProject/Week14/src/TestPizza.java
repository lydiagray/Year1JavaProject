
public class TestPizza {
	
	public static void main (String []args) {
	
		String[] pizza1Toppings = {"Cheese", "Tomato"};
		String[] pizza2Toppings = {"Cheese", "Tomato", "Pineapple", "Ham"};
		String[] pizza3Toppings = {"Cheese", "Tomato", "Ham", "Mushrooms"};
		Pizza1 pizza1 = new Pizza1("Margarita", pizza1Toppings, 3.59);
		Pizza1 pizza2 = new Pizza1("Hawaian", pizza2Toppings, 4.79);
		Pizza1 pizza3 = new Pizza1("Farmhouse", pizza3Toppings, 4.89);
		
		System.out.println(pizza1.toString());
		System.out.println(pizza2.toString());
		System.out.println(pizza3.toString());
	}

}
