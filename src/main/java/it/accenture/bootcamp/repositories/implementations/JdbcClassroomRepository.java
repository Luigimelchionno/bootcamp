package it.accenture.bootcamp.repositories.implementations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.accenture.bootcamp.models.Classroom;
import it.accenture.bootcamp.repositories.abstractions.ClassroomRepository;

@Repository
@Profile("jdbc")
public class JdbcClassroomRepository  {
/*
    private JdbcTemplate template;

    @Autowired
    public JdbcClassroomRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Classroom> findAll() {
        return template.query("SELECT * FROM CLASSROOM", this::rowMapper);
    }

    @Override
    public List<Classroom> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Classroom> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Classroom> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public <S extends Classroom> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Classroom> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Classroom> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Classroom> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Classroom> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Classroom getOne(Long aLong) {
        return null;
    }

    @Override
    public Classroom getById(Long aLong) {
        return null;
    }

    @Override
    public Classroom getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Classroom> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Classroom> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Classroom> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Classroom> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Classroom> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Classroom> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Classroom, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    private Classroom rowMapper(ResultSet rs, int rownNum) throws SQLException {
        Boolean projector = rs.getBoolean("PROJECTOR");
        if (rs.wasNull()) {
            projector = null;
        }
        Boolean mainPc = rs.getBoolean("MAIN_PC");
        if (rs.wasNull()) {
            mainPc = null;
        }

        Boolean isComp = rs.getBoolean("IS_COMPUTERIZED");
        if (rs.wasNull()) {
            isComp = null;
        }

        return new Classroom(rs.getLong("ID"), rs.getString("NAME"),
                rs.getInt("CAPACITY"), rs.getString("SOFTWARE"),
                projector, mainPc, isComp, rs.getBoolean("IS_VIRTUAL"));
    }

    @Override
    public void delete(Classroom c) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Classroom> entities) {

    }

    @Override
    public void deleteAll() {

    }

//    @Override
//    public void deleteById(long id) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public Optional<Classroom> findById(long id) {
//        // TODO Auto-generated method stub
//        return Optional.empty();
//    }
//
    @Override
    public Classroom save(Classroom c) {
        // TODO Auto-generated method stub
        return null;
    }
//
//    @Override
//    public boolean existsById(long id) {
//        // TODO Auto-generated method stub
//        return false;
//    }
*/
}
