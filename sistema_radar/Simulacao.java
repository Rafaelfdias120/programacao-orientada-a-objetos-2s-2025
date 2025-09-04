package sistema_radar;
public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        carro opala = new carro("ACL300", "Comodoro", 75, 0);

        radar radar = new radar(60, "Pistão Sul");

        radar.avaliarVelocidade(opala);

        opala.acelerar(); //10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); //70

        radar.avaliarVelocidade(opala);

        opala.frear(); // 60

        radar.avaliarVelocidade(opala);

    }
}
