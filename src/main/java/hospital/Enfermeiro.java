package hospital;

public class Enfermeiro extends Profissional {

    public Enfermeiro(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.titulacao.percentualAumento());
    }

}
