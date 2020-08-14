module edu.easydev {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.easydev to javafx.fxml;
    exports edu.easydev;
}