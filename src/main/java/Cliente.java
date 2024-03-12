
import java.util.Scanner;


public class Cliente {

    //Atributos

    private String nombre;

    private String apellido;

    private String email;

    private String direccion;

    private String telefono;

    private Compra[] compras;

    private Producto[] carrito;

    //Constructor

    public Cliente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.compras = compras;
        this.carrito = new Producto[20];
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Compra[] getCompras() {
        return compras;
    }

    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }

    public Producto[] getCarrito() {
        return carrito;
    }

    public void setCarrito(Producto[] carrito) {
        this.carrito = carrito;
    }



    //Métodos

    //Metodo para agregar un producto al carrito, pidiendo la cantidad de productos que se desean agregar

    public void agregarProducto(Producto producto, int cantidad){
        System.out.println("Ingrese la cantidad de productos que desea agregar: ");
       cantidad = Leer.entero();
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] == null) {
                carrito[i] = producto;
                carrito[i].setCantidad(cantidad);
                break;
            }
        }
    }

    //Metodo para mostrar el carrito

    public void mostrarCarrito(){
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null) {
                System.out.println(carrito[i].toString());
            }
        }
    }

    //Metodo para eliminar un producto del carrito

    public void eliminarProducto(Producto producto){
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null && carrito[i].equals(producto)) {
                carrito[i] = null;
                break;
            }
        }
    }

    //Metodo para vaciar el carrito

    public void vaciarCarrito(){
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = null;
        }
    }

    //Metodo que calcula el total de la compra

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null) {
                total += carrito[i].getPrecio();
            }
        }
        return total;
    }

    //Metodo que pide informacion de envio retornando la direccion ingresada

    public String pedirInformacionDeEnvio(){

        System.out.println("Ingrese su direccion de envio: ");
        String direccion = Leer.dato();
        setDireccion(direccion);
        return direccion;
    }

    //Metodo que pide el metodo de pago y retorna el metodo ingresado
    public String pedirMetodoDePago(){
        System.out.println("Ingrese su metodo de pago: ");
        System.out.println(" Tarjeta de credito, tarjeta de debito, efectivo");
        String opcion = Leer.dato();


        return opcion;
    }



    //Metodo para realizar una compra desde el punto de vista del cliente, llamando a los metodos que piden la informacion de envio y de pago. Creando una nueva compra con la informacion dada y agregandola a la lista de compras del cliente. LLamando al metodo de la tienda para actualizar el stock de los productos comprados.

    public void realizarCompra(Producto[] productos, TiendaElectronica tienda){
        pedirInformacionDeEnvio();
        pedirMetodoDePago();
        Compra compra = new Compra(pedirMetodoDePago(), pedirInformacionDeEnvio(), this, carrito);
        agregarCompra(compra);
        tienda.actualizarStock(carrito);
    }



    //metodo para agregar una compra hecha por el cliente a su lista de compras

    public void agregarCompra(Compra compra){
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] == null) {
                compras[i] = compra;
                break;
            }
        }
    }

    //Metodo para mostrar las compras del cliente

    public void mostrarCompras(){
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] != null) {
                System.out.println(compras[i].toString());
            }
        }
    }





}
