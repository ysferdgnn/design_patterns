package creational.factory.factorymethod.solution1;

public class MongoConnection implements Connection{

    private final String databaseName;
    private final String port;
    private final String username;
    private final String password;
    private final Boolean useSsl;

    public MongoConnection(String databaseName, String port, String username, String password, Boolean useSsl) {
        this.databaseName = databaseName;
        this.port = port;
        this.username = username;
        this.password = password;
        this.useSsl = useSsl;
    }

    @Override
    public void connect() {
        System.out.printf("connecting database: %s, port: %s,  useSSl: %s%n",databaseName,port,useSsl);
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getUseSsl() {
        return useSsl;
    }
}
