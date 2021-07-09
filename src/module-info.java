module Workshop {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	
	opens gui to javafx.fxml, javafx.graphics;
	opens application to javafx.graphics, javafx.fxml;
}
