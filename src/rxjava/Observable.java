package rxjava;


//抽象的观察者类
public abstract class Observable<T> implements ObservableSource<T> {

    @Override
    public void subscribe(Observer<? super T> observer) {

    }


    //在ObSevable里面写一个create方法用来创建Obserable实例
    public static <T> Observable<T> create(ObservableOnSubscribe<T> source){
        return RxJavaPlugins.onAssembly(new ObservableCreate<T>(source));
    }
}
