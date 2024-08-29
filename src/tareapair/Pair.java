package tareapair;

/**
 *
 * @author juan_
 */
public class Pair<T, U> {
    private T dato1;
    private U dato2;

    public Pair(T dato1, U dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public T getDato1() {
        return dato1;
    }

    public U getDato2() {
        return dato2;
    }

    @Override
    public String toString() {
        return "Pair{ datoss1: (" + dato1.toString() + "), datos2: (" + dato2.toString() + ") }";
    }
}