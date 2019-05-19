package com.MyUniApp.MyUniAppBack.Services.NewsServiceImpl;

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
    private void populateSampleData()
    {
        newsList.add(new AppDiligence(1, "Proceso Informativo", "Proceso de Grado", "Info", 1554126456114l, "juan.marin@escuelaing.edu.co", "Se debe INGRESAR POR INTERNET EXPLORER a Servicios Académicos para diligenciar los formatos:Formato de solicitud preliminar de grado firmado  (Solo firma original, no se aceptan firmas escaneadas): ingrese a servicios académicos. Por favor verifique sus nombres, apellidos, número de documento y lugar de expedición (Los nombres y apellidos deben quedar escritos con la primera letra en Mayúscula y lo demás en minúscula con la ortografía propia del nombre (tildes, etc..) igual como aparece en su documento de identidad. (Este documento debe quedar impreso en una solo hoja, tamaño carta, orientación vertical, en una sola cara, en papel bond blanco nuevo, sin logos ni marcas de agua de entidades)Formato de solicitud de aprobación de grado firmado (Solo firma original, no se aceptan firmas escaneadas): ingrese a servicios académicos. (Este documento debe quedar impreso en una solo hoja, tamaño carta, orientación vertical, en una sola cara, en papel bond blanco nuevo, sin logos ni marcas de agua de entidades).Fotocopia legible de la Cédula de Ciudadanía por ambas caras, ampliada al 150%.Una fotografía reciente a color, de frente, tamaño 3 x 4 cm., fondo blanco. No instantánea, ni selfie.  En excelente estado.Fotocopia del certificado de resultado o certificación de presentación del examen ECAES o SABER PRO (Ley 1324 de 2009). Diligenciamiento de la Encuesta del Graduado, solicitada por el Ministerio de Educación Nacional. Al tramitar la encuesta se pregunta la fecha de grado, allí debe escribir la fecha del día en que diligencia la encuesta, a través de este Enlace. Al finalizar la encuesta, por favor enviar el pantallazo del cumplimiento de la misma al correo electrónico coordgrados@escuelaing.edu.coDiligenciar, firmar (No se aceptan firmas escaneadas) y enviar desde el correo electrónico institucional al correo coordgrados@escuelaing.edu.co el formato de Tratamiento de Datos Personales que será enviado a su correo electrónico institucional.Los estudiantes de Ingeniería Biomédica, deben presentar en físico a la Coordinación de grados de la Escuela la copia de la aprobación del examen de inglés por parte de la Universidad Colegio Mayor de Nuestra Señora del Rosario. En caso de continuar en doble programa deberá entregar el formulario correspondiente, junto con los documentos de grado. Ver formularioEn caso de haber cursado el programa de pregrado con ÉNFASIS, debe solicitarlo por escrito a la Decanatura de su programa del 5 al 9 de agosto de 2019.NOTA: PARA RECLAMAR LA TARJETA DE INVITACIÓN A LA CEREMONIA DE IMPOSICIÓN DE ESCUDOS ES OBLIGATORIO PRESENTAR LA DOCUMENTACIÓN PARA GRADO DEBIDAMENTE DILIGENCIADA Y COMPLETA.El estudiante debe encontrarse a paz y salvo (Académico, Financiero, Biblioteca y Laboratorios) por todo concepto según el Reglamento Estudiantil.--------------------------------------------------------------------------------------------------------------- 2. Pagar los Gastos de grado\n" +
                "Del 5 al 9 de Agosto de 2019La orden de pago de los derechos de grado se genera sólo a los estudiantes que cumplan con todos los requisitos de grado establecidos en el Reglamento Estudiantil, entregan la documentación completa en físico a la Coordinación de grado y están a paz y salvo por todo concepto.VALOR AÑO 2019: $ 610.0002.1  Únicamente en las fechas señaladas podrá descargar el comprobante de pago de derechos de grado a través de Recibos y Pagos 2.2  Usted puede realizar este pago:- En línea- Para pago en efectivo debe imprimir el comprobante con el código de barras y pagar en cualquier sucursal del Banco de Occidente, Banco Itaú o Banco Davivienda. El horario del banco Itaú de la Escuela es de Lunes a Viernes (Días hábiles) de 8:30 a.m. a 1:00 p.m. y de 2:00 p.m. a 4:00 p.m.- En la caja de la Escuela se reciben sólo pagos con tarjeta débito y/o crédito, de Lunes a Viernes (Días hábiles) 8:00 a.m. a 12:00 p.m. y de 1:00 p.m. a 4:00 p.m.2.3   Es de obligatorio cumplimiento enviar por correo electrónico a coordgrados@escuelaing.edu.co el recibo de caja o soporte del pago en línea de los gastos de grado a la Oficina de Coordinación de Grados. 2.4   La solicitud de grado, previo cumplimiento de los requisitos exigidos y de los procedimientos internos, se presentará al Consejo Directivo en su reunión del mes de septiembre de 2019.Si el estudiante no cumple con este requisito dentro de las fechas indicadas, la ESCUELA asume que no participará en la Ceremonia de entrega de Diplomas, correspondiente a esta promoción. ---------------------------------------------------------------------------------------------------------------3. Solicitar y pagar la tarjeta profesional\n" +
                "Del 5 al 9 de Agosto de 2019Este trámite es un servicio que presta la Escuela a sus graduados de las ceremonias de entrega de diplomas de marzo y septiembre y es de obligatorio cumplimiento.1. Ingresar al sitio Web del Consejo Profesional que le corresponda según el programa académico y realizar los trámites correspondientes tal como lo indica el Consejo Profesional de cada programa.2. En la Oficina de Grados de la Escuela solo deben entregar la documentación original en soporte papel los graduandos de ECONOMIA.  3. El Programa de Administración de Empresas debe realizar el proceso de solicitud de tarjeta profesional, despúes de la ceremonia de grado cuando tenga en su poder el acta original de grado y el diploma.4. El programa de Matemáticas, no aplica.La Oficina de Coordinación de Grados atiende en la Plazoleta del primer piso del Bloque A, de lunes a viernes (Días hábiles), en horario de 8:30 a.m. a 12:30 p.m. y de 2:00 p.m. a 4:30p.m.--------------------------------------------------------------------------------------------------------------- 4.  Reclamar las invitaciones a la CeremoniaCada graduado puede traer tres (3) invitados. \n" +
                "Pendiente por definirLas invitaciones se entregan al graduando, quien debe identificarse con su cédula. Si el graduando no puede recoger las invitaciones, es importante recordarle que, la persona autorizada debe presentar en ventanilla la siguiente documentación:Carta de autorización donde se incluyan los siguientes datos del autorizado (Nombres y apellidos completos, tipo de documento, número de documento, ciudad de expedición y parentesco)Fotocopia del documento de identidad del graduando por ambas caras, ampliada al 150% Fotocopia del documento de identidad del autorizado por ambas caras, ampliada al 150% \n" +
                "\n" +
                "Si el graduando no puede asistir a la ceremonia de entrega de diplomas, debe:Enviar una carta dirigida a la Coordinación de Grados informando los motivos de la ausencia con la firma original del estudiante a la mayor brevedad posible. Esta carta debe informar si usted o un acudiente reclamará los documentos de grado, incluyendo el nombre completo, parentesco y número de cédula y lugar de expedición del acudiente o familiar que recibirá el diploma en su nombre y especificando si éste lo reclamará durante la ceremonia reemplazándolo(a) durante el protocolo o si lo reclamará despúes en las fechas establecidas por la Secretaria General. Le recuerdo que el autorizado no puede ser algún compañero de estudio que se gradúe el mismo día.Firmar y enviar el juramento (Que será enviado una vez nos haga llegar la carta de no asistencia)Firmar y enviar la Carta de conocimiento del juramento (Que será enviado una vez nos haga llegar la carta de no asistencia)La Oficina de Grados atiende en la Ventanilla 11 - Plazoleta del primer piso del Bloque A, de lunes a viernes (Días hábiles), en horario de 8:30 a.m. a 12:30 p.m. y de 2:00 p.m. a 4:30p.m.--------------------------------------------------------------------------------------------------------------- 5. Asistir a la Ceremonia", "https://www.utel.edu.mx/blog/wp-content/uploads/2015/07/shutterstock_2509427831.jpg"));
        newsList.add(new AppDiligence(2, "Proceso Informativo", "Registro", "Info", 1577686456114l, "andres.ramirez@escuelaing.edu.co", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://www.escuelaing.edu.co/uploads/secciones/8916_conozcanos_01.jpg"));
        newsList.add(new AppDiligence(3, "Proceso Informativo", "Apoyo Financiero", "Info", 1590886456114l, "fabian.zabaleta@escuelaing.edu.co", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "undefined"));
    }

    @Override
    public  List<AppDiligence> getAllDiligences() {
        return newsList;
    }


}