public class Dispositivo {
    // Atributos de instancia (privados)
    private int id;
    private String nombre;
    private boolean activo;

    // Atributo de clase
    private static int contadorDispositivos = 0;

    // Constructor
    public Dispositivo(int id, String nombre) {
        // Validar e inicializar identificador
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 1; // Valor por defecto seguro o manejo de excepción básico
        }

        // Validar e inicializar nombre
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            this.nombre = "Dispositivo Desconocido";
        }

        this.activo = true;
        contadorDispositivos++;
    }

    // --- Getters y Setters necesarios ---

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validar que el nuevo nombre no sea nulo
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
        // Si es inválido, se conserva el último valor válido
    }

    public boolean isActivo() {
        return activo;
    }

    // --- Métodos utilitarios ---


    public boolean desactivar() {
        if (this.activo) {
            this.activo = false;
            return true;
        }
        return false;
    }


    public String obtenerResumen() {
        String estadoTexto = this.activo ? "Activo" : "Inactivo";
        return this.id + " | " + this.nombre + " | " + estadoTexto;
    }


    public static int getContadorDispositivos() {
        return contadorDispositivos;
    }
}






