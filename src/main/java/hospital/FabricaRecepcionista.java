package hospital;

public class FabricaRecepcionista implements FabricaAbstrata {

    @Override
    public Profissional createProfissional(float salarioBase) {
        Profissional profissional = new Recepcionista(salarioBase);
        profissional.setTitulacao(this.createTitulacao());
        return profissional;
    }

    @Override
    public Titulacao createTitulacao() {
        return new Tecnico();
    }
}
