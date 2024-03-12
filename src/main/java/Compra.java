public class Compra {

    //Atributos

    private String fecha;

    private String hora;

    private String metodoPago;

    private String direccionEnvio;

    private String estado;

    private String fechaEntrega;

    private Double subtotal;

    private Double impuestos;

    private Double total;

    private TiendaElectronica tienda;

    private Cliente cliente;

    private Producto[] productosComprados;

    //Constructor

    public Compra( String metodoPago, String direccionEnvio, Cliente cliente, Producto[] productosComprados) {
        this.fecha = fecha;
        this.hora = hora;
        this.metodoPago = metodoPago;
        this.direccionEnvio = direccionEnvio;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.total = total;
        this.tienda = tienda;
        this.cliente = cliente;
        this.productosComprados = productosComprados;
    }

    //Getters y Setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public TiendaElectronica getTienda() {
        return tienda;
    }

    public void setTienda(TiendaElectronica tienda) {
        this.tienda = tienda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(Producto[] productosComprados) {
        this.productosComprados = productosComprados;
    }

    //Métodos






}
