package hospital;

public abstract class Profissional {

    protected Titulacao titulacao;

    protected float salarioBase;

    public Profissional(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
