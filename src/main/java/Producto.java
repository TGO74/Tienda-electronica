public class Producto {


    //Atributos
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;

    private int stock;

    private String categoria;

    private int cantidad;

    //Constructor
    public Producto(String nombre, double precio, String descripcion, int stock, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.categoria = categoria;
        this.cantidad = 0;

    }


    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


//Metotodos

    //Metodos para modificar atributos
    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void modificarPrecio(double precio) {
        this.precio = precio;
    }

    public void modificarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void modificarStock(int stock) {
        this.stock = stock;
    }

    public void modificarCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Override del metodo toString para mostrar los atributos del producto
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    //Metodo que actualiza la cantidad del producto dentro del carrito

    public void actualizarCantidad(int cantidad){
        this.cantidad = cantidad;
    }



}


