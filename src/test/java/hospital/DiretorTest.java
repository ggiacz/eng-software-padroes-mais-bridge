package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCriarDiretor() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Diretor");
        assertTrue(fabrica.createProfissional(3000.0f) instanceof Diretor);
    }

    @Test
    void deveRetornarSalarioDiretorComDoutorado() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Diretor");
        Diretor diretor = (Diretor) fabrica.createProfissional(3000.0f);
        assertEquals(3900.0f, diretor.calcularSalario(), 0.01f);
    }

    @Test
    void naoDevePermitirDiretorComTecnico() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Diretor");
        assertFalse(fabrica.createTitulacao() instanceof Tecnico);
    }

    @Test
    void naoDevePermitirDiretorComGraduacao() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Diretor");
        assertFalse(fabrica.createTitulacao() instanceof Graduacao);
    }

    @Test
    void naoDevePermitirDiretorComResidencia() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Diretor");
        assertFalse(fabrica.createTitulacao() instanceof Residencia);
    }

    @Test
    void devePermitirDiretorComDoutorado() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Diretor");
        assertTrue(fabrica.createTitulacao() instanceof Doutorado);
    }

}
