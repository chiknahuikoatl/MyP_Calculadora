/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class SyntaxErrorException extends Exception {

    /**
     *
     * @param error
     */
    public SyntaxErrorException(String error) {
        super(error);
    }
    
}
