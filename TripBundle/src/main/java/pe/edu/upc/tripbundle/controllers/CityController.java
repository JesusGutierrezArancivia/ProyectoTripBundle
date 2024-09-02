package pe.edu.upc.tripbundle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tripbundle.dtos.CityDTO;
import pe.edu.upc.tripbundle.entities.City;
import pe.edu.upc.tripbundle.serviceinterfaces.ICityService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ciudades")

public class CityController {

    @Autowired
    private ICityService cS;

    @GetMapping
    public List<CityDTO> listar() {

        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CityDTO.class);
        }).collect(Collectors.toList());


    }

    @PostMapping
    public void insertar(@RequestBody CityDTO dto) {
        ModelMapper m=new ModelMapper();
        City ci=m.map(dto, City.class);
        cS.insert(ci);
    }

    @PutMapping
    public void modificar(@RequestBody CityDTO dto){
        ModelMapper m=new ModelMapper();
        City ci=m.map(dto, City.class);
        cS.update(ci);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

}
