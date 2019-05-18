import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Controlador implements Initializable {

    @FXML
    private TextArea disp;
    @FXML
    private Button suma, resta, div, mul, raiz, sen, cos, tan;
    @FXML
    private Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;
    @FXML
    private Button del, clear;
    @FXML
    private Button pizq, pder, mvi, mvd, pto;
    @FXML
    private Button igual;

    @FXML
    private void suma(ActionEvent evento){
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("Inicio");
    }

}
