package exercicio1;

public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = Apple.getInstancia();
        Celular iphoneX = apple.constroiCelular("iPhoneX");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();

        FabricanteCelular samsung = Samsung.getInstancia();
        Celular galaxy20 = samsung.constroiCelular("Galaxy20");
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();
    }
}

