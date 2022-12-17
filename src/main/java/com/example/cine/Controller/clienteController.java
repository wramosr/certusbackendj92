package com.example.cine.Controller;

import com.example.cine.Bean.clienteBean;
import com.example.cine.Service.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200/")   // Sirve para conectar o pasar datos a nuestro Front
public class clienteController {


    @Autowired
    private clienteRepository clieRepo;

    @GetMapping("/obtener")
    public List<clienteBean> obtenerCliente(){

        List<clienteBean> listaCliente=new ArrayList<>();
        listaCliente=(List<clienteBean>) clieRepo.findAll();
        return listaCliente;
    }

    @PostMapping("/insertar")
    public void insertarCliente(@RequestBody clienteBean clieBean){

        clieRepo.save(clieBean);
    }

    @PutMapping("/modificar")
    public void modificarCliente(@RequestBody clienteBean clieBean){

        clieRepo.save(clieBean);
    }

    @DeleteMapping(value="/{idRecibido}")
    public void eliminarCliente(@PathVariable ("idRecibido") Integer id){
        clieRepo.deleteById(id);
    }

    //ESTA PARTE ES PARA EL FRONTEND QUE NECESITA ARGUMENTOS ADICIONALES PARA HACER MODIFICACIONES Y ELIMINAR

    @PutMapping("/modificar/{idregistrowilson}")
    public void modificarClienteUnico(@PathVariable("idregistrowilson") Integer idregistrowilson, @RequestBody clienteBean clieBean){
        clieBean.setIdregistrowilson(idregistrowilson);
        clieRepo.save(clieBean);
    }

    @GetMapping("/obtener/{idregistrowilson}")
    public ResponseEntity<clienteBean> obtenerClienteUnico(@PathVariable ("idregistrowilson") Integer idregistrowilson){
        clienteBean listaClienteEncontrado = clieRepo.findById(idregistrowilson).orElseThrow();
        return ResponseEntity.ok(listaClienteEncontrado);
    }

    @DeleteMapping("/eliminar/{idregistrowilson}")
    public void eliminarCliente1(@PathVariable ("idregistrowilson") Integer idregistrowilson){
        clieRepo.deleteById(idregistrowilson);
    }
}
