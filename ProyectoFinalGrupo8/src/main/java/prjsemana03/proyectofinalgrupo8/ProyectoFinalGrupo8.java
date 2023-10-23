/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author Steven
 * Isaac Alonso Quesada Salas
 * Johnny Núñez Hernández
 */
public class ProyectoFinalGrupo8 {

    public static void main(String[] args) {
      clsPilaCheques pilaCheques = new clsPilaCheques();
      clsHelper clsH = new clsHelper();
      
      
      pilaCheques.ingresarCheque();
      
      pilaCheques.ingresarCheque();
      clsH.imprimeMensaje(pilaCheques.imprimirPila());
      pilaCheques.ingresarCheque();
      
      pilaCheques.ingresarCheque();
      clsH.imprimeMensaje(pilaCheques.imprimirPila());

      pilaCheques.firmaCheque();
      clsH.imprimeMensaje(pilaCheques.imprimirPila());
      
      pilaCheques.firmaCheque();
      pilaCheques.firmaCheque();
      clsH.imprimeMensaje(pilaCheques.imprimirPila());
    }
}
