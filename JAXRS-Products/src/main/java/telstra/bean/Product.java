package telstra.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class Product{
	@JsonProperty
	int id;
	@JsonProperty
	String productName;
	@JsonProperty
	long quantity;
public Product() {
super();
}
public Product(int i, String productName,long quantity) {
super();
this.id = i;
this.productName = productName;
this.quantity=quantity;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getProductName() {
return productName;
}
public void setProductName(String productName) {
this.productName = productName;
}
public long getQuantity() {
return quantity;
}
public void setQuantity(long quantity) {
this.quantity = quantity;
}
}