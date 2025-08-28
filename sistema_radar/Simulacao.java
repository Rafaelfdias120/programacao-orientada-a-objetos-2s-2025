package sistema_radar;
public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        carro opala = new carro();
        opala.ano = 76;
        opala.modelo = "Comodoro";
        opala.placa = "ACLR300";
        opala.velocidade = 0;

        radar radar = new radar();
        radar.limiteVelocidade = 60;
        radar.Localizacao = "Pistão Sul";

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
