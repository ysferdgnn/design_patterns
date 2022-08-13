package creational.factory.factorymethod.solution3;


import creational.factory.factorymethod.solution2.ConnectionType;

public class ConnectionFactory {


    public Connection createConnection(ConnectionType connectionType,String port,String username,String password,Boolean useSSl){

        switch (connectionType){
            case Mongo: return new MongoConnection(connectionType.name(),"27017",username,password,useSSl);
            case MSSQl: return  new MsSqlConnection(connectionType.name(),port,username,password,false);
            case Postgre: return  new PostgreConnection(connectionType.name(),"5432",username,password);
            default: throw  new UnsupportedOperationException("UnSupported Connection Type");
        }
    }
}
