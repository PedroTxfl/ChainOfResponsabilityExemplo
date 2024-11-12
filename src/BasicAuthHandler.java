public class BasicAuthHandler extends AuthenticationHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("BASIC")) {
            System.out.println("Tratado por Basic Authentication Handler");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
