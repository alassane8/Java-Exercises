/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productexception;

public class ProductException {
    protected String informations;

    protected ProductException(String info){
        informations = info;
        informations = "Erreur de saisie.";
    }
}
