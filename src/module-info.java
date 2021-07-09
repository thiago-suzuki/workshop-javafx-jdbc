module Workshop {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	exports gui.util;
	
	opens gui.util to javafx.fxml, javafx.graphics;
	opens gui to javafx.fxml, javafx.graphics;
	opens application to javafx.graphics, javafx.fxml;
}
