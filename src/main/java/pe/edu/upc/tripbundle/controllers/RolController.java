package pe.edu.upc.tripbundle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tripbundle.dtos.RolDTO;
import pe.edu.upc.tripbundle.entities.Rol;
import pe.edu.upc.tripbundle.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IRolService roS;

    @GetMapping
    public List<RolDTO> listar() {

        return roS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());


    }

    @PostMapping
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper m=new ModelMapper();
        Rol rl=m.map(dto, Rol.class);
        roS.insert(rl);
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto) {
        ModelMapper m=new ModelMapper();
        Rol rl=m.map(dto, Rol.class);
        roS.insert(rl);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        roS.delete(id);
    }

}
