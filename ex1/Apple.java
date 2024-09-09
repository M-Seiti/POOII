package exercicio1;

public class Apple implements FabricanteCelular {
    private static Apple instanciaUnica;

    private Apple() {}

    public static Apple getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Apple();
        }
        return instanciaUnica;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        return new CelularImpl("Apple", modelo);
    }
}
