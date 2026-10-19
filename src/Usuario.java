public class Usuario {
    // Atributos privados
    private int id;
    private String username;
    private String correo;
    private boolean activo;

    // Atributo static compartido
    private static int contadorUsuarios = 0;

    // Constructor requerido
    public Usuario(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static int getTotalUsuarios() {
        return contadorUsuarios;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id +
                "\nUsername: " + username +
                "\nCorreo: " + correo +
                "\nActivo: " + activo);
    }
}