/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Controlador;
import java.util.List;
import Seguridad.Modelo.daoPerfil;
/**
 *
 * @author visitante
 */


public class clsCuentas {
    private int IdPerfil;
    private String NombrePerfil;
    private String EstatusPerfil;

    public clsCuentas() {
    }

    public clsCuentas(int IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    public clsCuentas(String NombrePerfil, String EstatusPerfil) {
        this.NombrePerfil = NombrePerfil;
        this.EstatusPerfil = EstatusPerfil;
    }

    public clsCuentas(int IdPerfil, String NombrePerfil, String EstatusPerfil) {
        this.IdPerfil = IdPerfil;
        this.NombrePerfil = NombrePerfil;
        this.EstatusPerfil = EstatusPerfil;
    }

    public int getIdPerfil() {
        return IdPerfil;
    }

    public void setIdPerfil(int IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    public String getNombrePerfil() {
        return NombrePerfil;
    }

    public void setNombrePerfil(String NombrePerfil) {
        this.NombrePerfil = NombrePerfil;
    }

    public String getEstatusPerfil() {
        return EstatusPerfil;
    }

    public void setEstatusPerfil(String EstatusPerfil) {
        this.EstatusPerfil = EstatusPerfil;
    }

    
    @Override
    public String toString() {
        return "clsPerfil{" + "IdPerfil=" + IdPerfil + ", NombrePerfi=" + NombrePerfil + ", EstatusPerfil=" + EstatusPerfil + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsCuentas getBuscarInformacionPerfilPorNombre(clsCuentas perfil)
    {
        daoPerfil daoperfil = new daoPerfil();
        return daoperfil.consultaPerfilPorNombre(perfil);
    }
    public clsCuentas getBuscarInformacionPerfilPorId(clsCuentas perfil)
    {
        daoPerfil daoperfil = new daoPerfil();
        return daoperfil.consultaPerfilPorId(perfil);
    }    
    public List<clsCuentas> getListadoPerfiles()
    {
        daoPerfil daoperfil = new daoPerfil();
        List<clsCuentas> listadoPerfiles = daoperfil.consultaPerfil();
        return listadoPerfiles;
    }
    public int setBorrarPerfil(clsCuentas perfil)
    {
        daoPerfil daoperfil = new daoPerfil();
        return daoperfil.borrarPerfil(perfil);
    }          
    public int setIngresarPerfil(clsCuentas perfil)
    {
        daoPerfil daoperfil = new daoPerfil();
        return daoperfil.ingresaPerfil(perfil);
    }              
    public int setModificarPerfil(clsCuentas perfil)
    {
        daoPerfil daoperfil = new daoPerfil();
        return daoperfil.actualizaPerfil(perfil);
    }              
}
