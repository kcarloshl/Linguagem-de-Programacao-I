public class Configuracao {

    public static void main(String[] args) {

        Config c1 = Config.getInstance();
        Config c2 = Config.getInstance();

        if (c1 == c2) {
        System.out.println("É a mesma instância! Singleton funcionou.");
        }
    }
}

class Config {

    private static Config instance;

    private Config() {

        System.out.println("Carregando configs...");
    }

    public static Config getInstance() {

        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
}