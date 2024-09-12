package com.orion.bird;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;

public class Scenes {

    //The First Scene Returns.
    public static Scene firstScene()
    {
        Scene scene = null;
        try {
            FXMLLoader f = new FXMLLoader(Scenes.class.getResource("looking.fxml"));
            scene = new Scene(f.load());
            return scene;

        } catch (IOException e) {
            System.out.println("Error in firstScene() = " + e.getMessage());
        }
        return null;
    }

    //The second Scene Returns.
    public static Scene secondScene() {
        Scene scene = null;
        try {
            FXMLLoader f = new FXMLLoader(Scenes.class.getResource("secondLooking.fxml"));
            scene = new Scene(f.load());
            return scene;

        } catch (IOException e) {
            System.out.println("Error en secondScene() = " + e.getMessage());
        }
        return null;
    }
}
