package co.edu.unbosque.model;

import java.util.ArrayList;

//CONTIENE EL ARREGLO DE OBJETOS
//CONTIENE EL OBJETO DAO
public class MascotaDTO {
    
    private ArrayList<Mascota> veterinaria;
    private MascotaDAO mascota_dao;
    
    public MascotaDTO(){
        veterinaria = new ArrayList<Mascota>();
        mascota_dao = new MascotaDAO();
    }

    public ArrayList<Mascota> getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(ArrayList<Mascota> veterinaria) {
        this.veterinaria = veterinaria;
    }

    public MascotaDAO getMascota_dao() {
        return mascota_dao;
    }

    public void setMascota_dao(MascotaDAO mascota_dao) {
        this.mascota_dao = mascota_dao;
    }
    
}
