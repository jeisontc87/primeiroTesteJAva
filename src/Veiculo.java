public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private Float velocMax;
    private int qtdRodas;
    private Motor motor;

    public Veiculo (){
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = (float) 0;
        this.qtdRodas = 0;
        motor = new Motor();
}

    public Veiculo(String placa, String marca, String modelo, String cor, Float velocMax,int qtdRodas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        motor = new Motor();
    }

    public Veiculo (String placa, String marca, String modelo, String cor, Float velocMax,int qtdRodas, int qtdPist, int potencia){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);
    }
    //GETTERS
    public String getPlaca(){
        return this.placa;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public Float getVelocMax(){
        return this.velocMax;
    }
    public int getQtdRodas(){
        return this.qtdRodas;
    }
    public Motor getMotor(){
        return this.motor;
    }

    //SETTERS

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca( String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setVelocMax(Float velocMax){
        this.velocMax = velocMax;
    }
    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }

    //SOBRECARGA
    //@override
    public  String toSting(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Maxima: " + this.velocMax);
        System.out.println("Quantidade de Rodas: " + this.qtdRodas);
        System.out.println("Quantidade de Pistoes: " + this.motor.getQtdPist());
        System.out.println("Potencia: " + this.motor.getPotencia());
        System.out.println("############################################################");
        return null;
    }






}
