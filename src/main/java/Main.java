public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Curso curso1 = new Curso();
        GestorAcademico gestor = new GestorAcademico();

        // Probar inscripción y creación de cursos
        gestor.matricularEstudiante(estudiante1);
        gestor.agregarCurso(curso1);

        // Probar inscripción y desinscripción
        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteYaInscritoException | EstudianteNoInscritoEnCursoException e) {
            e.printStackTrace();
        }
    }
}
