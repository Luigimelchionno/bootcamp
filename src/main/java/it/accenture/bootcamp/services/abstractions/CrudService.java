package it.accenture.bootcamp.services.abstractions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrudService<T, K, R extends JpaRepository<T, K>> implements AbstractCrudService<T, K>{

    private R repo;

    public CrudService(R repo){
        this.repo = repo;
    }

    @Override
    public Iterable<T> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<T> findById(K k) {
        return Optional.empty();
    }

    @Override
    public void deleteById(K k) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T saveOrUpdate(T t) {
        return null;
    }

    @Override
    public boolean exists(K id) {
        return false;
    }
}
