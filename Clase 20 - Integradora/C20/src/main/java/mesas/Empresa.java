package mesas;

import presencial.Empleado;

import java.util.List;

public class Empresa {
    private Long cuit;
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(Long cuit, String razonSocial, List<Empleado> empleados) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = empleados;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
