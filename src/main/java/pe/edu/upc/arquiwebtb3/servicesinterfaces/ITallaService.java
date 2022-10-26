package pe.edu.upc.arquiwebtb3.servicesinterfaces;

import pe.edu.upc.arquiwebtb3.entities.Talla;

import java.util.List;
import java.util.Optional;

public interface ITallaService {
    public void insert(Talla talla);
    List<Talla> list();
    public void delete(int idTalla);
    public Optional<Talla> listarId(int idTalla);
    List<Talla>search(String letraTalla);
}