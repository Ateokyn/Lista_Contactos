/*
 *Waifus Informaticas| FBI
 */
package pkg_contactos;


/**
 *
 * @author Juana Isabel
 */
public class Apt_Contactos {
    public static void main(String[]args){
        //Metodo principal de arranque.
        Z_ContactoMenu menu = new C_VisualizarContacto();
        menu.setVer("Lista de contactos: \n\n");
        menu.MenuContactos();
    }
}
