/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados.lista;

/**
 *
 * @author arauj
 */
public class TesteLista {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<Integer>(10);

        lista.adicionar(5, 4);
        lista.adicionar(6, 5);
        lista.adicionar(1, 8);
        lista.colocarValoresNullNoFim();
        
        System.out.println(lista.imprimirListaCompleta());
    }
}
