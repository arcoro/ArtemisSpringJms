package com.spring.jms.mq;

import com.spring.jms.datos.Operaciones;
import org.springframework.stereotype.Component;

@Component
public class OperacionesMqAdapter {

    public void receive(Operaciones obj){
        System.out.println("Adapter--> "+obj.toString());
    }


}
