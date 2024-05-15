O que você deve fazer: 
Usando seu conhecimento sobre o design pattern “Strategy” implemente duas classes concretas para o conjunto de classes abaixo

![image](https://github.com/Eruhaym/Eng-Software---08---Design-Patterns---Strategy/assets/163313817/6610b9b4-7c00-43c1-9d03-ea825587d14d)

Uma classe deve suportar média aritmética e considerar como aprovados os casos nos quais a média for superior a 5,0. 
Outra deve usar média geométrica e considerar como aprovados os casos em que a média for superior a 7,0.

Exemplo de uso das classes implementadas:
public class Main { public static void main(String[] args) { Aritmetica calculo = new Aritmetica();
// Geometrica calculo = new Geometrica()
Disciplina d = new Disciplina(calculo);
d.setNome( "Padroes de Desenvolvimento"); d.setP1(10); d.setP2(5); d.CalcularMedia(); System.out.println(
String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s",
d.getP1(),d.getP2(), d.getMedia(), d.getSituacao())); } }

O QUE VOCÊ DEVE ENTREGAR:
Como resposta a esta tarefa, deve ser fornecido um link para um repositório público no GitHub criado por você, que contenha a sua implementação para resolução do problema proposto
