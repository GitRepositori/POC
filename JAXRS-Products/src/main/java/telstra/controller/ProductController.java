package telstra.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import telstra.bean.Product;
import telstra.service.ProductService;

@Path("/products")
public class ProductController {
	
	ProductService productervice= new ProductService();
	
		@GET
		@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts(){
		List<Product> listOfProducts= productervice.getAllProducts();
		
		return listOfProducts;
		}
		
		 @GET
		 @Path("/{id}")
		 @Produces(MediaType.APPLICATION_JSON)
	public Product getProductById(@PathParam("id") int id){
			 return productervice.getProduct(id);
		 }	 
		 @POST
		 @Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(Product product){
			 return productervice.addProduct(product);
		 }
		 
		 @PUT
		 @Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(Product product){
			 return productervice.updateProduct(product);
		 }
		 
		 @DELETE
		 @Path("/{id}")
		 @Produces(MediaType.APPLICATION_JSON)
	public void deleteProduct(@PathParam("id") int id){
			 productervice.deleteProduct(id);
		 }
	
}
