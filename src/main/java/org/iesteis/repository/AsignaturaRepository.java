package org.iesteis.repository;

import org.iesteis.domain.Asignatura;

import java.io.IOException;
import java.util.List;

public interface AsignaturaRepository {
    List<Asignatura> findAll() throws IOException;
}
