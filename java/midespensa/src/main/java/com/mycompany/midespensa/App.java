package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
//import java.sql.*;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("clientes"));
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("../resources/views/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);

        /*        
        try {
            Connection conn = DBUtil.getConnection();
            
            if (conn == null) System.out.println("is null");
            // step3 create the statement object
            Statement stmt = conn.createStatement();
            
            // step4 execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE");

            while (rs.next()) {
                System.out.println(rs.getString(2));
            }

            
            DBUtil.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }
}