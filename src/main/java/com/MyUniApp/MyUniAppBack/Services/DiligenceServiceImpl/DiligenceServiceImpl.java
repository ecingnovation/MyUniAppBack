package com.MyUniApp.MyUniAppBack.Services.DiligenceServiceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import com.MyUniApp.MyUniAppBack.Model.AppDiligence;
import com.MyUniApp.MyUniAppBack.Services.DiligenceService;

import org.springframework.stereotype.Service;

@Service
public class DiligenceServiceImpl implements DiligenceService {

    private ArrayList<AppDiligence> newsList = new ArrayList<>();

    @PostConstruct
    private void populateSampleData() {
        newsList.add(new AppDiligence(3, "Proceso Elaboración y Modificación de Horarios Pregrado 2019-1", "Oficina de Registro y Control Académico", "Info",
        "registro@escuelaing.edu.co", "",
        "https://i.imgur.com/Nw3f8Lw.png",
        "https://www.escuelaing.edu.co/es/comunidad/estudiantes/instructivo_horarios"));
        newsList.add(new AppDiligence(2, "Calendario Académico 2019", "Secretaría Académica", "Info", "secretaria@escuelaing.edu.co", "",
        "https://i.imgur.com/jndo7wR.png",
        "https://www.escuelaing.edu.co/es/comunidad/estudiantes/calendarios_cronogramas"));
        newsList.add(new AppDiligence(1, "Inscripción en Línea - Proceso de Admisión para Carreras Profesionales", "Admisiones", "Info", "admisiones@escuelaing.edu.co", 
        "Bienvenido a la Escuela Colombiana de Ingeniería Julio Garavito, para nosotros es muy grato contar con su confianza al elegirnos como la institución educativa" + 
        " que le ayudará a convertirse en un profesional con los más altos estándares tecnológicos como los requiere el país.", 
        "https://i.imgur.com/jUiZAAO.jpg", 
        "https://www.escuelaing.edu.co/es/programas/admisiones/pregrado?id=1&itemId=1"));
    }

    @Override
    public  List<AppDiligence> getAllDiligences() {
        return newsList;
    }
}