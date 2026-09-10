import java.util.List;

public class AlgoritmoVinte {

    public void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        // Faz exatamente a mesma coisa que: n -> System.out.println(n)
        numeros.forEach(System.out::println);
    }

}
