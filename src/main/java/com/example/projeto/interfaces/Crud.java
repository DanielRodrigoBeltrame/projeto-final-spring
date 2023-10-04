package com.example.projeto.interfaces;

import java.util.List;

public interface Crud <T,V> {

    List<T> findAll();
    T findById(V id);
    T save(T request);
    T update(V id, T request);
    void deleteById(V id);

}
