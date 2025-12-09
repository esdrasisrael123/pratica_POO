package entidades;

public class Camisetaestampada {

private String estampa;
public Camisetaestampada(String estampa) {
    this.estampa = estampa;
}
public String getAstam() {
    return estampa;
}

    public void exibirDetalhes(){
        System.out.println("Detales da camisa:");
        System.out.println("Estampa:", + estampa);

    }







}
