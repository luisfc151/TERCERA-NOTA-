package company.hr;

public class Employee {
    public String nombre;
    protected String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor que 0.");
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void aumentarSalario(double cantidad) {
        if (cantidad > 0) {
            this.salario += cantidad;
        } else {
            System.out.println("La cantidad a aumentar debe ser positiva.");
        }
    }
}
