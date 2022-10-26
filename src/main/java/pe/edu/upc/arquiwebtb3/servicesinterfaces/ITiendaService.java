package pe.edu.upc.arquiwebtb3.servicesinterfaces;

import pe.edu.upc.arquiwebtb3.entities.Tienda;

import java.util.List;
import java.util.Optional;

public interface ITiendaService {
    public void insert(Tienda tienda);
    List<Tienda> list();
    public void delete(int idTienda);
    public Optional<Tienda> listarId(int idTienda);
    List<Tienda>search(String nombreTienda);
}