public class ConcreteF extends Factory{
    @Override
    public ConnectionInter factoryConnection(BD ConeccionBD) {
        ConnectionInter result= null;

        switch (ConeccionBD){
            case MYSQL:
                result= new MySQL();
                break;

            case ORACLE:
                result= new ORACLE();
                break;

            case MONGODB:
                result= new MongoDB();
                break;
        }
        return result;
    }
}
