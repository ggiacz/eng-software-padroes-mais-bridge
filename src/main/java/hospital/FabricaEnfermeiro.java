package hospital;

public class FabricaEnfermeiro implements FabricaAbstrata {

    @Override
    public Profissional createProfissional(float salarioBase) {
        Profissional profissional = new Enfermeiro(salarioBase);
        profissional.setTitulacao(this.createTitulacao());
        return profissional;
    }

    @Override
    public Titulacao createTitulacao() {
        return new Graduacao();
    }
}
