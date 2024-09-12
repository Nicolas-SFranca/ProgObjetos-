
public class Universidade{
    private Professor[] professores = new Professor[10];
    private int contador = 0;

    public void adicionarProfessor(Professor professor){
        professores[contador] = professor;
        contador++;
    }

    public void listarProfessores(){
        for (int i = 0; i < contador; i++){
            System.out.println("Nome: " + professores[i].getNome() + "\nEspecialidade: " + professores[i].getEspecialidade());
        }
    }
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        Professor professor1 = new Professor("Cassol", "Java");
        Professor professor2 = new Professor("Tarcisio", "Linux");
        universidade.adicionarProfessor(professor1);
        universidade.adicionarProfessor(professor2);
        universidade.listarProfessores();
    }

}
