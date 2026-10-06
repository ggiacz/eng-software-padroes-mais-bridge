package hospital;

public class Diretor extends Profissional {

    public Diretor(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.titulacao.percentualAumento());
    }

}
