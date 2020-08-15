module edu.easydev {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.easydev.studsystem2 to javafx.fxml;
    exports edu.easydev.studsystem2;
}