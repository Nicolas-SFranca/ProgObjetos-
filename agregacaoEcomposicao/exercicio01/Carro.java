public class Carro {
    private  String modelo;
    private  Motor motor;

    public Carro(String modelo, String potenciaMotor, String tipoCombustivelMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor, tipoCombustivelMotor);
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Carro:");
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Potência do Motor: " + motor.getPotencia());
        System.out.println("Tipo de Combustível: " + motor.getTipoCombustivel());
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Fuscão", "1000", "Gasolina");
        carro.exibirInformacoes();
