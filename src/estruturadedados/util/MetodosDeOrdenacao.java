/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe util para ordenações em arrays de objetos e Objetos que implementam a
 * interface <code>List</code> 
 *
 * @author Fabrício de Araújo Santana
 */
public final class MetodosDeOrdenacao {

    private MetodosDeOrdenacao() {
    }

    /**
     * O Algoritmo Bubble Sort é bem simples, ele compara elementos adjacentes,
     * ou seja, os próximos elementos, e os troca se estiverem fora de ordem.
     * Ele não é muito utilizado, pois como ele realiza várias trocas, acaba
     * perdendo desempenho, para lista pequenas ou quase já ordenadas esse
     * algortimo pode ser o suficiente, mas para listas grandes prefira usar o
     * Quick Sort
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] vetor) {
        for (int i = 0; i < (vetor.length - 1); i++) {
            for (int j = 0; j < (vetor.length - 1 - i); j++) {
                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    T aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    /**
     * O Algoritmo Bubble Sort é bem simples, ele compara elementos adjacentes,
     * ou seja, os próximos elementos, e os troca se estiverem fora de ordem.
     * Ele não é muito utilizado, pois como ele realiza várias trocas, acaba
     * perdendo desempenho, para lista pequenas ou quase já ordenadas esse
     * algortimo pode ser o suficiente, mas para listas grandes prefira usar o
     * Quick Sort
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param lista Recebe o objeto de List a ser ordenado
     */
    public static <T extends Comparable<T>> void bubbleSort(List<T> lista) {
        for (int i = 0; i < (lista.size() - 1); i++) {
            for (int j = 0; j < (lista.size() - 1 - i); j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    T aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
    }

    /**
     * O Algoritmo Selection Sort também é bem simples, ele busca o menor
     * elemento da lista e o coloca na primeira posição, depois ele procura o
     * segundo menor valor e coloca atrás do menor valor e assim por diante. Ele
     * realiza menos trocas que o Bubble Sort, mas isso não o torna melhor, use
     * para para lista pequenas, prefira usar o Quick Sort
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     */
    public static <T extends Comparable<T>> void selectionSort(T[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int index = i;
            for (int j = (i + 1); j < vetor.length; j++) {
                if (vetor[j].compareTo(vetor[index]) < 0) {
                    index = j;
                }
            }

            T aux = vetor[i];
            vetor[i] = vetor[index];
            vetor[index] = aux;

        }
    }

    /**
     * O Algoritmo Selection Sort também é bem simples, ele busca o menor
     * elemento da lista e o coloca na primeira posição, depois ele procura o
     * segundo menor valor e coloca atrás do menor valor e assim por diante. Ele
     * realiza menos trocas que o Bubble Sort, mas isso não o torna melhor, use
     * para para lista pequenas, prefira usar o Quick Sort
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param lista Recebe o objeto de List a ser ordenado
     */
    public static <T extends Comparable<T>> void selectionSort(List<T> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            int index = i;
            for (int j = (i + 1); j < lista.size(); j++) {
                if (lista.get(j).compareTo(lista.get(index)) < 0) {
                    index = j;
                }
            }

            T aux = lista.get(i);
            lista.set(i, lista.get(index));
            lista.set(index, aux);

        }
    }

    /**
     * O Algoritmo Insertion Sort insere cada elemento na posição correta dentro
     * da parte já ordenada, sempre o que fica a esquerda está ordenado e
     * direita o que será ordenado. Ele tem um ótimo desempenho para listas
     * quase ordenadas e para listas pequenas, além disso, ele utilização uma
     * ordenação dinâmica, onde podemos colocar novos elementos sem quebrar a
     * ordenação existente. Para listas grandes prefira usar o Quick Sort
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     */
    public static <T extends Comparable<T>> void insertionSort(T[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            T aux = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j].compareTo(aux) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }

    /**
     * O Algoritmo Insertion Sort insere cada elemento na posição correta dentro
     * da parte já ordenada, sempre o que fica a esquerda está ordenado e
     * direita o que será ordenado. Ele tem um ótimo desempenho para listas
     * quase ordenadas e para listas pequenas, além disso, ele utilização uma
     * ordenação dinâmica, onde podemos colocar novos elementos sem quebrar a
     * ordenação existente. Para listas grandes prefira usar o Quick Sort
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param lista Recebe o objeto de List a ser ordenado
     */
    public static <T extends Comparable<T>> void insertionSort(List<T> lista) {
        for (int i = 1; i < lista.size(); i++) {
            T aux = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j).compareTo(aux) > 0) {
                lista.set((j + 1), lista.get(j));
                j--;
            }
            lista.set((j + 1), aux);
        }
    }

    /**
     * Método para a ordenação do tipo QuickSort, um algoritmo de ordenação
     * muito eficiente para grandes volumes de dados, onde ele trabaha com a
     * ideia de divisão e conquista de forma recursiva. Nele a lista é dividida
     * ao meio, com um elemento central que deverá ter na sua esquerda os
     * elementos menores e a sua direita os elementos maiores.
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     * @param esquerda Recebe a posição a esquerda
     * @param direita Recebe a posição a direita
     */
    public static <T extends Comparable<T>> void quickSort(T[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int particao = particaoQuickSort(vetor, esquerda, direita);
            quickSort(vetor, esquerda, particao);
            quickSort(vetor, particao + 1, direita);
        }
    }

    /**
     * Método para a ordenação do tipo QuickSort, um algoritmo de ordenação
     * muito eficiente para grandes volumes de dados, onde ele trabaha com a
     * ideia de divisão e conquista de forma recursiva. Nele a lista é dividida
     * ao meio, com um elemento central que deverá ter na sua esquerda os
     * elementos menores e a sua direita os elementos maiores.
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     * @param esquerda Recebe a posição a esquerda
     * @param direita Recebe a posição a direita
     * @param tipoOrdenacao Recebe o tipo da ordenação, se é a ordenação padrão
     * (do menor para o maior), ou se é a ordenação inversa (do maior para o
     * menor)
     */
    public static <T extends Comparable<T>> void quickSort(T[] vetor, int esquerda, int direita, TipoOrdenacao tipoOrdenacao) {
        if (esquerda < direita) {
            int particao = particaoQuickSort(vetor, esquerda, direita, tipoOrdenacao);
            quickSort(vetor, esquerda, particao, tipoOrdenacao);
            quickSort(vetor, particao + 1, direita, tipoOrdenacao);
        }
    }

    /**
     * Método para a ordenação do tipo QuickSort, um algoritmo de ordenação
     * muito eficiente para grandes volumes de dados, onde ele trabaha com a
     * ideia de divisão e conquista de forma recursiva. Nele a lista é dividida
     * ao meio, com um elemento central que deverá ter na sua esquerda os
     * elementos menores e a sua direita os elementos maiores.
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     */
    public static <T extends Comparable<T>> void quickSort(T[] vetor) {
        quickSort(vetor, 0, vetor.length - 1, TipoOrdenacao.ORDEM_NATURAL);
    }

    /**
     * Método para a ordenação do tipo QuickSort, um algoritmo de ordenação
     * muito eficiente para grandes volumes de dados, onde ele trabaha com a
     * ideia de divisão e conquista de forma recursiva. Nele a lista é dividida
     * ao meio, com um elemento central que deverá ter na sua esquerda os
     * elementos menores e a sua direita os elementos maiores.
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param lista Recebe o objeto de List a ser ordenado
     * @param esquerda Recebe a posição a esquerda
     * @param direita Recebe a posição a direita
     */
    private static <T extends Comparable<T>> void quickSort(List<T> lista, int esquerda, int direita) {
        if (esquerda < direita) {
            int particao = particacaoQuickSort(lista, esquerda, direita);
            quickSort(lista, esquerda, particao);
            quickSort(lista, (particao + 1), direita);
        }
    }

    /**
     * Método para a ordenação do tipo QuickSort, um algoritmo de ordenação
     * muito eficiente para grandes volumes de dados, onde ele trabaha com a
     * ideia de divisão e conquista de forma recursiva. Nele a lista é dividida
     * ao meio, com um elemento central que deverá ter na sua esquerda os
     * elementos menores e a sua direita os elementos maiores.
     *
     * @param <T> Para que a ordenação ocorra é necessário que a classe do vetor
     * implemente a interface comparable, para ter uma comparação entre os
     * objetos
     *
     * @param lista Recebe o objeto de List a ser ordenado
     */
    public static <T extends Comparable<T>> void quickSort(List<T> lista) {
        quickSort(lista, 0, lista.size() - 1);
    }

    /**
     * Método para dividir as classes da interface <code>List</code> ao meio
     * para a ordenação QuickSort
     *
     * @param Lista Recebe o objeto da List a ser ordenado
     * @param esquerda Recebe a posição da esquerda
     * @param direita Recebe a posição da direita
     *
     * @return Retorna a posição do elemento que é menor ou maior do que o
     * elemento centra da lista
     */
    private static <T extends Comparable<T>> int particacaoQuickSort(List<T> lista, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        T pivo = lista.get(meio);
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (lista.get(i).compareTo(pivo) < 0);

            do {
                j--;
            } while (lista.get(j).compareTo(pivo) > 0);

            if (i >= j) {
                return j;
            }

            T aux = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, aux);
        }
    }

    /**
     * Método para dividir a lista ao meio para a ordenação QuickSort
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     * @param esquerda Recebe a posição da esquerda
     * @param direita Recebe a posição da direita
     *
     * @return Retorna a posição do elemento que é menor ou maior do que o
     * elemento centra da lista
     */
    private static <T extends Comparable<T>> int particaoQuickSort(T[] vetor, int esquerda, int direita) {
        return particaoQuickSort(vetor, esquerda, direita, TipoOrdenacao.ORDEM_NATURAL);
    }

    /**
     * Método para dividir a lista ao meio para a ordenação QuickSort
     *
     * @param vetor Recebe o objeto do vetor a ser ordenado
     * @param esquerda Recebe a posição da esquerda
     * @param direita Recebe a posição da direita
     * @param tipoOrdenacao Recebe o tipo da ordenação, se é a ordenação padrão
     * (do menor para o maior), ou se é a ordenação inversa (do maior para o
     * menor)
     *
     * @return Retorna a posição do elemento que é menor ou maior do que o
     * elemento centra da lista
     */
    private static <T extends Comparable<T>> int particaoQuickSort(T[] vetor, int esquerda, int direita, TipoOrdenacao tipoOrdenacao) {
        int meio = (esquerda + direita) / 2;
        T pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            if (tipoOrdenacao == TipoOrdenacao.ORDEM_NATURAL) {
                do {
                    i++;

                } while (vetor[i].compareTo(pivo) < 0);

                do {
                    j--;

                } while (vetor[j].compareTo(pivo) > 0);

                if (i >= j) {
                    return j;
                }

            } else {
                do {
                    i++;

                } while (vetor[i].compareTo(pivo) > 0);

                do {
                    j--;

                } while (vetor[j].compareTo(pivo) < 0);

                if (i >= j) {
                    return j;
                }
            }

            T aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }

    /**
     *
     * @param <T>
     * @param vetor
     */
    public static <T extends Comparable<T>> void mergeSort(T[] vetor) {
        if (vetor.length <= 1) {
            return;
        }

        int meio = vetor.length / 2;

        T[] esquerda = Arrays.copyOfRange(vetor, 0, meio);
        T[] direita = Arrays.copyOfRange(vetor, meio, vetor.length);

        mergeSort(esquerda);
        mergeSort(direita);
        merge(vetor, esquerda, direita);
    }

    /**
     * 
     *
     * @param <T>  
     * 
     * @param vetor
     * @param esquerda
     * @param direita
     */
    private static <T extends Comparable<T>> void merge(T[] vetor, T[] esquerda, T[] direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i].compareTo(direita[j]) <= 0) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) {
            vetor[k++] = esquerda[i++];
        }

        while (j < direita.length) {
            vetor[k++] = direita[j++];
        }
    }

    /**
     *
     * @param <T>
     * @param lista
     */
    public static <T extends Comparable<T>> void mergeSort(List<T> lista) {
        if (lista.size() <= 1) {
            return;
        }

        int meio = lista.size() / 2;
        List<T> esquerda = new ArrayList<>(lista.subList(0, meio));
        List<T> direita = new ArrayList<>(lista.subList(meio, lista.size()));

        mergeSort(esquerda);
        mergeSort(direita);

        merge(lista, esquerda, direita);
    }

    /**
     *
     * @param <T>
     * @param lista
     * @param esquerda
     * @param direita
     */
    private static <T extends Comparable<T>> void merge(List<T> lista, List<T> esquerda, List<T> direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.size() && j < direita.size()) {
            if (esquerda.get(i).compareTo(direita.get(j)) <= 0) {
                lista.set(k++, esquerda.get(i++));
            } else {
                lista.set(k++, direita.get(j++));
            }
        }

        while (i < esquerda.size()) {
            lista.set(k++, esquerda.get(i++));
        }

        while (j < direita.size()) {
            lista.set(k++, direita.get(j++));
        }
    }

    /**
     *
     * @param vetor
     */
    public static void shellSort(int[] vetor) {
        int h = 1;
        int tamanhoVetor = vetor.length;

        while (h < tamanhoVetor) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int elemento, j;

        while (h > 0) {
            for (int i = h; i < tamanhoVetor; i++) {
                elemento = vetor[i];
                j = i;

                while (j >= h && vetor[j - h] > elemento) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[i] = elemento;
            }
            h = h / 2;
        }
    }
}
