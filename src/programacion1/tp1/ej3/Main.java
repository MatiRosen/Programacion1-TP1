package programacion1.tp1.ej3;

public class Main {

    public static void main(String[] args) {
        Instituto instituto = new Instituto("Ort");

        Carrera carrera1 = new Carrera("Analista de Sistemas");
        Carrera carrera2 = new Carrera("Diseño Grafico");

        Materia materia1 = new Materia("Matematica", "01/22", EstadoMateria.APROBADA);
        Materia materia2 = new Materia("Programacion 1", "01/21", EstadoMateria.EN_CURSO);
        Materia materia3 = new Materia("Ingles", "02/22", EstadoMateria.REPROBADA);
        Materia materia4 = new Materia("Arte", "01/20", EstadoMateria.APROBADA);

        Alumno alumno1 = new Alumno("Matias", "Matias@.com");
        Alumno alumno2 = new Alumno("Meli", "Meli@.com");
        Alumno alumno3 = new Alumno("Lucas", "Lucas@.com");
        Alumno alumno4 = new Alumno("Maxi", "Maxi@.com");
        Alumno alumno5 = new Alumno("Juan", "Juan@.com");
        Alumno alumno6 = new Alumno("Pedro", "Pedro@.com");
        Alumno alumno7 = new Alumno("Jesus", "Jesus@.com");
        Alumno alumno8 = new Alumno("Onix", "Onix@.com");

        carrera1.addAlumno(alumno1);
        carrera1.addAlumno(alumno2);
        carrera1.addAlumno(alumno3);
        carrera1.addAlumno(alumno4);
        carrera2.addAlumno(alumno5);
        carrera2.addAlumno(alumno6);
        carrera2.addAlumno(alumno7);
        carrera2.addAlumno(alumno8);

        alumno1.addMateria(materia1);
        alumno1.addMateria(materia2);
        alumno2.addMateria(materia3);
        alumno2.addMateria(materia4);
        alumno5.addMateria(materia2);
        alumno5.addMateria(materia3);
        alumno7.addMateria(materia1);
        alumno8.addMateria(materia4);

        instituto.addCarrera(carrera1);
        instituto.addCarrera(carrera2);

        Informe informe1 = carrera1.getInformeMaxMaterias();
        Informe informe2 = carrera2.getInformeMaxMaterias();

        System.out.println(informe1);
        System.out.println(informe2);
    }
}
