package it.accenture.bootcamp.services.abstractions;

import java.util.Optional;

public interface AbstractCrudService<T, K> {
    Iterable<T> getAll();
    Optional<T> findById(K k);
    void deleteById(K k);
    void delete(T t);
    T saveOrUpdate(T t);
    boolean exists(K id);
}
