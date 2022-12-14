package pe.edu.upc.arquiwebtb3.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.arquiwebtb3.entities.Talla;
import pe.edu.upc.arquiwebtb3.repositories.ITallaRepository;
import pe.edu.upc.arquiwebtb3.servicesinterfaces.ITallaService;

import java.util.List;
import java.util.Optional;

@Service
public class TallaServiceImpl implements ITallaService {
    @Autowired
    private ITallaRepository tR;
    @Override
    public void insert(Talla talla) {
        tR.save(talla);
    }

    @Override
    public List<Talla> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTalla) {
        tR.deleteById(idTalla);
    }

    @Override
    public Optional<Talla> listarId(int idTalla) {
        return Optional.of(tR.findById(idTalla).orElse(new Talla()));
    }

    @Override
    public List<Talla> search(String letraTalla) {
        return tR.search(letraTalla);
    }
}
