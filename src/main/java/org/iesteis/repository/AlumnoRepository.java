package org.iesteis.repository;

import org.iesteis.domain.Alumno;

import java.io.IOException;
import java.util.List;

public interface AlumnoRepository {
    List<Alumno> findAll() throws IOException;
    //void save(Alumno a) throws IOException;
    //Alumno findByDni(String dni) throws IOException;
}
