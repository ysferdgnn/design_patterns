package creational.factory.factorymethod.solution2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectionFactoryTest {

    @Test
    public void testConnectionFactory(){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connectionMssql = connectionFactory.createConnection(ConnectionType.MSSQl);
        Connection connectionMongo = connectionFactory.createConnection(ConnectionType.Mongo);
        Connection connectionPostgre = connectionFactory.createConnection(ConnectionType.Postgre);


        connectionMssql.connect();
        connectionMongo.connect();
        connectionPostgre.connect();
        // enum olduğu için farklı bir bağlantı tipi geçemiyoruz
       // Assertions.assertThrows(UnsupportedOperationException.class,()-> {connectionFactory.createConnection(ConnectionType.Mongo);});
    }
}
