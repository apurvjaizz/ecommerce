package entities;

public class Item 
{
	int productId;
	String product;
	double price;
	String metadata;
	public Item(){}
	public Item(int productId, String product, double price) 
	{
		this.productId=productId;
		this.product = product;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[ Product Id=" + productId + ", Product=" + product + ", Price=" + price + " ]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

}
