package practiceDemo15;

public class BasicGenerator<T> implements Generator<T> {
    Class<T> type;
    public BasicGenerator(Class<T> type) {
        this.type=type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
           throw new RuntimeException();
        }
    }

}
