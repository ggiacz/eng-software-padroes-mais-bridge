package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecepcionistaTest {

    @Test
    void deveCriarRecepcionista() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Recepcionista");
        assertTrue(fabrica.createProfissional(1000.0f) instanceof Recepcionista);
    }

    @Test
    void deveRetornarSalarioRecepcionistaComTecnico() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Recepcionista");
        Recepcionista recepcionista = (Recepcionista) fabrica.createProfissional(1000.0f);
        assertEquals(1000.0f, recepcionista.calcularSalario(), 0.01f);
    }

    @Test
    void devePermitirRecepcionistaComTecnico() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Recepcionista");
        assertTrue(fabrica.createTitulacao() instanceof Tecnico);
    }

    @Test
    void naoDevePermitirRecepcionistaComGraduacao() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Recepcionista");
        assertFalse(fabrica.createTitulacao() instanceof Graduacao);
    }

    @Test
    void naoDevePermitirRecepcionistaComResidencia() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Recepcionista");
        assertFalse(fabrica.createTitulacao() instanceof Residencia);
    }

    @Test
    void naoDevePermitirRecepcionistaComDoutorado() {
        FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Recepcionista");
        assertFalse(fabrica.createTitulacao() instanceof Doutorado);
    }

}
