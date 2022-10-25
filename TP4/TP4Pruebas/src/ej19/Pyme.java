package ej19;

public class Pyme {

    private static final int MAX_EMPLEADOS = 665;
    private Empleado[] empleados;

    public Pyme(){
        this.empleados = new Empleado[MAX_EMPLEADOS];
    }

    public int altaDeEmpleado(int dni, String apellido, double sueldo){
        int pos = -1;
        int i = 0;
        while (i < empleados.length && pos == -1){
            if (empleados[i] == null){
                pos = i;
                empleados[i] = new Empleado(dni, apellido, sueldo);
            }
            i++;
        }

        return pos;
    }

    public Empleado bajaDeEmpleado(int dni){
        Empleado empleado = null;
        int i = 0;
        while (empleado == null && i < empleados.length){
            Empleado empleadoAux = empleados[i];
            if (empleadoAux != null && empleadoAux.getDni() == dni){
                empleado = empleadoAux;
                ordenarEmpleados(i);
            }
            i++;
        }

        return empleado;
    }

    private void ordenarEmpleados(int pos){
        while (pos < MAX_EMPLEADOS - 1 && empleados[pos+1] != null){
            empleados[pos] = empleados[pos+1];
            pos++;
        }
        empleados[pos] = null;
    }

    public int cantVacantes(){
        int i = 0;
        while (i < empleados.length && empleados[i] != null){
            i++;
        }

        return MAX_EMPLEADOS - i;
    }

    public double sueldoTotal(){
        double total = 0;
        for (int i = 0; i < MAX_EMPLEADOS - cantVacantes(); i++) {
            Empleado empleado = empleados[i];
            if (empleado != null) {
                total += empleado.getSueldo();
            }
        }
        return total;
    }

    public void mostrarTodo(){
        for (Empleado empleado: empleados){
            System.out.println(empleado);
        }
    }
}
