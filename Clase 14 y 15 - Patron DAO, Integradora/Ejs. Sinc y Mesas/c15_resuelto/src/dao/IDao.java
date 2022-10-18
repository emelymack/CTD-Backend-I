package dao;

import java.util.List;

public interface IDao <T> {
    T guardar(T t);
    T buscar(int id);

    void eliminar(int id);
    List<T> buscarTodos();
}
