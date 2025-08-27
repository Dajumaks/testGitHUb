import java.util.ArrayList;
import java.util.List;

public class Manager {
    Private List<Integer> numeros;

    public Manager() {
        this.numeros = new ArrayList<>();
    }
    public void addNumero(int numero){
        this.numeros.add(numero);
    }

    Public  int getSuma(){
        int suma = 0;
        for(int numero: this.numeros) {
            suma += numero;
        }
        return total;
    }
}
