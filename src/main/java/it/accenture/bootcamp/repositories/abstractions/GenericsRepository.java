package it.accenture.bootcamp.repositories.abstractions;

import it.accenture.bootcamp.models.Edition;

import java.util.List;
import java.util.Optional;

public interface GenericsRepository<K, T> {
    Iterable<T> findAll();

    void delete(T c);

    void deleteById(K id);

    Optional<T> findById(K id);

    T save(T c);

    boolean existsById(K id);

}
