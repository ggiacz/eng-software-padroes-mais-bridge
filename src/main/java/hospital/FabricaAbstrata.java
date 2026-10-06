package hospital;

public interface FabricaAbstrata {
    Profissional createProfissional(float salarioBase);
    Titulacao createTitulacao();
}
