/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estruturadedados.util;

/**
 * Interface com métodos mais avançadas para a remoções de listas, tendo métodos
 * que remover mais de um elemento da lista. Esses métodos devem ser
 * implementadas em listas que permitam a manipulação de qualquer elemento e de
 * qualquer posição. Caso queria implementar em pilhas ou filas, analise como
 * será feita a remoção para que a regra principal dessas estruturas não seja
 * quebrada na execução do código
 *
 * @author Fabrício de Araújo Santana
 */
public interface RemocoesAvancadas {

    /**
     * Método que remove vários elementos, recebendo uma quantidade de elementos
     * a ser removidos e removendo estes elementos. Ele sempre começa da posição
     * inicial da lista
     *
     * @param quantidade Recebe a quantidade de elementos a ser removidos
     *
     * @throws RuntimeException Caso a lista esteja vazia, ou seja, o vetor
     * tenha as posição, mas não tenha elementos
     *
     * @throws ArrayIndexOutOfBoundsException Caso a posição passada pelo
     * usuário não corresponda a uma posição válida dentro da lista.
     *
     * @throws IllegalArgumentException Caso a posição seja válida, porém o
     * elemento da posição seja um valor null, ou seja, sem valor
     */
    void removerPorQuantidade(int quantidade) throws RuntimeException, IllegalArgumentException, ArrayIndexOutOfBoundsException;

    /**
     * Método que remove vários elementos, recebendo uma quantidade de elementos
     * a ser removidos e removendo estes elementos, partindo de uma posição
     * inicial definada via parâmetro.
     *
     * @param inicio Recebe o ínicio da remoção dos elementos
     * @param quantidade Recebe a quantidade de elementos a ser removidos
     *
     * @throws RuntimeException Caso a lista esteja vazia, ou seja, o vetor
     * tenha as posição, mas não tenha elementos
     *
     * @throws ArrayIndexOutOfBoundsException Caso a posição passada pelo
     * usuário não corresponda a uma posição válida dentro da lista.
     *
     * @throws IllegalArgumentException Caso a posição seja válida, porém o
     * elemento da posição seja um valor null, ou seja, sem valor
     */
    void removerPorQuantidade(int inicio, int quantidade) throws RuntimeException, IllegalArgumentException, ArrayIndexOutOfBoundsException;

    /**
     * Método que remove vários elementos, que esteja em um determinado range. O
     * método pega a posição que foi passada como inicio e vai removendo até a
     * posição final - 1.
     *
     * @param posicaoInicial Recebe a posição inicial que deve ser excluída
     * @param posicaoFinal Recebe a posição final que deve ser excluída
     *
     * @throws RuntimeException Caso a lista esteja vazia, ou seja, o vetor
     * tenha as posição, mas não tenha elementos
     *
     * @throws ArrayIndexOutOfBoundsException Caso a posição passada pelo
     * usuário não corresponda a uma posição válida dentro da lista.
     *
     * @throws IllegalArgumentException Caso a posição seja válida, porém o
     * elemento da posição seja um valor null, ou seja, sem valor
     */
    void removerPorRange(int posicaoInicial, int posicaoFinal) throws RuntimeException, IllegalArgumentException, ArrayIndexOutOfBoundsException;

}
