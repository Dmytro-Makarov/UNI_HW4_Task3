module uni.makarov.hw5.task3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens uni.makarov.hw5.task3 to javafx.fxml;
    exports uni.makarov.hw5.task3;
}