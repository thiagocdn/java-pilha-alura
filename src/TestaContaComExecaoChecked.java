public class TestaContaComExecaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
        } catch (MinhaExcecao ex) {
            System.out.println("Tratamento da exceção.....");
        }
    }
}
