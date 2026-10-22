public class Jarvis {
    private String version;
    private int sensores;

    public Jarvis() {
        this("Mk1", 3);
    }

    public Jarvis(String version) {
        this(version, 3);
    }

    public Jarvis(String version, int sensores) {
        this.version = version;
        this.sensores = Math.max(1, sensores);
    }

    public int calcularRiesgo(int amenaza) {
        return (int) Math.pow(amenaza, 2) + sensores;
    }

    public int calcularRiesgo(int amenaza, int civiles) {
        return calcularRiesgo(amenaza) + 3 * civiles;
    }

    public int calcularRiesgo(String evento) {
        return 5 * evento.length() + sensores;
    }

    public int distancia(int x, int y) {
        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String codificar(String mensaje) {
        return mensaje.toUpperCase() + "-" + mensaje.length();
    }

    public String vistaPrevia(String mensaje) {
        if (mensaje.length() <= 8) {
            return mensaje;
        } else {
            return mensaje.substring(0, 8) + "...";
        }
    }

    public void estado() {
        System.out.println("JARVIS " + version
                + " | sensores " + sensores);
    }
}