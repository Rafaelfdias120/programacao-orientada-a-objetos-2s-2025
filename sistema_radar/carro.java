package sistema_radar;

public class carro {
    public String placa;
    public String modelo;
    public Integer ano;
    public Integer velocidade;

    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        this.velocidade -= 10;
    }

}