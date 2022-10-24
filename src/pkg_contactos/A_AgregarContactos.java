package pkg_contactos;

public class A_AgregarContactos extends Z_ContactoMenu {

    @Override
    public void ListaC() {
        String nombre_A = "", numero_A = "";
        int acceso = 0;
        do {
            System.out.print("\nIngresar nombre : ");
            nombre_A = in.nextLine();
            System.out.print("Ingresar numero : ");
            numero_A = in.nextLine();

            if (nombre_A.equals("") && numero_A.equals("")) {
                System.out.println("Los campos estan vacios.");
                acceso = 2;
            }else{
                acceso = 1;
            }
        } while (acceso == 2);
        ListaC = getVer();
        Agregar = nombre_A + " / " + numero_A + "\n";
        setVer(ListaC + Agregar);
        
        System.out.println("----------------------------");
        System.out.println("Contacto agregado con exito.");
        System.out.println("----------------------------");
        

    }
}
