package com.jitemizer.core.ports;


public interface JItemizerCRUDPort<T> {
    T create(String name);
    T update(T item);
    T getById(long id);

    boolean delete(long id);
}
