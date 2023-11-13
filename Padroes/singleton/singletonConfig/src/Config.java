public class Config {
    private static Config instancia = null;
    private String urlServer;
    private int porta;

    private Config() {
        urlServer = "localhost";
        porta = 8080;
    }

    public static Config getInstancia() {
        if (instancia == null) {
            instancia = new Config();
        }
        return instancia;
    }

    public String getUrlServer() {
        return urlServer;
    }

    public void setUrlServer(String urlServer) {
        this.urlServer = urlServer;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
}

