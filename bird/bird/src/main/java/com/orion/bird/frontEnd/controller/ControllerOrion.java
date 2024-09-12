package com.orion.bird.frontEnd.controller;
import com.orion.bird.frontEnd.OnlyPass;
import com.orion.bird.backEnd.dataBase.dataBaseLogic.FirstViewDB;
import com.orion.bird.frontEnd.logicFirstView.LogicOrion;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ControllerOrion implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LogicOrion logicOrion = new LogicOrion();
        FirstViewDB firstViewDB = new FirstViewDB();
        returned();
        //---------------------------------------------------------------------
        logicOrion.anchorPaneCloseM(anchorClose);
        logicOrion.buttonEnterM(button, userField, textPassWord, userOneR, passWTwoR);
        logicOrion.labelPassM(labelPassW);
        logicOrion.labelRegisterM(labelRegister);
        logicOrion.userTFieldM(userField, textPassWord, userOneR, passWTwoR);
        logicOrion.passFieldM(textPassWord, userField, userOneR, passWTwoR);
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        userOneR.setVisible(false);
        passWTwoR.setVisible(false);
    }

    @Setter
    @Getter
    private Stage stage;

    @FXML
    private AnchorPane anchorClose;

    @FXML
    private AnchorPane backGroundAnchor;

    @FXML
    private Label label;

    @FXML
    private Label labelPassW;

    @FXML
    private Label labelRegister;

    @FXML
    private Label userOneR;

    @FXML
    private Label passWTwoR;

    @FXML
    private Button button;

    @FXML
    private TextField userField;

    @FXML
    private PasswordField textPassWord;

    public void returned () { this.stage =  OnlyPass.getStage(); }

}
