package application.Model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ReviewItem {

	
	public SimpleIntegerProperty id;
	public SimpleDoubleProperty price;
	public SimpleIntegerProperty quantity;
	
	
	public ReviewItem(int id ,double price, int quantity) {
		this.id = new SimpleIntegerProperty(id);
		this.price = new SimpleDoubleProperty(price);
		this.quantity = new SimpleIntegerProperty(quantity);
	}
	
	
	public int getId() {
		return id.get();
	}
	
	public double getPrice() {
		return price.get();
	}
	
	public int getQuantity() {
		return quantity.get();
	}
}
