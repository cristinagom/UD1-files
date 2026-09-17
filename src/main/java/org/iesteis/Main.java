package org.iesteis;

import org.iesteis.domain.Alumno;
import org.iesteis.repository.FlatFileAlumnoRepository;
import org.iesteis.repository.FlatFileAsignaturaRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FlatFileAlumnoRepository alumnoRepository = new FlatFileAlumnoRepository();
        FlatFileAsignaturaRepository asignaturaRepository = new FlatFileAsignaturaRepository();
        try {
            alumnoRepository.findAll().forEach(System.out::println);
            asignaturaRepository.findAll().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
