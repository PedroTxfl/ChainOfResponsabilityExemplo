public abstract class AuthenticationHandler {
    protected AuthenticationHandler nextHandler;

    public void setNextHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String requestType);
}

