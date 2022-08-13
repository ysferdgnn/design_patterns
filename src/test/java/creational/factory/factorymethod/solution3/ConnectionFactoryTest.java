package creational.factory.factorymethod.solution3;

import creational.factory.factorymethod.solution2.ConnectionType;
import org.junit.jupiter.api.Test;

public class ConnectionFactoryTest {

    @Test
    public void testConnectionFactory(){
        ConnectionFactory connectionFactory = new ConnectionFactory();

        connectionFactory.createConnection(ConnectionType.Mongo,null,"yusuf","123",true);
        connectionFactory.createConnection(ConnectionType.MSSQl,"1443","yusuf","123",null);
        connectionFactory.createConnection(ConnectionType.Postgre,null,"yusuf","123",false);
    }
}
