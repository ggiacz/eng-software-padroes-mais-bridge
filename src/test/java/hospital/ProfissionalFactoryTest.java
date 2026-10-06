package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfissionalFactoryTest {

    @Test
    void deveRetornarMesmaInstancia() {
        assertSame(ProfissionalFactory.getInstance(), ProfissionalFactory.getInstance());
    }

    @Test
    void deveRetornarExcecaoParaProfissionalInexistente() {
        try {
            FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Farmaceutico");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Profissional inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProfissionalInvalido() {
        try {
            FabricaAbstrata fabrica = ProfissionalFactory.getInstance().obterFabrica("Voluntario");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Profissional inválido", e.getMessage());
        }
    }
}
