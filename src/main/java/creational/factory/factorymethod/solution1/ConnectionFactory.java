package creational.factory.factorymethod.solution1;

public class ConnectionFactory {


    public Connection createConnection(String connectionType){

        if (connectionType.contentEquals("mssql")){
            return new MsSqlConnection("mssql","1443","yusuf","123",true);
        }else if(connectionType.contentEquals("mongo")){
            return new MongoConnection("mongo","27017","yusuf","123",false);
        }else if (connectionType.contentEquals("postgre")){
            return new PostgreConnection("postgre","5432","yusuf","123");
        }else{
            throw  new UnsupportedOperationException("UnSupported ConnectionType");
        }
    }
}
