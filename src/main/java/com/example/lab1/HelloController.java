package com.example.lab1;

import com.example.lab1.module.Counter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelloController  {
    Counter counter = new Counter();
    @FXML
    private TextArea sumText;
    @FXML
    private TextArea sum15;
    @FXML
    private TextArea sum10;
    @FXML
    private TextArea sum3;

    public void calcButton(ActionEvent actionEvent) {
        counter.setSum(Double.parseDouble(sumText.getText()));
        sum15.setText(String.valueOf(counter.countPr(Double.parseDouble(sumText.getText()), 15)) );
        sum10.setText(String.valueOf(counter.countPr(Double.parseDouble(sumText.getText()), 10)) );
        sum3.setText(String.valueOf(counter.countPr(Double.parseDouble(sumText.getText()), 3)) );
    }


    public void select15(ActionEvent actionEvent) {
        sumText.setText(String.valueOf(counter.countSum(counter.getSum(), 15)) );
    }

    public void select10(ActionEvent actionEvent) {
        sumText.setText(String.valueOf(counter.countSum(counter.getSum(), 10)) );
    }

    public void select3(ActionEvent actionEvent) {
        sumText.setText(String.valueOf(counter.countSum(counter.getSum(), 3)) );
    }

    public void trunc(ActionEvent actionEvent) {
        sumText.setText(String.valueOf(counter.countSumTrunc(Double.parseDouble(sumText.getText()))) );
    }
}
