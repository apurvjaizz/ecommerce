package entities;
import java.util.HashMap;

public class Cart 
{
	HashMap<Item,Integer> cart;
	public Cart()
	{
		cart=new HashMap<Item,Integer>();
	}
	public HashMap<Item, Integer> getCart() {
		return cart;
	}
	public void setCart(HashMap<Item, Integer> cart) {
		this.cart = cart;
	}
	public void viewCart(Cart cart)
	{
		if(cart.getCart().size()==0)
			System.out.println("Cart is Empty");
		else
		{
			System.out.println(" Name \t Price \t Quantity ");
			System.out.println("------\t-------\t----------");
			for(Item i:cart.getCart().keySet())
			{
				System.out.println(i.getProduct()+"\t"+i.getPrice()+"\t"+cart.getCart().get(i));
			}
		}
	}
}
	
