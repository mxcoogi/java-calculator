package calculator.v31;

public class Box <T extends Number>{

    private T value;

    public Box(T item) {
        this.value = item;
    }

    public T getValue() {
        return value;
    }


}
