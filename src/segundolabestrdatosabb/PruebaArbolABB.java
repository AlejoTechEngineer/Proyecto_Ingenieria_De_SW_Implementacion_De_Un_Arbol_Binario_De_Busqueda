/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundolabestrdatosabb;

/**
 *
 * @author gran_
 */
public class PruebaArbolABB 
{
    public static void main(String[] args) {
        System.out.println("\n===== INICIO DE PRUEBAS DEL ÁRBOL BINARIO DE BÚSQUEDA =====\n");
        
        ArbolABB abb = new ArbolABB();

        // Insertamos valores en el árbol
        System.out.println("\nPrueba: Inserción de elementos\n");
        abb.insertar(10);
        abb.insertar(5);
        abb.insertar(15);
        abb.insertar(10); // Se almacena en la lista del nodo con 10
        abb.insertar(20);
        abb.insertar(5); // Se almacena en la lista del nodo con 5
        abb.mostrarElementos();

        // Insertar nuevos elementos
        System.out.println("\nPrueba: Inserción de nuevos elementos\n");
        abb.limpiarUltimosInsertados();
        abb.insertar(7);
        abb.insertar(9);
        abb.insertar(25);
        abb.mostrarUltimosInsertados();
        abb.mostrarElementos();

        // Recorridos del árbol antes de eliminar
        System.out.println("\nPrueba: Recorridos del árbol antes de eliminar\n");
        System.out.print("Recorrido Inorden: "); abb.inOrden();
        System.out.print("Recorrido Preorden: "); abb.preOrden();
        System.out.print("Recorrido Posorden: "); abb.posOrden();

        // Eliminación de un nodo
        System.out.println("\nPrueba: Eliminación de un elemento (10)\n");
        abb.eliminar(10);

        // Recorridos del árbol después de eliminar
        System.out.println("\nPrueba: Recorridos del árbol después de eliminar\n");
        System.out.print("Recorrido Inorden: "); abb.inOrden();
        System.out.print("Recorrido Preorden: "); abb.preOrden();
        System.out.print("Recorrido Posorden: "); abb.posOrden();

        // Verificación de búsqueda
        System.out.println("\nPrueba: Búsqueda de elementos\n");
        System.out.println("¿El 15 está en el árbol?: " + (abb.buscar(15) ? "Sí" : "No"));
        System.out.println("¿El 10 está en el árbol?: " + (abb.buscar(10) ? "Sí" : "No"));
        System.out.println("¿El 100 está en el árbol?: " + (abb.buscar(100) ? "Sí" : "No"));

        System.out.println("\n===== FIN DE PRUEBAS =====\n");
    }
    
}
