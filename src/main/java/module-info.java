module sample.lab_02_05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.lab_02_05 to javafx.fxml;
    exports sample.lab_02_05;
}