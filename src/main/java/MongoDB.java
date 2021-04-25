public class MongoDB implements ConnectionInter {
    @Override
    public void crearConnection() {
        System.out.println("Creando Conexión con "+BD.MONGODB);
    }
}
