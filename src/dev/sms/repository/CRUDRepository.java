package dev.sms.repository;

import java.util.Set;

public interface CRUDRepository <T>{
    void save(T t);
    void delete(T t);
    void delete(long id);
    void update(T t);
    void update(long id);
    Set<T> findAll();
    T findById(long id);
}
