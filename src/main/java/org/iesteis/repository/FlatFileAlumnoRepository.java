package org.iesteis.repository;

import org.iesteis.domain.Alumno;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FlatFileAlumnoRepository implements AlumnoRepository{
    @Override
    public List<Alumno> findAll() throws IOException{
        Path ruta = Path.of("data/alumnos.txt");
        List<String> alumnosString = Files.readAllLines(ruta);
        List<Alumno> alumnos = new ArrayList<>();
        for (String s : alumnosString) {
            String nombre = s.split(" ")[0];
            String dni = s.split(" ")[1];
            alumnos.add(new Alumno(nombre, dni));
        }
        return alumnos;
    }
}
