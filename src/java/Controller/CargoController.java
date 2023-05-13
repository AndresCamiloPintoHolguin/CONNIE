/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Cargo;
import Services.CargoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "cargoController")
@SessionScoped
public class CargoController implements Serializable {

    @EJB
    private CargoFacade cargoFacade;

    private Cargo cargo = new Cargo();

    public CargoController() {
    }
    
    public List<Cargo> getAllCargos(){
        return cargoFacade.findAll();
    }
    
    public void crearCargo(){
        cargoFacade.create(cargo);
    }
    
    public void editarCargo(){
        cargoFacade.edit(cargo);
    }
    
    public void mostrarCargo(Cargo cargo){
        this.cargo.setIdCargo(cargo.getIdCargo());
        this.cargo.setNombreCargo(cargo.getNombreCargo());
        
    }    

    public void eliminarCargo(Cargo cargo){
        cargoFacade.remove(cargo);
    }
    /**
     * @return the cargofacade
     */
    public CargoFacade getCargofacade() {
        return cargoFacade;
    }

    /**
     * @param cargofacade the cargofacade to set
     */
    public void setCargoFacade(CargoFacade cargofacade) {
        this.cargoFacade = cargofacade;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
