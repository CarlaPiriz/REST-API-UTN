package com.example.persona.services;

import com.example.persona.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    //Lista de todas las personas en la BD
    public List<E> findAll() throws Exception;
    //Busca por Id
    public E findById(ID id) throws Exception;
    //Crea una nueva entidad
    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;
    //Elimina el registro de la base de datos
    public boolean delete(ID id) throws  Exception;
}
