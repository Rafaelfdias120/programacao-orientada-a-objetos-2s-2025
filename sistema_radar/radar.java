package sistema_radar;
public class radar {
    
    public Integer limiteVelocidade;
    public String Localizacao;

    public void avaliarVelocidade(carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            //emiir notificação.
        }
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade observada: " + velocidadeObservada);
        System.out.println("Limite da via: " + this.limiteVelocidade);
    }

}
