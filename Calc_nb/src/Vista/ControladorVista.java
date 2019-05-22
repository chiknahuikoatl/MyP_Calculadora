package Vista;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.StringTokenizer;
import Modelo.Compilador;
import Modelo.CompositeEA;
import Modelo.SyntaxErrorException;


public class ControladorVista implements Initializable {

    @FXML
    private TextArea disp;
    @FXML
    private Button suma, resta, div, mul, raiz, sen, cos, tan;
    @FXML
    private Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;
    @FXML
    private Button del, limpia;
    @FXML
    private Button pizq, pder, mvi, mvd, pto;
    @FXML
    private Button igual;

    @FXML
    private void sum(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"+");
    }

    @FXML
    private void rest(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"-");
    }

    @FXML
    private void divi(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"/");
    }

    @FXML
    private void multi(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"*");
    }

    @FXML
    private void pari(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"(");
    }

    @FXML
    private void pard(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),")");
    }

    @FXML
    private void zero(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"0");
    }

    @FXML
    private void un(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"1");
    }

    @FXML
    private void deux(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"2");
    }

    @FXML
    private void trois(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"3");
    }

    @FXML
    private void quatre(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"4");
    }

    @FXML
    private void cinq(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"5");
    }

    @FXML
    private void six(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"6");
    }

    @FXML
    private void sept(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"7");
    }

    @FXML
    private void huit(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"8");
    }

    @FXML
    private void neuf(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"9");
    }

    @FXML
    private void punto(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),".");
    }

    @FXML
    private void limp(ActionEvent evento){
        disp.clear();
    }

    @FXML
    private void atras(ActionEvent evento){
        disp.backward();
    }

    @FXML
    private void adelante(ActionEvent evento){
        disp.forward();
    }

    @FXML
    private void borra(ActionEvent evento){
        disp.deletePreviousChar();
    }

    @FXML
    private void root(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"\u221A()");
        disp.backward();
    }

    @FXML
    private void seno(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"sin()");
        disp.backward();
    }

    @FXML
    private void coseno(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"cos()");
        disp.backward();
    }

    @FXML
    private void tangente(ActionEvent evento){
        disp.insertText(disp.getCaretPosition(),"tan()");
        disp.backward();
    }

    @FXML
    private void resuelve(ActionEvent evento){
        Compilador compi = new Compilador();
        StringTokenizer tokens = compi.analisisLexico(disp.getText());
        try{
            CompositeEA expresion = compi.arbolDeAnalisisSintactico(tokens);
            disp.clear();
            disp.insertText(disp.getCaretPosition(),""+expresion.evalua());
        }catch(SyntaxErrorException e){
            disp.clear();
            disp.appendText(e+"");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("Inicio");
        disp.setWrapText(true);
    }
}
