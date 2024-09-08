package pe.edu.upc.tripbundle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tripbundle.dtos.FaunaDTO;
import pe.edu.upc.tripbundle.entities.Fauna;
import pe.edu.upc.tripbundle.serviceinterfaces.IFaunaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/faunas")

public class FaunaController {

    @Autowired
    private IFaunaService fS;

    @GetMapping
    public List<FaunaDTO> listar() {

        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, FaunaDTO.class);
        }).collect(Collectors.toList());

    }

    @PostMapping
    public void insertar(@RequestBody FaunaDTO dto) {
        ModelMapper m=new ModelMapper();
        Fauna fa=m.map(dto, Fauna.class);
        fS.insert(fa);
    }

    @PutMapping
    public void modificar(@RequestBody FaunaDTO dto){
        ModelMapper m=new ModelMapper();
        Fauna fa=m.map(dto, Fauna.class);
        fS.update(fa);
    }

}
