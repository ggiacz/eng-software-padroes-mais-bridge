package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnfermeiroTest {

    @Test
    void deveCriarEnfermeiro() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Enfermeiro");
        assertTrue(fabrica.createProfissional(2000.0f) instanceof Enfermeiro);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComGraduacao() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Enfermeiro");
        Enfermeiro enfermeiro = (Enfermeiro) fabrica.createProfissional(2000.0f);
        assertEquals(2200.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void naoDevePermitirEnfermeiroComTecnico() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Enfermeiro");
        assertFalse(fabrica.createTitulacao() instanceof Tecnico);
    }

    @Test
    void devePermitirEnfermeiroComGraduacao() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Enfermeiro");
        assertTrue(fabrica.createTitulacao() instanceof Graduacao);
    }

    @Test
    void naoDevePermitirEnfermeiroComResidencia() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Enfermeiro");
        assertFalse(fabrica.createTitulacao() instanceof Residencia);
    }

    @Test
    void naoDevePermitirEnfermeiroComDoutorado() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Enfermeiro");
        assertFalse(fabrica.createTitulacao() instanceof Doutorado);
    }

}
