import java.util.*; 

public class Main {

      public static void main(String[ ] arg) {
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("------------------------ Grupo Actividad ---------------------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("----- Creación de objetos ------------------------------------------");
            System.out.println("--------------------------------------------------------------------");

            List<Cliente> listaClientes = new ArrayList();

            Cliente clienteMaximo = new Cliente("1104128887", "Máximo Álvarez");

            clienteMaximo.addMedidor("LUNDIN", "Sauces Norte",  Double.parseDouble("25.75"));
            clienteMaximo.addMedidor("CATER", "Argelia", Double.parseDouble("35"));

            listaClientes.add(clienteMaximo);

            Cliente clienteWilson = new Cliente("1104013188", "Wilson Sánchez");

            clienteWilson.addMedidor("LUNDIN", "San Sebastián", Double.parseDouble("25.75"));
            clienteWilson.addMedidor("METOR", "Centro", Double.parseDouble("25"));

            listaClientes.add(clienteWilson);

            System.out.println("---- Lista de Clientes ----");
            System.out.println(listaClientes);

            System.out.println("--------");
            System.out.println("---- Cliente 1 ----");
            System.out.println("---- Número de Medidores ----");
            System.out.println(listaClientes.get(0).numberOfMedidors());
            System.out.println("---- Lista de Medidores ----");
            System.out.println(listaClientes.get(0).getMedidors());


            System.out.println("--------");
            System.out.println("---- Cliente 2 ----");
            System.out.println("---- Número de Medidores ----");
            System.out.println(listaClientes.get(1).numberOfMedidors());
            System.out.println("---- Lista de Medidores ----");
            System.out.println(listaClientes.get(1).getMedidors());


      }
}