package calculadora_nb;

//import java.util.StringTokenizer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calculadora extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Vista.fxml"));
        Scene scene = new Scene(root,200,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        // Compilador compilador = new Compilador();
        // StringTokenizer cadena = compilador.analisisLexico("5+3*8.5");
        // try{
        //     CompositeEA arbol = compilador.arbolDeAnalisisSintactico(cadena);
        //     double res = arbol.evalua();
        //     System.out.println(arbol.toString() + " = " + res + "\u232B");
        // }catch(SyntaxErrorException e){
        //     System.out.println("Error en el formato de la cadena.");
        // }
        launch(args);
    }
}
