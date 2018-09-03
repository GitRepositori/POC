package telstra.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import telstra.bean.Product;


public class ProductService {
	
	static HashMap<Integer, Product> productIdMap= getProduct();
	
	private static HashMap<Integer, Product> getProduct(){
		return productIdMap;
	}
	
	public ProductService(){
		super();
		
		if(productIdMap==null){
			productIdMap=new HashMap<Integer, Product>(); 
			
			productIdMap.put(1,new Product(01, "Ethernet", 50));
			productIdMap.put(2,new Product(02, "TwistedPair Cable", 12));
			productIdMap.put(3,new Product(03, "Switches", 90));
			productIdMap.put(4,new Product(04, "Router", 24));
			productIdMap.put(5,new Product(05, "Coaxial Cable", 18));
			
		}
	}
	
	public List<Product> getAllProducts(){
		
		List<Product> products=new ArrayList<Product>(productIdMap.values());
		return products;
	}
	public Product getProduct(int id){
		Product product=productIdMap.get(id);
		return product;
	}
	public Product addProduct(Product product){
		product.setId(productIdMap.size()+1);
		productIdMap.put(product.getId(), product);
		return product;
	}
	public Product updateProduct(Product product){
		if(product.getId()<0) 
			return null;
		else{
			productIdMap.put(product.getId(), product);
			return product;
		}
	}
	public void deleteProduct(int id){
		productIdMap.remove(id);
	}
	
}