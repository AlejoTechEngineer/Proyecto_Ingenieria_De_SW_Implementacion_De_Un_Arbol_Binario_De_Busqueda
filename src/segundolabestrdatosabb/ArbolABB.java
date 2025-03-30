/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundolabestrdatosabb;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gran_
 */
public class ArbolABB 
{
    private NodoABB raiz;
    private List<Integer> ultimosInsertados;  // Lista para almacenar los últimos elementos insertados
    private List<Integer> nuevosInsertados;   // Solo para la última ejecución

    public ArbolABB() 
    {
        this.raiz = null;
        this.ultimosInsertados = new ArrayList<>();
        this.nuevosInsertados = new ArrayList<>();
    }
    public void mostrarElementos()
    {
        System.out.print("Elementos en el arbol");
        mostrarElementos(raiz);
        System.out.println();
    }
    private void mostrarElementos(NodoABB nodo)
    {
        if(nodo == null)
        {
            return;
        }
        System.out.print(nodo.datos + " ");//Imprime el valor del nodo
        mostrarElementos(nodo.izquierda);//Llama al subarbol izquierdo
        mostrarElementos(nodo.derecha);//Llama al subarbol derecho
    }
    
    // Método para limpiar la lista de nuevos insertados antes de cada inserción múltiple
    public void limpiarUltimosInsertados() 
    {
        nuevosInsertados.clear();
    }
       
    // Método para insertar un elemento en el árbol
    public void insertar(int dato) 
    {
        raiz = insertarRec(raiz, dato);
        ultimosInsertados.add(dato); // Agrega el dato a la lista de últimos insertados
        nuevosInsertados.add(dato);  // Solo almacena los insertados en esta ejecución
    }

    private NodoABB insertarRec(NodoABB nodo, int dato) 
    {
        if (nodo == null) 
        {
            return new NodoABB(dato);
        }
        if (dato == nodo.datos.get(0)) 
        { // Si el valor ya existe, lo agregamos a la lista
            nodo.datos.add(dato);
        } 
        else if (dato < nodo.datos.get(0)) 
        {
            nodo.izquierda = insertarRec(nodo.izquierda, dato);
        } 
        else 
        {
            nodo.derecha = insertarRec(nodo.derecha, dato);
        }
        return nodo;
    }
    // Método para mostrar los últimos elementos insertados en el árbol
    public void mostrarUltimosInsertados() 
    {
        System.out.println("Ultimos elementos insertados: " + nuevosInsertados);
    }

    // Método para recorrer el árbol en inorden
        public void inOrden() 
        {
            inOrderRec(raiz);
            System.out.println();
        }

        private void inOrderRec(NodoABB nodo) 
        {
            if (nodo != null) 
            {
                inOrderRec(nodo.izquierda);
                System.out.print(nodo.datos + " ");  // Imprime la lista de valores del nodo
                inOrderRec(nodo.derecha);
            }
        }
        
        public void preOrden() 
        {
            preOrdenRec(raiz);
            System.out.println();
        }

        private void preOrdenRec(NodoABB nodo) 
        {
            if (nodo != null) 
            {
                System.out.print(nodo.datos + " ");
                preOrdenRec(nodo.izquierda);
                preOrdenRec(nodo.derecha);
            }
        }

        public void posOrden() 
        {
            posOrdenRec(raiz);
            System.out.println();
        }

        private void posOrdenRec(NodoABB nodo) 
        {
            if (nodo != null) 
            {
                posOrdenRec(nodo.izquierda);
                posOrdenRec(nodo.derecha);
                System.out.print(nodo.datos + " ");
            }
        }
        //Borrado de elementos
        public void eliminar(int dato) 
        {
        raiz = eliminarRec(raiz, dato);
        }

        private NodoABB eliminarRec(NodoABB nodo, int dato) 
        {
            if (nodo == null) 
            {
                return nodo;
            }

            if (dato < nodo.datos.get(0)) 
            {
                nodo.izquierda = eliminarRec(nodo.izquierda, dato);
            }
            else if (dato > nodo.datos.get(0)) 
            {
                nodo.derecha = eliminarRec(nodo.derecha, dato);
            }
            else 
            {
                // 🔹 Luego imprimir que se va a eliminar el nodo
                System.out.println("\n***Eliminando el dato***: " + dato +"\n");
                
                // 🔹 Si el nodo tiene múltiples valores, eliminar solo uno de la lista
                if (nodo.datos.size() > 1) 
                {
                    nodo.datos.remove(0);  // Elimina solo una ocurrencia del valor
                    return nodo;
                }
                // 🔹 Si solo hay un valor en la lista, aplicar eliminación normal
                System.out.println("Eliminando nodo con valor: " + dato);
                
                // Caso 1: Nodo sin hijos o con un solo hijo
                if (nodo.izquierda == null) 
                {
                    return nodo.derecha;
                }
                else if (nodo.derecha == null) 
                {
                    return nodo.izquierda;
                }
                // Caso 2: Nodo con dos hijos -> Encontramos el sucesor inmediato (mínimo del subárbol derecho)
                nodo.datos.set(0, encontrarMinimo(nodo.derecha).datos.get(0));
                nodo.derecha = eliminarRec(nodo.derecha, nodo.datos.get(0));
            }
            return nodo;
        }
        // Método auxiliar para encontrar el nodo con el valor mínimo en un subárbol
        private NodoABB encontrarMinimo(NodoABB nodo) 
        {
            while (nodo.izquierda != null) 
            {
                nodo = nodo.izquierda;
            }
            return nodo;
        }
        public boolean buscar(int valor) 
        {
            return buscarNodo(raiz, valor);
        }

        private boolean buscarNodo(NodoABB nodo, int valor) 
        {
            if (nodo == null) 
            {
                return false;
            }
            if (nodo.datos.contains(valor))
            {
                return true;
            }
            return valor < nodo.datos.get(0) ? buscarNodo(nodo.izquierda, valor) : buscarNodo(nodo.derecha, valor);
        }


}



