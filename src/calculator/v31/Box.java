package calculator.v31;

//수를 감싸주는 클래스 모든 수는 이걸로 감싸진다
public class Box <T extends Number>{

    private T value;

    public Box(T item) {
        this.value = item;
    }

    public T getValue() {
        return value;
    }


}
