package urketa.spring.petclinic.petclinic.services;

import urketa.spring.petclinic.petclinic.model.Owner;

import java.util.Set;

public interface CRUDService<T,ID> {

    T findById(ID id);

    T save (T t);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
