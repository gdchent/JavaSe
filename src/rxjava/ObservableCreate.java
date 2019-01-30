package rxjava;

public class ObservableCreate<T> extends Observable<T>{

    final ObservableOnSubscribe<T> source;

    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }


}
