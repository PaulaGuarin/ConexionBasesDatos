public class MySQL implements ConnectionInter {

    @Override
    public void crearConnection() {
        System.out.println("Creando Conexión con "+BD.MYSQL);
    }
}
