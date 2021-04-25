import java.util.Random;

public class Principal {

    public static void main(String[] args) throws InterruptedException{
        ConnectionInter conection=null;
        ConcreteF concreteF=new ConcreteF();

        Random rnd=new Random();
        Integer var=0;

        for (;;){
            var= rnd.nextInt(4);
            Thread.sleep(5000);

            switch (var){
                case 0:
                    conection= concreteF.factoryConnection(BD.MYSQL);
                    break;
                case 1:
                    conection= concreteF.factoryConnection(BD.MONGODB);
                    break;
                case 2:
                    conection= concreteF.factoryConnection(BD.ORACLE);
                    break;
                default:
                    System.out.println("No hay Conexion..."+ "\n");
                    break;
            }

            conection.crearConnection();


        }
    }

}
