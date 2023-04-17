module com.mycompany.additionapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.additionapp to javafx.fxml;
    exports com.mycompany.additionapp;
}
