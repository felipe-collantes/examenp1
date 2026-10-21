public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBAS DE FUNCIONAMIENTO ---");

        //  Crear dispositivo 1, Sensor A
        Dispositivo d1 = new Dispositivo(1, "Sensor A");
        System.out.println("Crear dispositivo 1, Sensor A -> Estado inicial activo: " + d1.isActivo());

        //  Consultar resumen (Esperado: 1 | Sensor A | Activo)
        System.out.println("Consultar resumen: " + d1.obtenerResumen());

        //  Desactivar dispositivo (Esperado: true)
        System.out.println("Desactivar dispositivo: " + d1.desactivar());

        //  Desactivarlo nuevamente (Esperado: false)
        System.out.println("Desactivarlo nuevamente: " + d1.desactivar());

        // Volver a activar para probar el cambio de nombre con estado válido si se desea,
        d1.setNombre("Sensor A Modificado");

        //  Cambiar nombre a "   " (Espacios en blanco -> Conserva el nombre anterior)
        String nombreAnterior = d1.getNombre();
        d1.setNombre("   ");
        System.out.println("Cambiar nombre a \" \": Conserva el nombre anterior (" + d1.getNombre() + ")");

        //  Crear dos dispositivos válidos adicionales para comprobar el contador
        int contadorAntes = Dispositivo.getContadorDispositivos();
        Dispositivo d2 = new Dispositivo(2, "Estacion 1");
        Dispositivo d3 = new Dispositivo(3, "Controlador 1");

        int contadorDespues = Dispositivo.getContadorDispositivos();

        System.out.println("Crear dos dispositivos válidos. El contador aumenta en 2: " +
                ((contadorDespues - contadorAntes) == 2 ? "True" : "False"));
        System.out.println("Total de dispositivos creados: " + Dispositivo.getContadorDispositivos());
    }
}