package hospital;

public class FabricaVoluntario {

    public Profissional createProfissional(float salarioBase) {
        Profissional profissional = new Recepcionista(0.0f);
        profissional.setTitulacao(this.createTitulacao());
        return profissional;
    }

    public Titulacao createTitulacao() {
        return new Tecnico();
    }
}
