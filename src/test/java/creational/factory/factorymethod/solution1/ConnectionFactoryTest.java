package creational.factory.factorymethod.solution1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectionFactoryTest {

    @Test
    public void testConnectionFactory(){

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connectionMssql = connectionFactory.createConnection("mssql");
        Connection connectionMongo = connectionFactory.createConnection("mongo");
        Connection connectionPostgre = connectionFactory.createConnection("postgre");

        connectionMssql.connect();
        connectionMongo.connect();
        connectionPostgre.connect();

        Assertions.assertThrows(UnsupportedOperationException.class,()->{connectionFactory.createConnection("something");},"dwd");
    }
}
