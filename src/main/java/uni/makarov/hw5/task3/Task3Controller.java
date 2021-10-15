package uni.makarov.hw5.task3;


import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task3Controller {

    @FXML
    ChoiceBox choiceBox;

    @FXML
    private TextField txtSide1;
    @FXML
    private TextField txtSide2;
    @FXML
    private TextField txtAngle;

    @FXML
    private Label label1;
    @FXML
    private Label label2;

    @FXML
    private void calcPerimeterAction(){
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double side1 = Double.parseDouble(txtSide1.getText());
        double side2 = Double.parseDouble(txtSide2.getText());
        double angle = Double.parseDouble(txtAngle.getText());

        switch (figure){
            case "Right Triangle":
                RightTriangle rightTriangle = new RightTriangle(side1, side2, angle);
                label1.setText(String.valueOf(rightTriangle.calcPerimeter()));
                break;
            case "Isosceles Triangle":
                IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(side1, side2, angle);
                label1.setText(String.valueOf(isoscelesTriangle.calcPerimeter()));
                break;
        }
    }

    @FXML
    private void calcAreaAction() {
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double side1 = Double.parseDouble(txtSide1.getText());
        double side2 = Double.parseDouble(txtSide2.getText());
        double angle = Double.parseDouble(txtAngle.getText());

        switch (figure) {
            case "Right Triangle":
                RightTriangle rightTriangle = new RightTriangle(side1, side2, angle);
                label2.setText(String.valueOf(rightTriangle.calcArea()));
                break;
            case "Isosceles Triangle":
                IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(side1, side2, angle);
                label2.setText(String.valueOf(isoscelesTriangle.calcArea()));
                break;
        }
    }
}