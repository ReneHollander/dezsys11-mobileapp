package at.renehollander.mobileapp.util;

public interface Callback<E, D> {

    void call(E e, D data);

}
