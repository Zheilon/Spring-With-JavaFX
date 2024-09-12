package com.orion.bird;
import com.orion.bird.controller.ControllerOrion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Orion extends Application {

	public static void main(String[] args) {
		System.out.println("Starting!");
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(Orion.class);
		FXMLLoader charge = new FXMLLoader(Orion.class.getResource("looking.fxml"));

		Scene scene = new Scene(charge.load());
		charge.setControllerFactory(context :: getBean);

		ControllerOrion bird = charge.getController();
		bird.setStage(stage);
		OnlyPass.setStage(bird.getStage());

		stage.setScene(scene);
		stage.initStyle(StageStyle.TRANSPARENT);
		scene.setFill(Color.TRANSPARENT);

		stage.centerOnScreen();
		stage.show();
	}
}
