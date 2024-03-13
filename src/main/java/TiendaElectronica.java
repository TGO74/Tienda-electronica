import org.junit.jupiter.api.Test;



public class TiendaElectronica {

    //Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String horario;

    private Producto[] productos;

    //Constructor
    public TiendaElectronica() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.horario = horario;
        this.productos = new Producto[10000];
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    //Métodos

    //Metodo para mostrar un producto llamando al toString de la clase producto
    public void mostrarProducto(Producto producto) {
        System.out.println(producto.toString());
    }

    //Metodo para mostrar todos los productos

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    //Metodo para buscar un producto por su nombre

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    //Metodo por rango de precios

    public void mostrarProductosPorPrecio(double precioMin, double precioMax) {
        for (Producto producto : productos) {
            if (producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
                System.out.println(producto.toString());
            }
        }
    }

    //Metodo para agregar un producto, utilizando el constructor de la clase Producto. Es decir, pidiendo información al usuario

    public void agregarProducto() {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = Leer.dato();

        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(Leer.dato());

        System.out.println("Ingrese la descripción del producto: ");
        String descripcion = Leer.dato();


        System.out.println("Ingrese el stock del producto: ");
        int stock = Integer.parseInt(Leer.dato());

        System.out.println("Ingrese la categoria del producto: ");
        String categoria = Leer.dato();

        Producto producto = new Producto(nombre, precio, descripcion, stock, categoria);
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
    }

    //Metodo para eliminar un producto

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                productos[i] = null;
                break;
            }
        }
    }

    //Metodo para modificar un producto

    public void modificarProducto(String nombre, Producto producto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                productos[i] = producto;
                break;
            }
        }
    }

    //Metodo para mostrar todos los productos de una categoria

    public void mostrarProductosPorCategoria(String categoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                System.out.println(producto.toString());
            }
        }
    }

    //Mostrar todos los producto a la venta

    public void mostrarProductosVenta(){
        for (Producto producto : productos) {
            if (producto.getStock() > 0) {
                System.out.println(producto.toString());
            }
        }
    }


    //Logica y metodos para realizar una compra, actualizando stock de productos

    //Metodo para actualizar el stock, toma un arreglo de productos y la cantidad a actualizar

    public void actualizarStock(Producto[] productos) {
        for (Producto producto : productos) {
            producto.setStock(producto.getStock() - producto.getCantidad());
        }
    }

    //Metodo para realizar una compra, el cual recibe un cliente, el carrito, metodo de pago y direccion de envio desde el metodo realizar compra de la clase cliente



}











