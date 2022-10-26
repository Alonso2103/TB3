package pe.edu.upc.arquiwebtb3.servicesinterfaces;

import pe.edu.upc.arquiwebtb3.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente>list();
    public void delete(int idPropietario);
    public Optional<Cliente> listarId(int idCliente);
    List<Cliente>search(String nombreCliente);
}
