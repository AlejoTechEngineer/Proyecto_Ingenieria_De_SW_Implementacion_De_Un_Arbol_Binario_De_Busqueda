package segundolabestrdatosabb;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gran_
 */
public class NodoABB 
{
    ArrayList<Integer> datos;  // Lista para almacenar múltiples valores
    NodoABB izquierda, derecha;

    public NodoABB(int dato) 
    {
        datos = new ArrayList<>();
        datos.add(dato);
        izquierda = derecha = null;
    }
}
