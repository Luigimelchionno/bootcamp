package it.accenture.bootcamp.repositories.implementations;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.accenture.bootcamp.repositories.abstractions.GenericsRepository;

public class JpaGenericsRepository<K, T> implements GenericsRepository<K, T> {

    protected Class<?> entityClass;
    protected EntityManager em;

    public JpaGenericsRepository(Class<?> entityClass, EntityManager em) {
        this.entityClass = entityClass;
        this.em = em;
    }

    @Override
    public Iterable<T> findAll() {
        @SuppressWarnings("unchecked")
        List<T> cl = (List<T>) em.createQuery(String.format("from %s", entityClass.getSimpleName()), entityClass)
                .getResultList();
        return cl;
    }

    @Override
    public void delete(T c) {
        em.remove(c);
    }

    @Override
    public void deleteById(K id) {
        Query q = em.createQuery(String.format("DELETE FROM %s WHERE id=:id", entityClass.getSimpleName()));
        q.setParameter("id", id);
        q.executeUpdate();
    }

    @Override
    public Optional<T> findById(K id) {
        @SuppressWarnings("unchecked")
        T c = (T) em.find(entityClass, id);
        return c == null ? Optional.empty() : Optional.of(c);
    }

    @Override
    public T save(T c) {
        T cr = em.merge(c);
        return cr;
    }

    @Override
    public boolean existsById(K id) {
        return findById(id).isPresent();
    }

}
