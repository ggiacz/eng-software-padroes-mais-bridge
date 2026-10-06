package hospital;

public class FabricaMedico implements FabricaAbstrata {

    @Override
    public Profissional createProfissional(float salarioBase) {
        Profissional profissional = new Medico(salarioBase);
        profissional.setTitulacao(this.createTitulacao());
        return profissional;
    }

    @Override
    public Titulacao createTitulacao() {
        return new Residencia();
    }
}
