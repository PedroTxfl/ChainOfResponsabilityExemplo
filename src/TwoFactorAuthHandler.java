public class TwoFactorAuthHandler extends AuthenticationHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("2FACTOR")) {
            System.out.println("Tratado por Two-Factor Authentication Handler");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
