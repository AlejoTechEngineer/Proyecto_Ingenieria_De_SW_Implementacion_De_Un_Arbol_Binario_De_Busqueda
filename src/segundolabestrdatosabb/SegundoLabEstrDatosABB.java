/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundolabestrdatosabb;

/**
 *
 * @author gran_
 */
public class SegundoLabEstrDatosABB 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        ArbolABB abb = new ArbolABB();

        //Titulo del laboratorio
        System.out.println("\n***LABORATORIO DE IMPLEMENTACION DE UN ARBOL BINARIO DE BUSQUEDA***");
        // Insertamos valores en el árbol
        abb.insertar(10);
        abb.insertar(5);
        abb.insertar(15);
        abb.insertar(10); // Se almacena en la lista del nodo con 10
        abb.insertar(20);
        abb.insertar(5); // Se almacena en la lista del nodo con 5
        
        //Recorrido en preorden, inorden y posorden (sin imprimir).
        System.out.print("\n1.RECORRIDO EN PREORDEN, INORDEN Y POSORDEN (SIN IMPRIMIR)");
        System.out.println();

        //Mostrar los elementos del árbol
        System.out.println("\n2.IMPRESION DE LOS ELEMENTOS DEL ARBOL");
        abb.mostrarElementos();
        
        //Insertar elementos al árbol
        System.out.println("\n3.INSERCION DE ELEMENTOS AL ARBOL");
        abb.limpiarUltimosInsertados();
        abb.insertar(7);
        abb.insertar(9);
        abb.insertar(25);
        
        // Mostrar únicamente los últimos elementos insertados
        abb.mostrarUltimosInsertados();
        
        //Mostrar los elementos del árbol con la inserción
        System.out.println("\n***Impresion De Todos Los Elementos Del Arbol Incluyendo Los Insertados***");
        abb.mostrarElementos();
        
        // Estado del árbol antes de eliminar
        System.out.println("\n4.PROCESO DE BORRADO DE ELEMENTOS");
        System.out.println("Estado actual del arbol antes de eliminar:");
        System.out.print("Recorrido Inorden antes de eliminar: "); abb.inOrden();
        System.out.print("Recorrido Preorden antes de eliminar: "); abb.preOrden();
        System.out.print("Recorrido Posorden antes de eliminar: "); abb.posOrden();
        
        //En este caso se va a proceder a eliminar el valor 10, 
        //Si se requiere eliminar otro valor cambiar en la linea de abajo 10 por el valor requerido
        abb.eliminar(10);
        
        System.out.println("***Impresion De Todos Los Elementos Del Arbol Despues De Eliminar***");
        abb.mostrarElementos();

        // Estado del árbol después de eliminar
        System.out.println("\nEstado actual del arbol despues de eliminar:");
        System.out.print("Recorrido Inorden despues de eliminar: "); abb.inOrden();
        System.out.print("Recorrido Preorden despues de eliminar: "); abb.preOrden();
        System.out.print("Recorrido Posorden despues de eliminar: "); abb.posOrden();
    }
}
