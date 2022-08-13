package creational.factory.factorymethod.solution1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostgreConnection implements Connection{
    private final String databaseName;
    private final String port;
    private final String username;
    private final String password;


    @Override
    public void connect() {
        System.out.printf("connecting database: %s, port: %s%n",databaseName,port);
    }




}
