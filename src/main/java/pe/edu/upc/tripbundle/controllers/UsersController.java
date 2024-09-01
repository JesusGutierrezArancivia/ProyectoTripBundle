package pe.edu.upc.tripbundle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tripbundle.dtos.UsersDTO;
import pe.edu.upc.tripbundle.entities.Users;
import pe.edu.upc.tripbundle.serviceinterfaces.IUsersService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")

public class UsersController {

    @Autowired
    private IUsersService uS;

    @GetMapping
    public List<UsersDTO> listar() {

        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());


    }

    @PostMapping
    public void insertar(@RequestBody UsersDTO dto) {
        ModelMapper m=new ModelMapper();
        Users us=m.map(dto, Users.class);
        uS.insert(us);
    }

    @PutMapping
    public void modificar(@RequestBody UsersDTO dto){
        ModelMapper m=new ModelMapper();
        Users us=m.map(dto, Users.class);
        uS.update(us);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

}
