package pe.edu.upc.tripbundle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.tripbundle.dtos.ReserveDTO;
import pe.edu.upc.tripbundle.serviceinterfaces.IReserveService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")

public class ReserveController {
    @Autowired
    private IReserveService rS;


    public List<ReserveDTO> listar(){

        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ReserveDTO.class);
        }).collect(Collectors.toList());
    }


}
