public class Test {

    public static void main(String[] args) {

        // Crear un objeto de la clase TIENDA

        TiendaElectronica tienda = new TiendaElectronica();
        tienda.setNombre("Tienda Electronica");
        tienda.setDireccion("Calle 123");
        tienda.setTelefono("1234567");
        tienda.setEmail("DQDAFA");
        tienda.setHorario("Lunes a Viernes de 8:00 a 18:00");

        //prueba agregar producto clase tienda

        tienda.agregarProducto();

        //prueba mostrar producto clase tienda

        tienda.mostrarProductosVenta();

    }
}