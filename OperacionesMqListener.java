package com.spring.jms.mq;

import com.spring.jms.datos.Operaciones;
import com.spring.jms.servicios.ServicioOperaciones;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OperacionesMqListener {

    @Autowired
    private ServicioOperaciones servicioOperaciones;

    @JmsListener(destination = "DLQ", containerFactory = "jmsListenerContainerFactory")
    public void suma(Operaciones operaciones){
        System.out.println(new Date()+": Mensaje recibido "+ operaciones.toString());
        int resultado =servicioOperaciones.sumar(operaciones);
        System.out.println(operaciones.toString()+" respuesta de suma: "+resultado);
    }
}
