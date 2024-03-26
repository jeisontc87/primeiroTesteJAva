public class Teste {
    public static void main(String arg[]){

        Veiculo veiculo1 = new Veiculo("BBY-3011","Peugeot","307", "Vermelho", 210.5F, 4,4, 143 );
        Veiculo veiculo2 = new Veiculo("ASP-2E28","Fiat","Fiorino", "Branca", 140.5F, 4,4, 83);
        Veiculo veiculo3 = new Veiculo("BDY-6F74","Honda","CB 500X", "Vermelha", 180.7F, 2,2, 56);
        Veiculo veiculo4 = new Veiculo("IPF-4120","Yamaha","YS-250", "Vermelha", 130.5F, 2,1, 21);
        Veiculo veiculo5 = new Veiculo("LAR-3025","Ford","KA", "Preto", 150.8F, 4,3, 85);


        System.out.println("Veiculo 1");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Marca: " + veiculo1.getMarca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Velocidade Maxima: " + veiculo1.getVelocMax());
        System.out.println("Quantidade de Rodas:" + veiculo1.getQtdRodas());
        System.out.println("Quantidade de Pistoes: " + veiculo1.getMotor().getQtdPist());
        System.out.println("Potencia: " + veiculo1.getMotor().getPotencia() +" CV");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        System.out.println("Veiculo 2");
        System.out.println("Placa: " + veiculo2.getPlaca());
        System.out.println("Marca: " + veiculo2.getMarca());
        System.out.println("Modelo: " + veiculo2.getModelo());
        System.out.println("Cor: " + veiculo2.getCor());
        System.out.println("Velocidade Maxima: " + veiculo2.getVelocMax());
        System.out.println("Quantidade de Rodas:" + veiculo2.getQtdRodas());
        System.out.println("Quantidade de Pistoes: " + veiculo2.getMotor().getQtdPist());
        System.out.println("Potencia: " + veiculo2.getMotor().getPotencia() +" CV");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        System.out.println("Veiculo 3");
        System.out.println("Placa: " + veiculo3.getPlaca());
        System.out.println("Marca: " + veiculo3.getMarca());
        System.out.println("Modelo: " + veiculo3.getModelo());
        System.out.println("Cor: " + veiculo3.getCor());
        System.out.println("Velocidade Maxima: " + veiculo3.getVelocMax());
        System.out.println("Quantidade de Rodas:" + veiculo3.getQtdRodas());
        System.out.println("Quantidade de Pistoes: " + veiculo3.getMotor().getQtdPist());
        System.out.println("Potencia: " + veiculo3.getMotor().getPotencia() +" CV");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        System.out.println("Veiculo 4");
        System.out.println("Placa: " + veiculo4.getPlaca());
        System.out.println("Marca: " + veiculo4.getMarca());
        System.out.println("Modelo: " + veiculo4.getModelo());
        System.out.println("Cor: " + veiculo4.getCor());
        System.out.println("Velocidade Maxima: " + veiculo4.getVelocMax());
        System.out.println("Quantidade de Rodas:" + veiculo4.getQtdRodas());
        System.out.println("Quantidade de Pistoes: " + veiculo4.getMotor().getQtdPist());
        System.out.println("Potencia: " + veiculo4.getMotor().getPotencia() +" CV");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        System.out.println("Veiculo 5");
        System.out.println("Placa: " + veiculo5.getPlaca());
        System.out.println("Marca: " + veiculo5.getMarca());
        System.out.println("Modelo: " + veiculo5.getModelo());
        System.out.println("Cor: " + veiculo5.getCor());
        System.out.println("Velocidade Maxima: " + veiculo5.getVelocMax());
        System.out.println("Quantidade de Rodas:" + veiculo5.getQtdRodas());
        System.out.println("Quantidade de Pistoes: " + veiculo5.getMotor().getQtdPist());
        System.out.println("Potencia: " + veiculo5.getMotor().getPotencia() +" CV");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");










    }
}
