package hospital;

public class Medico extends Profissional {

    private int numPlantoes;

    public Medico(float salarioBase) {
        super(salarioBase);
    }

    public void setNumPlantoes(int numPlantoes) {
        this.numPlantoes = numPlantoes;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numPlantoes * (1 + this.titulacao.percentualAumento());
    }
}
