package exercicio1;

public class CelularImpl implements Celular {
    private String modelo;
    private String fabricante;

    public CelularImpl(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao() {
        System.out.println("Ligando do " + modelo + " (" + fabricante + ")...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Tirando foto com o " + modelo + " (" + fabricante + ")...");
    }
}

