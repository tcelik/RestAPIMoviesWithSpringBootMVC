package org.csystem.repository;

import java.util.Optional;

//DaoTemplate, anlaşması
public interface IRepository<T, ID> {
    Iterable<T> findAll(); //getAll, hepsini getir.
    Optional<T> findById(); //java 8, eğer yoksa null dönme Optional empty dön.

    //save T and all subtypes template generic method & return E
    <E extends T> E save(E e); //garip değilmi? generic :)
    void delete(T e);
}
