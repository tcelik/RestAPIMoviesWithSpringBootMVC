package org.csystem.movierestapp.service;

import org.csystem.movierestapp.entity.MovieInfo;
import org.csystem.movierestapp.repository.IMovieRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//For dependency injection, spring bu benim servisim, repoya ulaşan katmanım demek.
@Service
public class MovieService implements IMovieService{
    //Dao instance alınır.
    IMovieRepository m_movieRepository;

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

    //Controller' servis katmanını bilir. Servis ise repository'i bilir.
    @Override
    public Iterable<MovieInfo> findAll()
    {
        return m_movieRepository.findAll(); //dinamik türün findAll() methoduna çağrı.
    }

    @Override
    public Optional<MovieInfo> findById(Long aLong)
    {
        return Optional.empty();
    }

    @Override
    public <E extends MovieInfo> E save(E e)
    {
        m_movieRepository.save(e);

        return e;
    }
}
