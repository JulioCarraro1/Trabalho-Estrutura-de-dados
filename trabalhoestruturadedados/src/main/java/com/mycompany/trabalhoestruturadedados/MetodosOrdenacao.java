public class MetodosOrdenacao {

    // Método de Ordenação por Inserção
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Método de Ordenação por Seleção
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Método de Ordenação Bolha (Bubble Sort)
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Método para ordenar e exibir o vetor de acordo com a escolha do método
    public static void sortAndDisplay(int[] array, int choice) {
        switch (choice) {
            case 0:
                insertionSort(array);
                JOptionPane.showMessageDialog(null, "Vetor Ordenado usando Ordenação por Inserção:\n" + arrayToString(array));
                break;
            case 1:
                selectionSort(array);
                JOptionPane.showMessageDialog(null, "Vetor Ordenado usando Ordenação por Seleção:\n" + arrayToString(array));
                break;
            case 2:
                bubbleSort(array);
                JOptionPane.showMessageDialog(null, "Vetor Ordenado usando Ordenação Bolha (Bubble Sort):\n" + arrayToString(array));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }

    // Método auxiliar para converter o vetor em uma string formatada
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
