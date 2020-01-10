package rxjava;



public final class RxJavaPlugins {



    static volatile Function<? super Observable, ? extends Observable> onObservableAssembly;

    public static <T> Observable<T> onAssembly(Observable<T> source) {
        Function<? super Observable, ? extends Observable> f = onObservableAssembly;
        if (f != null) {
            return apply(f, source);
        }
        return source;
    }

    static <T, R> R apply(Function<T, R> f, T t) {

        try {
            return f.apply(t);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static <T> Observer<? super T> onSubscribe(Observable<T> source,Observer<? super T> observer) {
//        BiFunction<? super Observable, ? super Observer, ? extends Observer> f = onObservableSubscribe;
//        if (f != null) {
//            return apply(f, source, observer);
//        }
        return observer;
    }
}
