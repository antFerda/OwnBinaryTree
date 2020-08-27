package main.immutable;

import java.util.function.Consumer;

public interface IMNode<T> {
    IMNode<T> add(T value);
    void forEach(Consumer<T> consumer);
    int count();
}
