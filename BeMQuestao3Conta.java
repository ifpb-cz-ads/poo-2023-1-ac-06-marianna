class BeMQuestao3Conta{
    private String nomeDoCorrentista;
    private float saldo;
    private boolean contaÉEspecial;

void abreContaSimples(String nome){
    nomeDoCorrentista = nome;
    saldo = (float) 0.00;
    contaÉEspecial = false;
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



class TestaContaBancariaSimplificada{
    public static void main (String[] args){
        BeMQuestao3Conta c1;
        c1 = new BeMQuestao3Conta();
        c1.abreContaEspecial("Maria");
        BeMQuestao3Conta c2 = new BeMQuestao3Conta();
        c2.abreContaSimples("Joao");
        c1.deposita(200);
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