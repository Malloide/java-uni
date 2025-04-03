package EjerciciosEntrega.Ej11;

import java.util.*;

/**
 * Interfaz PorPagar - Define el contrato para las clases que requieren cálculo de pago
 * Este es un ejemplo de implementación del patrón Strategy
 */
interface PorPagar {
    double obtenerPago();
}

/**
 * Clase base Empleado - Implementa la interfaz PorPagar
 * Contiene los atributos comunes a todos los tipos de empleados
 */
class Empleado implements PorPagar {
    protected String nombre;
    protected String documento;
    
    // Constructor
    public Empleado(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }
    
    // Getters y setters requeridos por la consigna
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    // Implementación del método de la interfaz
    @Override
    public double obtenerPago() {
        return 0; // Implementación base - será sobrescrita por las subclases
    }
    
    @Override
    public String toString() {
        return nombre + " - Documento: " + documento;
    }
}

/**
 * Subclase EmpleadoAsalariado - Empleado con salario mensual fijo
 */
class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;
    
    // Constructor
    public EmpleadoAsalariado(String nombre, String documento, double salarioMensual) {
        super(nombre, documento);
        this.salarioMensual = salarioMensual;
    }
    
    // Getters y setters
    public double getSalarioMensual() {
        return salarioMensual;
    }
    
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    // Sobrescritura del método de la interfaz
    @Override
    public double obtenerPago() {
        return salarioMensual;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Salario: $" + salarioMensual;
    }
}

/**
 * Subclase EmpleadoPorHora - Empleado que cobra por horas trabajadas
 */
class EmpleadoPorHora extends Empleado {
    private double valorHora;
    private int horasTrabajadas;
    
    // Constructor
    public EmpleadoPorHora(String nombre, String documento, double valorHora, int horasTrabajadas) {
        super(nombre, documento);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    // Getters y setters
    public double getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    // Sobrescritura del método de la interfaz
    @Override
    public double obtenerPago() {
        return valorHora * horasTrabajadas;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Valor Hora: $" + valorHora + 
               " - Horas: " + horasTrabajadas + " - Pago: $" + obtenerPago();
    }
}

/**
 * Subclase EmpleadoPorComision - Empleado que cobra un porcentaje de sus ventas
 */
class EmpleadoPorComision extends Empleado {
    protected double porcentajeComision;
    protected double ventasBrutas;
    
    // Constructor
    public EmpleadoPorComision(String nombre, String documento, double porcentajeComision, double ventasBrutas) {
        super(nombre, documento);
        this.porcentajeComision = porcentajeComision;
        this.ventasBrutas = ventasBrutas;
    }
    
    // Getters y setters
    public double getPorcentajeComision() {
        return porcentajeComision;
    }
    
    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    public double getVentasBrutas() {
        return ventasBrutas;
    }
    
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
    
    // Sobrescritura del método de la interfaz
    @Override
    public double obtenerPago() {
        return ventasBrutas * (porcentajeComision / 100);
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Ventas: $" + ventasBrutas + 
               " - Comisión: " + porcentajeComision + "% - Pago: $" + obtenerPago();
    }
}

/**
 * Subclase EmpleadoBaseMasComision - Empleado con salario base más comisión
 * Incluye un incremento del 10% según lo requerido en la consigna
 */
class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;
    
    // Constructor
    public EmpleadoBaseMasComision(String nombre, String documento, double porcentajeComision, 
                                   double ventasBrutas, double salarioBase) {
        super(nombre, documento, porcentajeComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }
    
    // Getters y setters
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    // Sobrescritura del método de la interfaz
    // Aplica el 10% de incremento según el requisito 10
    @Override
    public double obtenerPago() {
        return (salarioBase + super.obtenerPago()) * 1.10;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Salario Base: $" + salarioBase + 
               " - Pago Total (con 10% adicional): $" + obtenerPago();
    }
}

/**
 * Clase Item - Representa un ítem en una factura
 */
class Item {
    private String descripcion;
    private double precioUnitario;
    private int cantidad;
    
    // Constructor
    public Item(String descripcion, double precioUnitario, int cantidad) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    
    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Calcula el subtotal del ítem
    public double getSubtotal() {
        return precioUnitario * cantidad;
    }
    
    @Override
    public String toString() {
        return descripcion + " - Precio: $" + precioUnitario + 
               " - Cantidad: " + cantidad + " - Subtotal: $" + getSubtotal();
    }
}

/**
 * Clase Factura - Implementa la interfaz PorPagar
 */
class Factura implements PorPagar {
    private String proveedor;
    private String numeroFactura;
    private String fechaCompra;
    private List<Item> items;
    
    // Constructor
    public Factura(String proveedor, String numeroFactura, String fechaCompra) {
        this.proveedor = proveedor;
        this.numeroFactura = numeroFactura;
        this.fechaCompra = fechaCompra;
        this.items = new ArrayList<>();
    }
    
    // Getters y setters
    public String getProveedor() {
        return proveedor;
    }
    
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public String getNumeroFactura() {
        return numeroFactura;
    }
    
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    
    public String getFechaCompra() {
        return fechaCompra;
    }
    
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    // Método para agregar ítems a la factura
    public void agregarItem(String descripcion, double precioUnitario, int cantidad) {
        items.add(new Item(descripcion, precioUnitario, cantidad));
    }
    
    // Implementación del método de la interfaz
    @Override
    public double obtenerPago() {
        double total = 0;
        for (Item item : items) {
            total += item.getSubtotal();
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura #").append(numeroFactura)
          .append(" - Proveedor: ").append(proveedor)
          .append(" - Fecha: ").append(fechaCompra)
          .append("\nItems:");
        
        for (Item item : items) {
            sb.append("\n  ").append(item);
        }
        
        sb.append("\nTotal a pagar: $").append(obtenerPago());
        return sb.toString();
    }
}

/**
 * Clase principal SistemaPagos
 * Demuestra el uso del sistema de pagos con diferentes tipos de empleados y facturas
 */
public class SistemaPagos {
    public static void main(String[] args) {
        // Creación de una lista de elementos por pagar (empleados y facturas)
        List<PorPagar> listaPagos = new ArrayList<>();
        
        // Creación de empleados de diferentes tipos
        listaPagos.add(new EmpleadoAsalariado("Juan Perez", "12345678", 2500));
        listaPagos.add(new EmpleadoPorHora("Maria Gomez", "87654321", 20, 160));
        listaPagos.add(new EmpleadoPorComision("Carlos Ramirez", "13579246", 5, 10000));
        listaPagos.add(new EmpleadoBaseMasComision("Laura Diaz", "24681357", 5, 12000, 2000));
        
        // Creación de facturas
        Factura factura1 = new Factura("Proveedor A", "001", "01-04-2025");
        factura1.agregarItem("Laptop", 1000, 2);
        factura1.agregarItem("Mouse", 50, 3);
        listaPagos.add(factura1);
        
        Factura factura2 = new Factura("Proveedor B", "002", "02-04-2025");
        factura2.agregarItem("Monitor", 200, 2);
        factura2.agregarItem("Teclado", 80, 1);
        listaPagos.add(factura2);
        
        // Mostrar listado de pagos
        System.out.println("=== LISTADO DE PAGOS ===");
        double totalPagos = 0;
        
        for (PorPagar pago : listaPagos) {
            System.out.println("\n" + pago);
            totalPagos += pago.obtenerPago();
        }
        
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total de pagos a realizar: $" + totalPagos);
    }
}