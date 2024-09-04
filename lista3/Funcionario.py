public class Funcionario {
    int codigo;
    float quantidadeHoras;
    float valorHora;
    float valorSalario;  
    float quantidadeHorasExtras;

    public Funcionario(int codigo, float valorHora, float quantidadeHoras, float quantidadeHorasExtras) {
        this.codigo = codigo;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        this.quantidadeHorasExtras = quantidadeHorasExtras;

        this.valorSalario = valorHora * quantidadeHoras;
    }

    public double calcularHoraExtra() {
        return this.quantidadeHorasExtras * (this.valorHora * 1.5);
    }
    public float calcularSalario() {
        double valorTotal = this.valorSalario + calcularHoraExtra();
        return (float) valorTotal;
    }

    public void exibir() {
        System.out.println("CÓDIGO FUNCIONÁRIO: " + this.codigo +
            "\nValor Salário: " + this.valorSalario +
            "\nSalário Total: " + calcularSalario() +
            "\nQuantidade de Horas Trabalhadas: " + quantidadeHoras +
            "\nQuantidade de Horas Extras: " + quantidadeHorasExtras);
        System.out.println();
    }
}
