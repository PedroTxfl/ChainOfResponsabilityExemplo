//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AuthenticationHandler basicHandler = new BasicAuthHandler();
        AuthenticationHandler tokenHandler = new TokenAuthHandler();
        AuthenticationHandler twoFactorHandler = new TwoFactorAuthHandler();

        /* Configura sequência dos handlers
        * */
        basicHandler.setNextHandler(tokenHandler);
        tokenHandler.setNextHandler(twoFactorHandler);

        /* Teste  tipos de requisição*/
        System.out.println("Enviando solicitação com autenticação BASIC:");
        basicHandler.handleRequest("BASIC");

        System.out.println("\nEnviando solicitação com autenticação por TOKEN:");
        basicHandler.handleRequest("TOKEN");

        System.out.println("\nEnviando solicitação com 2FACTOR authentication:");
        basicHandler.handleRequest("2FACTOR");

        System.out.println("\nEnviando solicitação com autenticação UNKNOWN:");
        basicHandler.handleRequest("UNKNOWN"); // Nenhum handler trata essa requisição
    }
}