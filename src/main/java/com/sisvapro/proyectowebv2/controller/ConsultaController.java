package com.sisvapro.proyectowebv2.controller;

import com.sisvapro.proyectowebv2.model.Carro;
import com.sisvapro.proyectowebv2.model.Cliente;
import com.sisvapro.proyectowebv2.model.DetalleVenta;
import com.sisvapro.proyectowebv2.model.Empleado;
import com.sisvapro.proyectowebv2.model.Venta;
import com.sisvapro.proyectowebv2.repository.ICarroRepository;
import com.sisvapro.proyectowebv2.repository.IClienteRepository;
import com.sisvapro.proyectowebv2.repository.IDetalleVentaRepository;
import com.sisvapro.proyectowebv2.repository.IEmpleadoRepository;
import com.sisvapro.proyectowebv2.repository.IVentaRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaController {

    @Autowired
    private ICarroRepository repoCar;

    @Autowired
    private IEmpleadoRepository repoEm;

    @Autowired
    private IClienteRepository repoCli;
    
    @Autowired
    private IVentaRepository repoVenta;
    
    @Autowired
    private IDetalleVentaRepository repoDetalleVenta;
    
    @GetMapping("/consultas/carros")
    public String cargarPagConsultaCarro(Model model){
        model.addAttribute("carro", new Carro());
        model.addAttribute("lstCarros", repoCar.findAll());
        return "consulta-carros";
    }

    @GetMapping("/consultas/empleados")
    public String cargarPagConsultaEmpleado(Model model){
        model.addAttribute("empleado", new Empleado());
        model.addAttribute("lstEmpleados", repoEm.findAll());
        return "consulta-empleados";
    }

    @GetMapping("/consultas/clientes")
    public String cargarPagConsultaCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("lstCliente", repoCli.findAll());
        return "consulta-clientes";
    }
    
    @GetMapping("/consultas/boletas")
    public String cargarPagConsultaBoleta(Model model){
    	List<Venta> ventas = repoVenta.findAll();
        Map<Integer, List<DetalleVenta>> detallesPorVenta = new HashMap<>();
        for (Venta venta : ventas) {
            List<DetalleVenta> detalles = repoDetalleVenta.findByVenta(venta);
            detallesPorVenta.put(venta.getId(), detalles);
        }

        model.addAttribute("ventas", ventas);
        model.addAttribute("detallesPorVenta", detallesPorVenta);
        return "consulta-boleta";
    }
}
