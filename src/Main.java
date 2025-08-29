import java.util.logging.Logger;
import java.util.logging.Level;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

    // Crear una mascota
    Mascota mascota = new Mascota("Firulais", 5);
    // Crear un propietario
    PropietarioDeLaMascota propietario = new PropietarioDeLaMascota();
    propietario.Identificacion = "12345678";
    propietario.Contacto = "555-1234";
    propietario.DireccionExacta = "Calle 123, Ciudad";

    // Crear un animal
    Animal animal = new Animal();
    animal.NumeroDeExpediente = 1001;
    animal.Nombre = "Firulais";
    animal.Edad = 5;
    animal.Peso = 20;
    animal.Especie = "Perro";
    animal.Raza = "Labrador";
    animal.Pelaje = "Corto";
    animal.Vacunas = "Rabia, Parvovirus";
    animal.TratamientosPrevios = "Desparasitación";
    animal.CondicionesEspeciales = "Ninguna";

    // Crear un servicio de atención especializada
    ServicioDeAtencionEspecializada servicio = new ServicioDeAtencionEspecializada();
    servicio.TipoDeProcedimientoMedico = "Cirugía";
    servicio.CodigoDeServicio = 200;
    servicio.RequisitosEspecificosDeLaAtencion = "Ayuno 12h";
    servicio.DuracionPromedioDeLaAtencion = 90;
    servicio.TarifaDelServicio = 1500;

    // Crear una cita médica
    CitaMedica cita = new CitaMedica();
    cita.FechaReservada = 20250828;
    cita.HoraReservada = 1000;
    cita.TipoDeServicioRequerido = "Consulta General";
    cita.ProfesionalAsignado = "Dra. López";
    cita.EstadoActualDelProceso = "Reservada";

    // Mostrar información usando logger
        if (logger.isLoggable(Level.INFO)) {
            logger.info("--- Información de la Mascota ---");
            logger.info(String.format("Nombre: %s", mascota.nombre));
            logger.info(String.format("Edad: %d", mascota.anhos));
            logger.info("--- Propietario ---");
            logger.info(String.format("ID: %s", propietario.Identificacion));
            logger.info(String.format("Contacto: %s", propietario.Contacto));
            logger.info(String.format("Dirección: %s", propietario.DireccionExacta));
            logger.info("--- Animal ---");
            logger.info(String.format("Expediente: %d", animal.NumeroDeExpediente));
            logger.info(String.format("Nombre: %s", animal.Nombre));
            logger.info(String.format("Edad: %d", animal.Edad));
            logger.info(String.format("Peso: %d", animal.Peso));
            logger.info(String.format("Especie: %s", animal.Especie));
            logger.info(String.format("Raza: %s", animal.Raza));
            logger.info(String.format("Pelaje: %s", animal.Pelaje));
            logger.info(String.format("Vacunas: %s", animal.Vacunas));
            logger.info(String.format("Tratamientos previos: %s", animal.TratamientosPrevios));
            logger.info(String.format("Condiciones especiales: %s", animal.CondicionesEspeciales));
            logger.info("--- Servicio ---");
            logger.info(String.format("Tipo: %s", servicio.TipoDeProcedimientoMedico));
            logger.info(String.format("Código: %d", servicio.CodigoDeServicio));
            logger.info(String.format("Requisitos: %s", servicio.RequisitosEspecificosDeLaAtencion));
            logger.info(String.format("Duración: %d min", servicio.DuracionPromedioDeLaAtencion));
            logger.info(String.format("Tarifa: $%d", servicio.TarifaDelServicio));
            logger.info("--- Cita Médica ---");
            logger.info(String.format("Fecha: %d", cita.FechaReservada));
            logger.info(String.format("Hora: %d", cita.HoraReservada));
            logger.info(String.format("Servicio: %s", cita.TipoDeServicioRequerido));
            logger.info(String.format("Profesional: %s", cita.ProfesionalAsignado));
            logger.info(String.format("Estado: %s", cita.EstadoActualDelProceso));
        }

    }
}