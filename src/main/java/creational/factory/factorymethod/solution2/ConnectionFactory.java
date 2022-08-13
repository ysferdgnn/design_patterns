package creational.factory.factorymethod.solution2;



public class ConnectionFactory {


    public Connection createConnection(ConnectionType connectionType){

        switch (connectionType){
            case Mongo: return new MongoConnection("mongo","27017","yusuf","123",true);
            case MSSQl: return  new MsSqlConnection("mssql","1443","yusuf","123",false);
            case Postgre: return  new PostgreConnection("postgre","5432","yusuf","123");
            default: throw  new UnsupportedOperationException("UnSupported Connection Type");
        }
    }
}
