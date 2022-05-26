/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aly
 */
public class MEquipo {
    private int id_equipo;
    private int id_cpu;
    private int id_mouse;  
    private int id_acsessextra;
    private int id_tecla;
    private int id_mon; 
    private int id_lab;

    public MEquipo(int id_equipo, int id_cpu, int id_mouse, int id_acsessextra, int id_tecla, int id_mon, int id_lab) {
        this.id_equipo = id_equipo;
        this.id_cpu = id_cpu;
        this.id_mouse = id_mouse;
        this.id_acsessextra = id_acsessextra;
        this.id_tecla = id_tecla;
        this.id_mon = id_mon;
        this.id_lab = id_lab;
    }
    
    

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_cpu() {
        return id_cpu;
    }

    public void setId_cpu(int id_cpu) {
        this.id_cpu = id_cpu;
    }

    public int getId_mouse() {
        return id_mouse;
    }

    public void setId_mouse(int id_mouse) {
        this.id_mouse = id_mouse;
    }

    public int getId_acsessextra() {
        return id_acsessextra;
    }

    public void setId_acsessextra(int id_acsessextra) {
        this.id_acsessextra = id_acsessextra;
    }

    public int getId_tecla() {
        return id_tecla;
    }

    public void setId_tecla(int id_tecla) {
        this.id_tecla = id_tecla;
    }

    public int getId_mon() {
        return id_mon;
    }

    public void setId_mon(int id_mon) {
        this.id_mon = id_mon;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }
    
    
}
