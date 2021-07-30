package controller;

import co.edu.unbosque.model.MascotaDTO;
import view.VistaConsola;

public class Controller {
    
    private VistaConsola vista;
    private MascotaDTO dto;
    
    public Controller(){
        vista = new VistaConsola();
        dto = new MascotaDTO();
        funcionar();
    }
    
    public void funcionar(){
        String nom = "";
        int e = 0;
        vista.mostrarInformacion(""+dto.getMascota_dao().agregarMascota("Luis", 12, dto.getVeterinaria()));
        vista.mostrarInformacion(""+dto.getMascota_dao().agregarMascota("Max", 2, dto.getVeterinaria()));
        vista.mostrarInformacion(""+dto.getMascota_dao().agregarMascota("Luis", 34, dto.getVeterinaria()));
        vista.mostrarInformacion(""+dto.getMascota_dao().agregarMascota("Veneno", 5, dto.getVeterinaria()));
        String rta = dto.getMascota_dao().mostrarListado(dto.getVeterinaria());
        vista.mostrarInformacion(rta);
        
        nom = vista.leerDatoString("Digite nombre: ");
        e = vista.leerDatoEntero("Digite edad: ");
        
        vista.mostrarInformacion(""+dto.getMascota_dao().agregarMascota(nom, e, dto.getVeterinaria()));
        rta = dto.getMascota_dao().mostrarListado(dto.getVeterinaria());
        vista.mostrarInformacion(rta);
        
        nom = vista.leerDatoString("Digite nombre a eliminar: ");
        vista.mostrarInformacion(""+dto.getMascota_dao().eliminarMascota(nom, dto.getVeterinaria()));
        
        rta = dto.getMascota_dao().mostrarListado(dto.getVeterinaria());
        vista.mostrarInformacion(rta);
    }
}
