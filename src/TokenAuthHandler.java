public class TokenAuthHandler extends AuthenticationHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("TOKEN")) {
            System.out.println("(handled)Tratado pelo Manipulador de Autenticação por Token");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
