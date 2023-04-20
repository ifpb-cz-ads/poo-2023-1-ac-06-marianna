class BeMQuestao4Lampada {
    int voltagem;
    double preco;
    String marca;
    String modelo;


void Lampada(String marca, double preco, String modelo, int voltagem){
    this.voltagem = voltagem;
    this.preco = preco;
    this.marca = marca;
    this.modelo = modelo; 
}

String getMarca(){
    return marca;
}

void setMarca(String marca){
    this.marca = marca;
}

double getPreco(){
    return preco;
}

void setPreco(double preco){
    this.preco = preco;
}

int getVoltagem(){
    return voltagem;
}

void setVoltagem (int voltagem){
    this.voltagem = voltagem;
}

String getModelo(){
    return modelo;
}

void setModelo (String modelo){
    this.modelo = modelo;
}
}


