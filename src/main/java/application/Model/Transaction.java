package application.Model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Transaction {

	public SimpleIntegerProperty id;
	public SimpleIntegerProperty customerId;
	public SimpleStringProperty items;
	public SimpleDoubleProperty total;
	
	
	public Transaction(int id , int customerId,String items, double total) {
		this.id = new SimpleIntegerProperty(id);
		this.customerId = new SimpleIntegerProperty(customerId);
		this.items = new SimpleStringProperty(items);
		this.total = new SimpleDoubleProperty(total);
	}
	
	public int getId() {
		return id.get();
	}
	public int getCustomerId() {
		return customerId.get();
	}
	public void setCustomerId(int customerId) {
		this.customerId.set(customerId);
	}
	
	public String getItems() {
		
		return items.get();
	}
	
	public void setItems(String items) {
		this.items.set(items);
	}
	
	public Double getTotal() {
		return total.get();
	}
	
	public void setTotal(double total) {
		
	}
}
