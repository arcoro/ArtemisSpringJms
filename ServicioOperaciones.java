package com.spring.jms.servicios;

import com.spring.jms.datos.Operaciones;
import org.springframework.stereotype.Component;

@Component
public interface ServicioOperaciones {
    public int sumar(Operaciones operaciones);
}
