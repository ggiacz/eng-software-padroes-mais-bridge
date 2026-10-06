package hospital;

public class Recepcionista extends Profissional {

    public Recepcionista(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
