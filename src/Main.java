void main() {
    Usuario u1 = new Usuario("jperez", "jperez@correo.com");
    Usuario u2 = new Usuario("djacho", "djacho@correo.com");
    Usuario u3 = new Usuario("mumatambo", "mumatambo@correo.com");
    Usuario u4 = new Usuario("aperez", "aperez@correo.com");

    u1.mostrarInformacion();
    System.out.println("-------------------");
    u4.mostrarInformacion();

    System.out.println("-------------------");
    System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());
}