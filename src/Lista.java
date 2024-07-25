
public class Lista<
        T> {
    private String[] array;
    private int pos = 0;
    int tamanho;
    public Lista(int tamanho) {
        array = new String[tamanho];
    }
    public void adicionar(String item) throws ArrayOutOfSpaceException {
        if(pos >= array.length){
            throw new ArrayOutOfSpaceException();
        }
        array[pos] = item;
        pos ++;
    }

    public String get(int indice) throws ArrayIndexOutOfBoundsException {
        if(indice >= getTamanho())
            throw new ArrayIndexOutOfBoundsException();

        return array[indice];
    }

    public void remover(int indice) throws ArrayIndexOutOfBoundsException {
        if(indice >= getTamanho())
            throw new ArrayIndexOutOfBoundsException();

        for(int i = indice + 1; i < getTamanho(); i++){
            array[i - 1] = array[i];
        }
        pos--;
    }

    // [b, c]

    public void remover(String item) {
        int indice = -1;
        for(int i = 0; i < getTamanho(); i++){
            if(array[i].equals(item)){
                remover(i);
                return;
            }
        }
    }
    public int getTamanho() {
        return tamanho;
    }
    public int getIndice(String item){
        for(int i = 0; i < getTamanho(); i++){
            if(array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(String item) {
        for(int i = 0; i < getTamanho(); i++){
            if(array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    private class ArrayOutOfSpaceException extends Exception {
    }
}