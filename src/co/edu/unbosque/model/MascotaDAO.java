package co.edu.unbosque.model;

import java.util.ArrayList;

//ACCESO AL CRUD
public class MascotaDAO {
    
    public MascotaDAO(){
        
    }
    
    public boolean agregarMascota(String nombre, int edad, ArrayList <Mascota> veterinaria){
        Mascota nueva = new Mascota(nombre, edad);
        if(buscarMascota(nombre, veterinaria) == null){
            veterinaria.add(nueva);
            return true;
        }else{
            return false;
        }
    }
    
    public Mascota buscarMascota(String nombre, ArrayList <Mascota> veterinaria){
        Mascota encontrada = null;

        if(!veterinaria.isEmpty()){
            //for elemento in lista:
            for (Mascota mascota : veterinaria) {
                if(nombre.equals(mascota.getNombre())){
                    encontrada = mascota;
                }
            }
        }
        
        return encontrada;
    }
    
    public boolean eliminarMascota(String nombre, ArrayList <Mascota> veterinaria){
        Mascota m = buscarMascota(nombre, veterinaria);
        if( m == null){
            return false;
        }else{
            veterinaria.remove(m);
            return true;
        }
    }
    
    public String mostrarListado(ArrayList <Mascota> veterinaria){
        String listado = "";
        for (Mascota mascota : veterinaria) {
                listado = listado.concat(mascota.toString() + "\n");
        }
        return listado;
    }
    
}
