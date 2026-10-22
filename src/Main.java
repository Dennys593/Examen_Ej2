public class Main {
    public static void main(String[] args) {
        Jarvis j1 = new Jarvis();
        Jarvis j2 = new Jarvis("Mk3");
        Jarvis j3 = new Jarvis("Friday", -4);

        System.out.println("===== J.A.R.V.I.S. =====");

        j1.estado();
        j2.estado();
        j3.estado();

        System.out.println("Riessgo amenaza 6: "
                + j1.calcularRiesgo(6));
        System.out.println("Riesgo amenaza 6 con 10 civiles: "
                + j1.calcularRiesgo(6, 10));
        System.out.println("Riesgo evento: "
                + j1.calcularRiesgo("Ultron despierta"));
        System.out.println("Riesgo amenaza 4 con j3: "
                + j3.calcularRiesgo(4));
        System.out.println("Distancia a (30, 40): "
                + j2.distancia(30, 40));
        System.out.println("Mensaje codificado: "
                + j1.codificar("Wanda"));
        System.out.println("Vista previa corta: "
                + j1.vistaPrevia("Mente"));
        System.out.println("Vista previa larrga: "
                + j1.vistaPrevia("Piedra de la Mente"));
    }
}
