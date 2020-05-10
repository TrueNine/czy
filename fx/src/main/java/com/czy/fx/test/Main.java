package com.czy.fx.test;

import com.czy.fx.a.Loging;
import com.czy.fx.test.test10_AnchorPane.AnchorPaneTest;
import com.czy.fx.test.test11_HBoxVBox.HBoxTest;
import com.czy.fx.test.test12_BorderPane.BorderPaneTest;
import com.czy.fx.test.test13_FlowPane.FlowPaneTest;
import com.czy.fx.test.test14_GridPane.GridPaneTest;
import com.czy.fx.test.test15_StackPane.StackPaneTest;
import com.czy.fx.test.test16_TextFlow.TextFlowTest;
import com.czy.fx.test.test18_DialogPane.DialogPaneTest;
import com.czy.fx.test.test19_ScheduledService.ScheduledServiceTest;
import com.czy.fx.test.test1_helloWorld.HelloWorld;
import com.czy.fx.test.test20_Hyperlink.HyperlinkTest;
import com.czy.fx.test.test21_MenuBar_Menu_MenuItem.MenuAboutTest;
import com.czy.fx.test.test2_login.Login;
import com.czy.fx.test.test6_platform.PlatformTest;
import com.czy.fx.test.test6_scene.SceneTest;
import com.czy.fx.test.test7_screen.ScreenTest;
import com.czy.fx.test.test8_group.GroupTest;
import com.czy.fx.test.test9_button.ButtonTest;
import com.czy.util.FileUtil;
import javafx.application.Application;

import java.io.File;

/**
 * @author chenzy
 * @description
 * @since 2020/4/27
 */
public class Main {

    public static void main(String[] args) {
        Class entrance = HelloWorld.class;
        entrance = Login.class;
        entrance = com.czy.fx.test.test3_css.Login.class;
        entrance= PlatformTest.class;
        entrance= ScreenTest.class;
        entrance= SceneTest.class;
        entrance= GroupTest.class;
        entrance= ButtonTest.class;
        entrance = AnchorPaneTest.class;
        entrance = HBoxTest.class;
        entrance = BorderPaneTest.class;
        entrance= FlowPaneTest.class;
        entrance= GridPaneTest.class;
        entrance= StackPaneTest.class;
        entrance= TextFlowTest.class;
        entrance= DialogPaneTest.class;
        entrance= ScheduledServiceTest.class;
        entrance= Loging.class;
        entrance= HyperlinkTest.class;
        entrance= MenuAboutTest.class;
        Application.launch(entrance,args);

//        createDirs();

    }
    private static void createDirs(){
        //        ,"setCellFactory"
        String[] ss={"Hyperlink","MenuBar_Menu_MenuItem","chm","MenuItem","Accordion","TitledPane"
                ,"TabPane","RadioButton_CheckBox","TextArea","TextField","ButtonBar","ChoiceBox","ComboBox"
                ,"ColorPicke","DatePicker","Pagination","Slider","ProgressBar","ProgressIndicator","SplitPane"
                ,"Spinner","ScrollBar","ScrollPane","Separator","PropertyChangeSupport","ListProperty","SetProperty","MapProperty"
                ,"ChangeListener","InvalidationListener"};

        String beanPackage="com.czy.fx.test.test";
        String moduleDir="fx";
        Integer i=20;
        for (String s:ss){
            File modelDir = FileUtil.getCodeFile(moduleDir,beanPackage+i+"_"+s);
            if (!modelDir.exists()) {
                modelDir.mkdirs();
            }
            modelDir.getPath();
            i++;
        }


    }


}
