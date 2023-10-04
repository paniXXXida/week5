module com.example.week5_class {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.week5_class to javafx.fxml;
    exports com.example.week5_class.data;
    exports com.example.week5_class.model;
    exports com.example.week5_class;
}