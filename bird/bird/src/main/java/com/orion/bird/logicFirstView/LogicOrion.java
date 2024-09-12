package com.orion.bird.logicFirstView;
import com.orion.bird.OnlyPass;
import com.orion.bird.Scenes;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogicOrion {

    //Cierra la escena actual y Crea una nueva.
    public static void changeStageOrionM()
    {
        OnlyPass.getStage().close();
        Stage st = new Stage();
        st.setScene(Scenes.secondScene());
        st.centerOnScreen();
        st.show();
    }

    //Lógica del AnchorPane [ backGroundAnchor ]
    public void backGAnchorM()
    {
    }

    //Lógica del AnchorPane [ AnchorClose ]
    public void anchorPaneCloseM(AnchorPane pane)
    {
        pane.setOnMouseClicked(click -> {
            System.exit(0);
        });

        pane.setOnMouseEntered(mouse -> {
            pane.setCursor(Cursor.HAND);
        });
    }

    //Lógica del Botón [ button ].
    public void buttonEnterM(Button button, TextField t, PasswordField p, Label one, Label two)
    {
        button.setOnMouseClicked(click -> {

            if (click.getButton() == MouseButton.PRIMARY && !t.getText().isEmpty() && !p.getText().isEmpty()) {
                LogicOrion.changeStageOrionM();

            } else if (click.getButton() == MouseButton.PRIMARY && t.getText().isEmpty() && p.getText().isEmpty()){
                one.setVisible(true);
                two.setVisible(true);

            } else if (click.getButton() == MouseButton.PRIMARY && t.getText().isEmpty() && !p.getText().isEmpty()) {
                one.setVisible(true);

            } else if (click.getButton() == MouseButton.PRIMARY && !t.getText().isEmpty() && p.getText().isEmpty()) {
                two.setVisible(true);
            }
        });

        button.setOnKeyPressed(key -> {

            if (key.getCode() == KeyCode.ENTER && !t.getText().isEmpty() && !p.getText().isEmpty()) {
                LogicOrion.changeStageOrionM();

            } else if (key.getCode() == KeyCode.ENTER && t.getText().isEmpty() && p.getText().isEmpty()){
                one.setVisible(true);
                two.setVisible(true);
            }
        });

        button.setOnMouseEntered(mouse -> {
            button.setCursor(Cursor.HAND);
        });
    }

    //Lógica del Label [ labelPassW ]
    public void labelPassM(Label label)
    {
        label.setOnMouseEntered(mouse -> {
            label.setCursor(Cursor.HAND);
        });
    }

    //Lógica del Label [ labelRegister ]
    public void labelRegisterM(Label label)
    {
        label.setOnMouseEntered(mouse -> {
            label.setCursor(Cursor.HAND);
        });
    }

    //Lógica del TextField [ userField ]
    public void userTFieldM(TextField field, PasswordField pass, Label one, Label two)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        field.setOnKeyPressed(key -> {
            if (key.getCode() == KeyCode.ENTER && !field.getText().isEmpty() && !pass.getText().isEmpty()) {
                LogicOrion.changeStageOrionM();

            } else if (key.getCode() == KeyCode.ENTER && field.getText().isEmpty() && pass.getText().isEmpty()) {
                one.setVisible(true);
                two.setVisible(true);

            } else if (key.getCode() == KeyCode.ENTER && !field.getText().isEmpty() && pass.getText().isEmpty()) {
                two.setVisible(true);

            } else if (key.getCode() == KeyCode.ENTER && field.getText().isEmpty() && !pass.getText().isEmpty()) {
                one.setVisible(true);
            }

            if (!field.getText().isEmpty()) {
                one.setVisible(false);
            }

        });
    }

    //Lógica del PasswordField [ textPassWord ]
    public void passFieldM(PasswordField pass, TextField field, Label one, Label two)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        pass.setOnKeyPressed(key -> {
            if (key.getCode() == KeyCode.ENTER && !pass.getText().isEmpty() && !field.getText().isEmpty()) {
                LogicOrion.changeStageOrionM();

            } else if (key.getCode() == KeyCode.ENTER && pass.getText().isEmpty() && field.getText().isEmpty()) {
                one.setVisible(true);
                two.setVisible(true);

            } else if (key.getCode() == KeyCode.ENTER && !pass.getText().isEmpty() && field.getText().isEmpty()) {
                one.setVisible(true);

            } else if (key.getCode() == KeyCode.ENTER && pass.getText().isEmpty() && !field.getText().isEmpty()) {
                two.setVisible(true);
            }

            if (!pass.getText().isEmpty()) {
                two.setVisible(false);
            }

        });
    }

}
