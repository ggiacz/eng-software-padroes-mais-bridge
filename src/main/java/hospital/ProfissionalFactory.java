package hospital;

public class ProfissionalFactory {

    private ProfissionalFactory() {};
    private static ProfissionalFactory instance = new ProfissionalFactory();
    public static ProfissionalFactory getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String profissional) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("hospital.Fabrica" + profissional);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Profissional inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Profissional inválido");
        }
        return (FabricaAbstrata) objeto;
    }
}
