package com.ponomic.hospitalmanagementsystem.utilities;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowLoader {

    public static void loadWindow(String fxmlFilePath, Stage parentStage){

        try {
            FXMLLoader loader = new FXMLLoader(WindowLoader.class.getResource(fxmlFilePath));
            Parent root = loader.load();

            double width = parentStage.getWidth();
            double height = parentStage.getHeight();

            Stage stage = new Stage();

            stage.setScene(new Scene(root, width, height));
            stage.show();
            parentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
