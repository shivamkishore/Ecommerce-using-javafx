module com.example.ecommerceshivam1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ecommerceshivam1 to javafx.fxml;
    exports com.example.ecommerceshivam1;
}