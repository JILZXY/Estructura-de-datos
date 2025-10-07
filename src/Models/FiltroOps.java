package Models;

import interfaces.Filtrable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FiltroOps <T extends Filtrable> {

    public static <T extends Filtrable> List<T> filtrarPorMateria(T[] elementos, String materia) {
        return Arrays.stream(elementos)
                .filter(e -> e.getMateria().equalsIgnoreCase(materia))
                .toList();
    }

    public static <T extends Filtrable> List<T> filtrarPorCategoria(T[] elementos, String categoria) {
        return Arrays.stream(elementos)
                .filter(e -> e.getCategoria().equalsIgnoreCase(categoria))
                .toList();
    }

    public static <T extends Filtrable> List<T> ordenarPorLikes(T[] elementos) {
        return Arrays.stream(elementos)
                .sorted(Comparator.comparingInt(Filtrable::getLikes).reversed())
                .toList();
    }

    public static <T extends Filtrable> List<T> ordenarPorFecha(T[] elementos) {
        return Arrays.stream(elementos)
                .sorted(Comparator.comparing(Filtrable::getFechaCreacion).reversed())
                .toList();
    }

    public static <T extends Filtrable> List<T> filtrarPorUsuario(T[] elementos, String idUsuario) {
        return Arrays.stream(elementos)
                .filter(e -> ((AtributosPadre) e).getIdUsuario().equals(idUsuario))
                .toList();
    }
}
