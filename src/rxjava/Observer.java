package rxjava;


//这个是观察者接口
public interface Observer<T> {

    void onSubscribe(Disposable d);


    void onNext(T t);


    void onError(Throwable e);


    void onComplete();
}
