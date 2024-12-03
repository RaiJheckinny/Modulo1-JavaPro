import java.util.Arrays;

public class HashMap {
    private Integer[][] hashMap;  // Estrutura para armazenar pares [key, value]
    private int size;            // Número atual de elementos no mapa

    // Construtor para inicializar o mapa com capacidade inicial
    public HashMap(int capacity) {
        this.hashMap = new Integer[capacity][2];
        this.size = 0;
    }

    // Método para adicionar ou atualizar uma chave com um valor
    public void put(Integer key, Integer value) {
        // Verifica se a chave já existe no mapa
        for (int i = 0; i < size; i++) {
            if (hashMap[i][0].equals(key)) {  // Atualiza o valor se a chave for encontrada
                hashMap[i][1] = value;
                return;
            }
        }

        // Insere uma nova chave-valor se não estiver no mapa
        if (size >= hashMap.length) {
            expandCapacity();  // Expande a capacidade se necessário
        }
        hashMap[size][0] = key;
        hashMap[size][1] = value;
        size++;
    }

    // Método para obter o valor associado a uma chave
    public Integer get(Integer key) {
        for (int i = 0; i < size; i++) {
            if (hashMap[i][0].equals(key)) {
                return hashMap[i][1];
            }
        }
        return null;  // Retorna null se a chave não for encontrada
    }

    // Método para exibir o conteúdo do mapa
    public String getList() {
        return "HashMap{" +
                "hashMap=" + Arrays.deepToString(Arrays.copyOf(hashMap, size)) +
                '}';
    }
    private void expandCapacity() {
        hashMap = Arrays.copyOf(hashMap, hashMap.length * 2);
    }
}
