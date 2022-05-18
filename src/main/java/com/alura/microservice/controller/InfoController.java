package com.alura.microservice.controller;

import com.alura.microservice.controller.dto.CompraDTO;
import com.alura.microservice.model.InfoFornecedor;
import com.alura.microservice.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
        return infoService.getInfoPorEstado(estado);
    }
}
