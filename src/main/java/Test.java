public class Test {

    public static void main(String[] args) {

        //Crear tienda
        TiendaElectronica tienda = new TiendaElectronica();
        tienda.setNombre("Tienda de Electronica");
        tienda.setDireccion("Calle 123");
        tienda.setTelefono("1234567890");

        //Crear productos
        Producto producto1 = new Producto(1, "Laptop", 1000, "Laptop de 15 pulgadas", 10, "Computadoras");
        Producto producto2 = new Producto(2, "Mouse", 20, "Mouse inalambrico", 50, "Accesorios");
        Producto producto3 = new Producto(3, "Teclado", 30, "Teclado inalambrico", 30, "Accesorios");

        //Crear cliente
        Cliente cliente = new Cliente("Juan", "Perez", "tjfigjfdij");

        //Crear carrito de compras del cliente
        Producto[] carrito = new Producto[20];

        //Agregar productos al carrito con el metodo agregarProducto de la clase Cliente
        cliente.agregarProducto(producto1, 2);
        cliente.agregarProducto(producto2, 1);

        //Realizar compra con el metodo realizarCompra de la clase Cliente

        cliente.realizarCompra(carrito, tienda);

        //Mostrar compras del cliente

        cliente.mostrarCompras();

    }

}
