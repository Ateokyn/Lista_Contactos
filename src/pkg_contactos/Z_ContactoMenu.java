package pkg_contactos;

import java.util.Scanner;

public abstract class Z_ContactoMenu {
    //Tipos de variables.
    protected String Agregar, ListaC;
    //Esta variable es estatica porque necesito conservar su valor.
    protected static String Ver;
    public Scanner in = new Scanner(System.in);

    //Metodo on el menu para el usuario.
    public void MenuContactos() {
        //Tipos de variables locales, solo para este metodo.
        int seleccion = 0;
        int bandera = 0;

        //Este ciclo es para las opciones y para que el usuario cierre el programa.
        do {
            //Este ciclo para por si el ususario ingresa un valor que no esta en el menu, y el programa siga jalamdo.
            do {
                System.out.println("Contactos");
                System.out.println("    Seleccione una opcion:");
                System.out.println("     1. Agregar contacto");
                System.out.println("     2. Ver lista de contactos");
                System.out.println("     3. Salir.");
                System.out.print("Ingresar Opcion : ");
                seleccion = in.nextInt();

                //Si seleccion es igual 1,2 o 3 se realizara la siguiente condicion.
                if (seleccion >= 1 && seleccion <= 3) {
                    //Si seleccion es mayor igual a 1 y menor igual a 3, el programa pasara a la siguiente condicion.
                    //Bandera cambia a 1 para que el ciclo cierre y empieze el siguiente.
                    bandera = 2;
                } else {
                    //Si seleccion es menor igual a 1 y mayor igual a 3, el programa sigue ejecutando
                    //y le avisa al usuario de que la opcion no existe.
                    System.out.println("----------------------------------------------------");
                    System.out.println("Lo sentimos la opcion no existe, intentelo de nuevo.");
                    System.out.println("----------------------------------------------------");
                    System.out.println("");
                    //Bandera conserva su valor para que el ciclo siga ciclando.
                    bandera = 1;
                }
            } while (bandera == 1);

            if (seleccion == 1) {
                A_AgregarContactos agg = new A_AgregarContactos();
                agg.ListaC();
            } else if (seleccion == 2) {
                C_VisualizarContacto visualizar = new C_VisualizarContacto();
                visualizar.ListaC();
            } else if (seleccion == 3) {
                System.out.println("----------------------");
                System.out.println("Gracias vuelva pronto.");
                System.out.println("----------------------");
                bandera = 2;
                
            } 
        } while (bandera != 2);
    }
    

    public String getAgregar() {
        return Agregar;
    }

    public void setAgregar(String Agregar) {
        this.Agregar = Agregar;
    }


    public String getVer() {
        return Ver;
    }

    public void setVer(String Ver) {
        this.Ver = Ver;
    }

    public abstract void ListaC();

}
