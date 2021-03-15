package entities;

import java.util.*;

public class Catalogue 
{
	ArrayList<Item> catalogue;
	HashMap<String,Item> itemList;
	public Catalogue(ArrayList<Item> catalogue)
	{
		this.catalogue=new ArrayList<Item>(catalogue);
		//this.catalogue=catalogue;
		itemList=new HashMap<String,Item>();
		for(Item item:catalogue)
			itemList.put(item.product, item);
	}
	public void view()
	{
		for(Item i:catalogue)
			System.out.println(i);
	}
	public void sortByProduct()
	{
		Collections.sort(catalogue,(i1,i2)-> i1.product.toLowerCase().compareTo(i2.product.toLowerCase()));
	}
	public void sortByPrice()
	{
		Collections.sort(catalogue,(i1,i2)-> (int)(i1.price-i2.price)*10);
	}
	public ArrayList<Item> getCatalogue() {
		return catalogue;
	}
	public void setCatalogue(ArrayList<Item> catalogue) {
		this.catalogue = catalogue;
	}
	public HashMap<String, Item> getItemList() {
		return itemList;
	}
	public void setItemList(HashMap<String, Item> itemList) {
		this.itemList = itemList;
	}
}
