package hospital;

public class FabricaDiretor implements FabricaAbstrata {

    @Override
    public Profissional createProfissional(float salarioBase) {
        Profissional profissional = new Diretor(salarioBase);
        profissional.setTitulacao(this.createTitulacao());
        return profissional;
    }

    @Override
    public Titulacao createTitulacao() {
        return new Doutorado();
    }
}
