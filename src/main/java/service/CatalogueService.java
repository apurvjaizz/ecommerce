package service;

import entities.Cart;
import entities.Catalogue;
import entities.Item;

public class CatalogueService implements Search
{
	Catalogue catalogue;
	Cart cart;
	
	public CatalogueService(Catalogue catalogue)
	{
		this.catalogue=catalogue;
		cart=new Cart();
	}
	public void browse()
	{
		catalogue.view();
	}
	public void browseByProduct()
	{
		catalogue.sortByProduct();
	}
	public void browseByPrice()
	{
		catalogue.sortByPrice();
	}
	public Cart addItem(Item item)
	{
		if(!cart.getCart().containsKey(item))
			cart.getCart().put(item, 1);
		else
			cart.getCart().put(item,cart.getCart().get(item)+1);
		return cart;
	}
	public Cart deleteItem(Item item)
	{
		if(cart.getCart().containsKey(item))
			cart.getCart().remove(item);
		return cart;
	}
	public Cart editItem(Item item, int count)
	{
		if(count<=0)
		{
			if(cart.getCart().containsKey(item))
				cart.getCart().remove(item);
		}
		else 
		{
			cart.getCart().put(item,count);
		}
		return cart;
	}
	public void viewCart()
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
	public Item search(String name)
	{
		if(catalogue.getItemList().containsKey(name))
		{
			System.out.println(catalogue.getItemList().get(name).toString());
			return catalogue.getItemList().get(name);
		}
		else
		{
			System.out.println("Item not found!\n");
			return null;
		}
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
