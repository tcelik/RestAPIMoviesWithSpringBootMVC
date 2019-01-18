package org.csystem.movierestapp.repository;

import org.csystem.movierestapp.entity.MovieInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

//Dependency injection için anatosyonlar
@Repository
@Transactional
public class MovieRepository implements IMovieRepository{
    @PersistenceContext
    private EntityManager m_entityManager; //İşte bu bize spring boot yardımı.
    @Override
    public Iterable<MovieInfo> findByName(String name)
    {
        return null;
    }

    @Override
    public Iterable<MovieInfo> findByYear(int year)
    {
        return null;
    }

    @Override
    public Iterable<MovieInfo> findByYears(int start, int end)
    {
        return null;
    }

    @Override
    public Iterable<MovieInfo> findByDirector(String director)
    {
        return null;
    }

    @Override
    public Iterable<MovieInfo> findAll()
    {
        return null;
    }

    @Override
    public Optional<MovieInfo> findById()
    {
        return Optional.empty();
    }

    @Override
    public <E extends MovieInfo> E save(E e)
    {
        return null;
    }

    @Override
    public void delete(MovieInfo e)
    {

    }

}
