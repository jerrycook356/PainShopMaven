package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class vendorManagementScreenController {

	
	@FXML
	TableView table;
	
	public void goToMainScreen()throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/MainScreen.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Main Screen");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
	public void goToCustomerScreen()throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/customerWindow.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Customer Management");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
	public void goToInventoryScreen() throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/inventoryManagementScreen.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Inventory Management");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
	public void goToTransactionScreen()throws IOException{
		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("application/TransactionManagementScreen.fxml"));
		Scene scene = new Scene(parent);
		Stage window = (Stage)(table.getScene().getWindow());
		window.setTitle("Transaction Management");
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(scene);
		window.show();
	}
}
