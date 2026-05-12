/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados.lista;

/**
 *
 * @author arauj
 * @param <T>
 */
public abstract class ListaAbstrata<T extends Comparable<T>> implements ListaPadrao<T> {
    
    /**
     * Método que pega a posição do último elemento inserido na lista
     *
     * @param lista Recebe a lista de elementos
     * @param tamanhoTotal Recebe o tamanhoTotal da lista
     * 
     * @return Retorna a posição do último elemento
     *
     * @throws RuntimeException Caso a lista esteja vazia, ou seja, o vetor
     * tenha as posição, mas não tenha elementos
     */
    public int buscarPosicaoUltimoElemento(T[] lista, int tamanhoTotal) throws RuntimeException {
        if (estaVazia()) {
            throw new RuntimeException(MENSAGEM_LISTA_VAZIA);
        }

        int posicaoUltimoElemento = -1;

        for (int i = tamanhoTotal - 1; i >= 0; i--) {
            if (lista[i] != null) {
                return i;
            }
        }

        return posicaoUltimoElemento;
    }
}
