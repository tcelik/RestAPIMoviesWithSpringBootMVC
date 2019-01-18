package org.csystem.movierestapp.service;

import org.csystem.movierestapp.entity.MovieInfo;
import org.csystem.service.IService;

public interface IMovieService extends IService<MovieInfo, Long> {
    Iterable<MovieInfo> findByName(String name); //repo ne ise o aslında. Servis repoyu servis ediyor.s
    Iterable<MovieInfo> findByYear(int year);
    Iterable<MovieInfo> findByYears(int start, int end);
}
