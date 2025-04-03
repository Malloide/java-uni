package Pago;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FacturaTest {
    private static EmpleadoAsalariado supervisor;

    @BeforeAll
    public static void setUp() {
        supervisor = new EmpleadoAsalariado("Supervisor General", "00000000", 5000.0,null);
    }

    @Test
    public void testFacturaObtenerPago() {
        Factura factura = new Factura("Proveedor Test", "T001", "03-04-2025");
        factura.agregarItem("Producto 1", 100.0, 1);
        factura.agregarItem("Producto 2", 200.0, 2);
        double totalEsperado = 500.0;
        assertEquals(totalEsperado, factura.obtenerPago(), 0.001, "El total de la factura debe ser 500.0");
    }
    
    @Test
    public void testEmpleadoAsalariadoObtenerPago() {
        EmpleadoAsalariado empleado = new EmpleadoAsalariado("Empleado A", "11111111", 3000.0, supervisor);
        assertEquals(3000.0, empleado.obtenerPago(), 0.001, "El pago del empleado asalariado debe ser su salario mensual");
    }
    
    @Test
    public void testEmpleadoPorHoraObtenerPago() {
        EmpleadoPorHora empleado = new EmpleadoPorHora("Empleado B", "22222222", 15.0, 160, supervisor);
        assertEquals(2400.0, empleado.obtenerPago(), 0.001, "El pago por hora debe calcularse como valorHora * horasTrabajadas");
    }
    
    @Test
    public void testEmpleadoPorComisionObtenerPago() {
        EmpleadoPorComision empleado = new EmpleadoPorComision("Empleado C", "33333333", 7.0, 5000.0, supervisor);
        assertEquals(350.0, empleado.obtenerPago(), 0.001, "El pago por comisión debe ser ventasBrutas * (porcentajeComision / 100)");
    }
    
    @Test
    public void testEmpleadoBaseMasComisionObtenerPago() {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Empleado D", "44444444", 7.0, 5000.0, 1500.0, supervisor);
        assertEquals(2035.0, empleado.obtenerPago(), 0.001, "El pago debe incluir el salario base, la comisión y un incremento del 10%");
    }
}
