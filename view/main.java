package view;

import controller.*;
import model.*;
import service.TurnoService;

import java.time.LocalDate;
import java.time.LocalTime;

public class main {
    public static void main(String[] args){

        /* Construindo setor, cargo, unidade, turno */

        TurnoService turno_Service = new TurnoService();

        TurnoController turno_Controller = new TurnoController(turno_Service);

        Turno turnoComercial = turno_Controller.novoTurno(
            "1º Turno",
            LocalTime.of(8, 0, 0),
            LocalTime.of(18, 0, 0)
        );

        /* Construindo primeiro colaborador */

        ColabBuilder TiagoBuilder = new ColabBuilder(
            "Tiago Inocencio Gentil", 
            "559.887.653-88"
        ).turno(turnoComercial);

    }
}