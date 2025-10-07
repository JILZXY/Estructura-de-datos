import Models.Apunte;
import Models.Carpeta;
import Models.FiltroOps;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Apunte[] apuntes = new Apunte[] {
                new Apunte("U001", "Apunte 1", "Desc 1", "Matemáticas", "Teoría", true, new Date(), 101L, "urlA", new Date(), 50),
                new Apunte("U002", "Apunte 2", "Desc 2", "Biología", "Ejercicios", true, new Date(), 102L,  "urlB", new Date(), 120),
                new Apunte("U001", "Apunte 3", "Desc 3", "Matemáticas", "Resumen", false, new Date(), 103L, "urlC", new Date(), 80)
        };

        Carpeta[] carpetas = new Carpeta[] {
                new Carpeta("U001", "Carpeta A", "Notas de Álgebra", "Matemáticas", "Teoría", true, new Date(), 201L, null, new Date(), "Azul"),
                new Carpeta("U002", "Carpeta B", "Biología Celular", "Biología", "Ejercicios", true, new Date(), 202L, null, new Date(), "Verde"),
                new Carpeta("U001", "Carpeta C", "Resumenes", "Matemáticas", "Resumen", false, new Date(), 203L, null, new Date(), "Rojo")
        };

        var apuntesMate = FiltroOps.filtrarPorMateria(apuntes, "Matemáticas");
        System.out.println("Apuntes de Matemáticas:");
        apuntesMate.forEach(a -> System.out.println(a.getNombre() + " - Likes: " + a.getLikes()));

        var apuntesOrdenados = FiltroOps.ordenarPorLikes(apuntes);
        System.out.println("\nApuntes ordenados por likes:");
        apuntesOrdenados.forEach(a -> System.out.println(a.getNombre() + " - Likes: " + a.getLikes()));

        var carpetasUsuario = FiltroOps.filtrarPorUsuario(carpetas, "U001");
        System.out.println("\nCarpetas del usuario U001:");
        carpetasUsuario.forEach(c -> System.out.println(c.getNombre() + " - Materia: " + c.getMateria()));

        var carpetasOrdenadas = FiltroOps.ordenarPorFecha(carpetas);
        System.out.println("\nCarpetas ordenadas por fecha:");
        carpetasOrdenadas.forEach(c -> System.out.println(c.getNombre() + " - Fecha: " + c.getFechaCreacion()));
    }

}