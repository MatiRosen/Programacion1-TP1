package programacion1.tp1.ej6;

public class Main {

    public static void main(String[] args) {
        Carrera carrera = new Carrera("Analista de Sistemas");
        for (int i = 1; i < 50; i++){
            Alumno alumno = new Alumno(i + "", i + "@gmail.com");
            carrera.agregarAlumno(alumno);
            if (i % 2 == 0){
                for (int j = 1; j <= 5; j++){
                    alumno.addMateria("" + i, i % 3 == 0 ? 8 : 5);
                }
            }
        }

        for (Candidato candidato : carrera.obtenerCandidatos(7)){
            System.out.println(candidato.getNombre());
        }
    }
}
