package com.example.cine.Service;

import com.example.cine.Bean.clienteBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends CrudRepository<clienteBean, Integer> {
}
