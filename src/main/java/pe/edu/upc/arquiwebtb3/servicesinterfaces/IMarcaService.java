package pe.edu.upc.arquiwebtb3.servicesinterfaces;

import pe.edu.upc.arquiwebtb3.entities.Marca;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {
    public void insert(Marca marca);
    List<Marca> list();
    public void delete(int idMarca);
    public Optional<Marca> listarId(int idMarca);
    List<Marca>search(String nombreMarca);
}

