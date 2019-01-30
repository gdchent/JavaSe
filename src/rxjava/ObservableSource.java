package rxjava;


//这个是观察者接口
public interface ObservableSource<T> {


    //产生订阅  暴露一个Observer实例
    void subscribe(Observer<? super T> observer);
}
