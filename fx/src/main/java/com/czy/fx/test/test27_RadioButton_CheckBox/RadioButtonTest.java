package com.czy.fx.test.test27_RadioButton_CheckBox;

import com.czy.fx.test.FXUtil;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.List;

/**
 * @author chenzy
 * @description
 * @since 2020/5/10
 */
public class RadioButtonTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var ap= new AnchorPane();

        var tg=new ToggleGroup();
        var radioButtonList= FXUtil.getObjectList(RadioButton.class,"a","b","c");
        tg.getToggles().addAll(radioButtonList);
        tg.selectToggle(radioButtonList.get(0));
        tg.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });
        var box=new HBox();
        box.getChildren().addAll(radioButtonList);

        var checkBoxList=FXUtil.getObjectList(CheckBox.class,"a","b","c");
        /*不确定状态：*/
        checkBoxList.get(0).setIndeterminate(true);
        checkBoxList.get(1).setAllowIndeterminate(true);
        var box2=new HBox();
        box2.getChildren().addAll(checkBoxList);
        ap.getChildren().addAll(box,box2);
        AnchorPane.setBottomAnchor(box2,10d);
        primaryStage.setScene(new Scene(ap));
        primaryStage.show();
    }
}
