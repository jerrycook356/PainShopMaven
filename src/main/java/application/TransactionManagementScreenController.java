package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class TransactionManagementScreenController {

	
	@FXML
	TableView table ;
	
	public void goToMainScreen() throws IOException {
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/MainScreen.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Main Screen");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
	
	@FXML
	public void goToCustomerManagement() throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/customerWindow.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Customer Management");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
		
	}
	@FXML
	public void goToInventoryManagement() throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/inventoryManagementScreen.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Inventory Management");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
	@FXML
	public void getToVendorManagement() throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/vendorManagementScreen.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Vendor Management");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
}
