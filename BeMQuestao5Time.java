class BeMQuestao5Time {
    String nome;
    int jogadores;
    String treinador;


void Time(String nome, String treinador, int jogadores){
    this.nome = nome;
    this.treinador = treinador;
    this.jogadores = jogadores;
}

String getNome(){
    return nome;
}

void setNome(String nome){
    this.nome = nome;
}

String getTreinador(){
    return treinador;
}

void setTreinador (String treinador){
    this.treinador = treinador;
}

int getJogadores(){
    return jogadores;
}

void setJogadores (int jogadores){
    this.jogadores = jogadores;
}
}
