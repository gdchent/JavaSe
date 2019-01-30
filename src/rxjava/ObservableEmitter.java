package rxjava;

public interface ObservableEmitter<T> extends Emitter<T>{

    void setDisposable(Disposable d);

    /**
     * Sets a Cancellable on this emitter; any previous Disposable
     * or Cancellation will be unsubscribed/cancelled.
     * @param c the cancellable resource, null is allowed
     */
    //void setCancellable(@Nullable Cancellable c);

    /**
     * Returns true if the downstream disposed the sequence or the
     * emitter was terminated via {@link #onError(Throwable)}, {@link #onComplete} or a
     * successful {@link #tryOnError(Throwable)}.
     * <p>This method is thread-safe.
     * @return true if the downstream disposed the sequence or the emitter was terminated
     */
    boolean isDisposed();
}
