package ej19;

public class Test {

    public static void main(String[] args) {
        Pyme pyme = new Pyme();

        pyme.altaDeEmpleado(1, "Mati1", 10);
        pyme.altaDeEmpleado(2, "Mati2", 10);
        pyme.altaDeEmpleado(3, "Mati3", 10);
        pyme.altaDeEmpleado(4, "Mati4", 10);
        pyme.altaDeEmpleado(5, "Mati5", 10);
        pyme.altaDeEmpleado(6, "Mati6", 10);
        pyme.altaDeEmpleado(7, "Mati7", 10);
        pyme.altaDeEmpleado(8, "Mati8", 10);
        pyme.altaDeEmpleado(9, "Mati9", 10);
        pyme.altaDeEmpleado(10, "Mati10", 10);
        System.out.println(pyme.sueldoTotal());
        pyme.bajaDeEmpleado(5);
        System.out.println(pyme.sueldoTotal());
    }
}
