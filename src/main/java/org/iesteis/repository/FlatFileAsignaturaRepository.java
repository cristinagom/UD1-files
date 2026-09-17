package org.iesteis.repository;

import org.iesteis.domain.Alumno;
import org.iesteis.domain.Asignatura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatFileAsignaturaRepository implements AsignaturaRepository{
    public List<Asignatura> findAll() throws IOException {
        Path ruta = Path.of("data/asignaturas.txt");
        Stream<String> asignaturas = Files.lines(ruta);
        return asignaturas.map(x -> new Asignatura(x.split(";")[0],x.split(";")[1])).toList();
    }
}
