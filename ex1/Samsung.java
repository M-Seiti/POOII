package exercicio1;

public class Samsung implements FabricanteCelular {
    private static Samsung instanciaUnica;

    private Samsung() {}

    public static Samsung getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Samsung();
        }
        return instanciaUnica;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        return new CelularImpl("Samsung", modelo);
    }
}
