
7 - Identifique e explique o(s) erro(s) na classe abaixo:

1 class Registro De Eleitor
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int tituloDeEleitor; // número do título do eleitor
7 String nome; // nome do eleitor
8 short zonaEleitoral; // número da zona eleitoral
9 } // fim da classe



O nome da classe está com espaços em branco e faltam as palavras chave public ou private.




8 - Identifique e explique o(s) erro(s) na classe abaixo:


1 class Teste2
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int num1,num2;
7 /**
8 * Declaração dos métodos desta classe
9 */
10 int maior()
11 {
12 if (num1 > num2)
13 return true;
14 else return false;
15 }
16 void menor()
17 {
18 if (num1 < num2)
19 return num1;
20 else return num2;
21 }
22 } // fim da classe


O método int maior não deve retornar valor booleano, apenas do tipo int. No método "menor" o tipo de retorno é void, logo, não é possível retornar valores.






9 - Identifique e explique o(s) erro(s) na classe abaixo.


1 class TesteImpressao
2 {
3 main(String[] args)
4 {
5 System.out.println(“7+2=”+(7+2));
6 System.out.println(“7-2=”+(7-2));
7 System.out.println(“7*2=”+(7*2));
8 System.out.println(“7/2=”+(7/2));
9 return true;
10 }
11 } // fim da classe



Falta o modificador de acesso "public" e declarar a classe como estática. Não deve ser possível retornar valor.














Baruque e Baruque

1- O exemplo deixou mais claro a questão de referencias e espaços alocados em memória e do porquê frase1 e frase2 nao serem iguais.



2-A questao 2 e o oposto da primeira, deixa mais claro o porquê frase3 e frase4 serem iguais.


3-A questao explica bem o metodo equals.


4-A questao ajuda a compreender melhor os metodos e modificadores.