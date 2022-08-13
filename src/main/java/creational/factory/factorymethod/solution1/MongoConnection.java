package creational.factory.factorymethod.solution1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MongoConnection implements Connection{

    private final String databaseName;
    private final String port;
    private final String username;
    private final String password;
    private final Boolean useSsl;

    @Override
    public void connect() {
        System.out.printf("connecting database: %s, port: %s,  useSSl: %s%n",databaseName,port,useSsl);
    }


}
