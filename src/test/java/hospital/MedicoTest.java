package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveCriarMedico() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Medico");
        assertTrue(fabrica.createProfissional(500.0f) instanceof Medico);
    }

    @Test
    void deveRetornarSalarioMedicoComResidencia() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Medico");
        Medico medico = (Medico) fabrica.createProfissional(500.0f);
        medico.setNumPlantoes(2);
        assertEquals(1200.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void naoDevePermitirMedicoComTecnico() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Medico");
        assertFalse(fabrica.createTitulacao() instanceof Tecnico);
    }

    @Test
    void naoDevePermitirMedicoComGraduacao() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Medico");
        assertFalse(fabrica.createTitulacao() instanceof Graduacao);
    }

    @Test
    void devePermitirMedicoComResidencia() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Medico");
        assertTrue(fabrica.createTitulacao() instanceof Residencia);
    }

    @Test
    void naoDevePermitirMedicoComDoutorado() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Medico");
        assertFalse(fabrica.createTitulacao() instanceof Doutorado);
    }

}
