module com.example.session9git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.session9git to javafx.fxml;
    exports com.example.session9git;
}