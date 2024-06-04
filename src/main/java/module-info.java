module com.exercises.librettovoti {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exercises.librettovoti to javafx.fxml;
    exports com.exercises.librettovoti;
}