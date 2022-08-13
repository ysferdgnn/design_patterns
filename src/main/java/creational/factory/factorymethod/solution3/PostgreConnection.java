package creational.factory.factorymethod.solution3;

public class PostgreConnection implements Connection {
    private final String databaseName;
    private final String port;
    private final String username;
    private final String password;


    public PostgreConnection(String databaseName, String port, String username, String password) {
        this.databaseName = databaseName;
        this.port = port;
        this.username = username;
        this.password = password;

    }

    @Override
    public void connect() {
        System.out.printf("connecting database: %s, port: %s%n",databaseName,port);
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


}
