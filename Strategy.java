
interface ICalcMedia {
    double calcularMedia(double p1, double p2);
    String situacao(double media);
}

class Aritmetica implements ICalcMedia {
    
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    
    public String situacao(double media) {
        return media >= 5 ? "Aprovado" : "Reprovado";
    }
}

class Geometrica implements ICalcMedia {
    
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    
    public String situacao(double media) {
        return media >= 7 ? "Aprovado" : "Reprovado";
    }
}

class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private ICalcMedia calculadora;

    public Disciplina(ICalcMedia calculadora) {
        this.calculadora = calculadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void calcularMedia() {
        this.media = calculadora.calcularMedia(p1, p2);
        this.situacao = calculadora.situacao(media);
    }
}

public class Main {
    public static void main(String[] args) {
        
        //Aritmetica calculo = new Aritmetica();
        
        Geometrica calculo = new Geometrica();

        
        Disciplina d = new Disciplina(calculo);
        
        d.setNome( "Padroes de Desenvolvimento");
        d.setP1(10); d.setP2(5);
        d.calcularMedia();
        System.out.println(
            String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s",
            d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    } 
}