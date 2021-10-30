package sakib_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class UnresolvedInputException extends Exception {
    UnresolvedInputException(){
        super("Animal size is negative");
    }
}
