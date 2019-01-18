package org.csystem.movierestapp.entity;

import javax.persistence.*;
import java.time.LocalDate;

//Database kayıt, bu bir POJO, database'e kayıt olucak sınıf.
@Entity

//Hangi tabloya kayıt
@Table(name = "movies")

public class MovieInfo {
    //id işini hallet
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private long m_id;

    @Column(name = "name")
    private String m_name;

    @Column(name = "director")
    private String m_director;

    @Column(name = "date")
    private LocalDate m_date;

    public MovieInfo() {}

    public MovieInfo(String name, String director, LocalDate date)
    {
        this(0, name, director, date);
    }

    public MovieInfo(int id, String name, String director, LocalDate date)
    {
        m_id = id;
        m_name = name;
        m_director = director;
        m_date = date;
    }

    public long getId()
    {
        return m_id;
    }

    public void setId(long id)
    {
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getDirector()
    {
        return m_director;
    }

    public void setDirector(String director)
    {
        m_director = director;
    }

    public LocalDate getDate()
    {
        return m_date;
    }

    public void setDate(LocalDate date)
    {
        m_date = date;
    }

    @Override
    public String toString()
    {
        return String.format("[%d]:%s:%s", m_id, m_name, m_director);
    }
}
