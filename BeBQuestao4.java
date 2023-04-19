public class BeBQuestao4 {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    public String getNome(){
        return nome;
    }

    public void setNome(String temp){
        nome = temp;
        contadorEstudante++;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String temp){
        endereco = temp;
    }

    public int getIdade(){
        return idade;
    }

    public void setEndereco(int temp){
        idade = temp;
    }

    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }

    public void setNotaPortugues(double temp){
        notaPortugues = temp;
    }

    public void setNotaGeografia(double temp){
        notaGeografia = temp;
    }

    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
        return resultado;
    }

    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}


class AppRegistraAluno{
    public static void main(String[] args){
        BeBQuestao4 ana = new BeBQuestao4();
        BeBQuestao4 beto = new BeBQuestao4();
        BeBQuestao4 carlos = new BeBQuestao4();

        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        System.out.println(ana.getNome());
        System.out.println("Contador: " +BeBQuestao4.getQuantidadeAlunos());

    }
}