class BeMQuestao6{
    private String nomeDoCorrentista;
    private float saldo;
    private boolean contaÉEspecial;

void abreContaSimples(String nome, float valor){
    nomeDoCorrentista = nome;
    contaÉEspecial = false;
    if (valor >= 100.00){
        saldo = valor;
    }
    else{
        System.out.println("O valor minimo para abrir uma conta simples e de 100 reais");
    }
}

void abreContaEspecial(String nome){
    nomeDoCorrentista = nome;
    saldo = (float) 0.00;
    contaÉEspecial = true;
}

void deposita (float valor){
    saldo = saldo + valor;
}

boolean retira(float valor){
    if (contaÉEspecial == false){
        if (valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        else{
            return false;
        }
    }
    else {
        saldo = saldo - valor;
        return true;
    }
}

void mostraDados(){
    System.out.println("O nome do correntista e " +nomeDoCorrentista);
    System.out.println("O saldo e " +saldo);
    if (contaÉEspecial){
      System.out.println("A conta e especial."); 
      if (saldo < 0){
        System.out.println("O saldo esta em negativo!");
      } 
    }
    else {
        System.out.println("A conta e comum");
    }
}
}



class TestaContaBancariaSimplificada2{
    public static void main (String[] args){
        BeMQuestao6 c1;
        c1 = new BeMQuestao6();
        c1.abreContaEspecial("Maria");
        BeMQuestao6 c2 = new BeMQuestao6();
        c2.abreContaSimples("Joao", 150);
        c1.deposita(200);
        c2.retira(50);
        if (c1.retira (300)){
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        c1.mostraDados();
        c2.mostraDados();
    }
}