import java.util.ArrayList;

import entities.*;
import service.CatalogueService;
import service.CheckOutService;

public class EcommerceApp 
{
	public static void main(String[] args) 
	{
		User user1=User.builder().name("Apurv")
				.email("apurvjaiz@gmail.com")
				.phnno("7205384744")
				.age((short) 24)
				.gender(Gender.MALE)
				.userid()
				.password("abcdefg")
				.address("Bangalore")
				.build();
		
		//Create items
		Item item1=new Item(1,"iPhone",80000);
		Item item2=new Item(2,"Galaxy Note",70000);
		Item item3=new Item(3,"wallet",500);
		Item item4=new Item(4,"Purse",2000);
		Item item5=new Item(5,"Laptop",67000);
		Item item6=new Item(6,"Earphone",1500);
		Item item7=new Item(7,"Shoes",3700);
		Item item8=new Item(8,"Sunglasses",2500);
		
		//Prepare catalogue
		ArrayList<Item> itemList=new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);
		itemList.add(item6);
		itemList.add(item7);
		itemList.add(item8);
		
		Catalogue catalogue= new Catalogue(itemList);
		CatalogueService catalogueService=new CatalogueService(catalogue);
		
		//view products
		System.out.println(" Catalogue\n============");
		catalogueService.browse();
		
		//view cart
		System.out.println(" Cart\n======");
		catalogueService.viewCart();
		
		//add/remove/edit item
		catalogueService.addItem(item1);
		catalogueService.addItem(item1);
		catalogueService.addItem(item3);
		catalogueService.addItem(item7);

		System.out.println(" Cart\n======");
		catalogueService.viewCart();
		
		catalogueService.deleteItem(item3);

		System.out.println(" Cart\n======");
		catalogueService.viewCart();
		
		catalogueService.editItem(item7,4);
		System.out.println(" Cart\n======");
		catalogueService.viewCart();
		
		//sort based on Prodct, price
		System.out.println(" Catalogue By Price\n=======================");
		catalogueService.browseByPrice();
		catalogueService.browse();
		
		System.out.println(" Catalogue By Product\n========================");
		catalogueService.browseByProduct();
		catalogueService.browse();
		
		//search
		System.out.println(" Search Result!\n===================");
		catalogueService.search("Earphone");
		System.out.println(" Search Result!\n===================");
		catalogueService.search("Watch");
		
		Cart cart=catalogueService.getCart();
		
		CheckOutService checkOutService=new CheckOutService();
		//checkout and notify
		checkOutService.checkOut(user1, cart);
	}
}
