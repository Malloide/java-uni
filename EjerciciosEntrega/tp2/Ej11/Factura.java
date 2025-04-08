package Pago;

import java.util.List;
import java.util.ArrayList;

/**
 * Interfaz PorPagar - Define el contrato para las clases que requieren cálculo de pago.
 */
interface PorPagar {
    double obtenerPago();
}

// clase base Empleado
 
class Empleado implements PorPagar {
	 protected String nombre;
	    protected String documento;
	    protected Empleado supervisor; 

	    public Empleado(String nombre, String documento, Empleado supervisor) {
	        this.nombre = nombre;
	        this.documento = documento;
	        this.supervisor = supervisor;
	    }

    // Getters y setters
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

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    // Implementación del método de la interfaz
    @Override
    public double obtenerPago() {
        return 0; 
    }

    @Override
    public String toString() {
        return nombre + " - Documento: " + documento + 
               (supervisor != null ? " - Supervisor: " + supervisor.getNombre() : "");
    }
}

//subclase EmpleadoAsalariado - Empleado con salario mensual fijo
class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String documento, double salarioMensual, Empleado supervisor) {
        super(nombre, documento, supervisor);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double obtenerPago() {
        return salarioMensual;
    }

    @Override
    public String toString() {
        return super.toString() + " - Salario: $" + salarioMensual;
    }
}

//Subclase EmpleadoPorHora
class EmpleadoPorHora extends Empleado {
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String documento, double valorHora, int horasTrabajadas,Empleado supervisor) {
        super(nombre, documento,supervisor);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

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

//Subclase EmpleadoPorComision
class EmpleadoPorComision extends Empleado {
    protected double porcentajeComision;
    protected double ventasBrutas;

    public EmpleadoPorComision(String nombre, String documento, double porcentajeComision, double ventasBrutas,Empleado supervisor) {
        super(nombre, documento,supervisor);
        this.porcentajeComision = porcentajeComision;
        this.ventasBrutas = ventasBrutas;
    }

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
 */
class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String documento, double porcentajeComision,
                                   double ventasBrutas, double salarioBase,Empleado supervisor) {
        super(nombre, documento, porcentajeComision, ventasBrutas,supervisor);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double obtenerPago() {
        return (salarioBase + super.obtenerPago()) * 1.10;
    }

    @Override
    public String toString() {
        return super.toString().replaceFirst(" - Pago: \\$\\d+(\\.\\d+)?", "") + 
               " - Salario Base: $" + salarioBase + 
               " - Pago Total (con 10% adicional): $" + obtenerPago();
    }
}



/**
 * Clase Factura - Implementa la interfaz PorPagar.
 * La clase interna Item es privada y representa un ítem en la factura.
 * Además, Factura es la clase principal de la aplicación (contiene el método main).
 */
public class Factura implements PorPagar {
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
    
    // Clase interna privada Item
    private class Item {
        private String descripcion;
        private double precioUnitario;
        private int cantidad;
        
        public Item(String descripcion, double precioUnitario, int cantidad) {
            // Se utilizan los setters locales para inicializar los atributos
            setDescripcion(descripcion);
            setPrecioUnitario(precioUnitario);
            setCantidad(cantidad);
        }
        
        // Métodos getters y setters ahora privados y utilizados localmente
        
        private String getDescripcion() {
            return descripcion;
        }
        
        private void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        
        private double getPrecioUnitario() {
            return precioUnitario;
        }
        
        private void setPrecioUnitario(double precioUnitario) {
            this.precioUnitario = precioUnitario;
        }
        
        private int getCantidad() {
            return cantidad;
        }
        
        private void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
        
        public double getSubtotal() {
            // Se utilizan los getters locales para calcular el subtotal
            return getPrecioUnitario() * getCantidad();
        }
        
        @Override
        public String toString() {
            // Se utilizan los getters locales para formar la representación del ítem
            return getDescripcion() + " - Precio: $" + getPrecioUnitario() + 
                   " - Cantidad: " + getCantidad() + " - Subtotal: $" + getSubtotal();
        }
    }
    
    /**
     * Método main de la aplicación.
     * Se demuestra el uso del sistema de pagos con diferentes tipos de empleados y facturas.
     */
    public static void main(String[] args) {
        // Lista de elementos por pagar (empleados y facturas)
        List<PorPagar> listaPagos = new ArrayList<>();
        
        // Creación de un supervisor general
        EmpleadoAsalariado supervisor = new EmpleadoAsalariado("Roberto Jefe", "99999999", 5000,null);
        
        // Creación de empleados de diferentes tipos
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan Perez", "12345678", 2500,supervisor);
       

        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Maria Gomez", "87654321", 20, 160,supervisor);
        
        EmpleadoPorComision empleado3 = new EmpleadoPorComision("Carlos Ramirez", "13579246", 5, 10000,supervisor);
        

        EmpleadoBaseMasComision empleado4 = new EmpleadoBaseMasComision("Laura Diaz", "24681357", 5, 12000, 2000,supervisor);
        

        // Agregar empleados a la lista
        listaPagos.add(supervisor);
        listaPagos.add(empleado1);
        listaPagos.add(empleado2);
        listaPagos.add(empleado3);
        listaPagos.add(empleado4);

        // Creación de facturas y agregado de ítems
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
