package Ejercicio1;

public class Usuario {
    private String usuarioBase;
    private String usuarioIngresado;
    private int claveBase;
    private int claveIngresado;
    private String estadoDelSistema;

    public String validarEstado(){
        return estadoDelSistema;
    }
    public String permitirAcceso(){
        return usuarioBase;
    }

    // Creo los getter and setter
    public String getUsuarioBase() {
        return usuarioBase;
    }

    public void setUsuarioBase(String usuarioBase) {
        this.usuarioBase = usuarioBase;
    }

    public String getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    public int getClaveBase() {
        return claveBase;
    }

    public void setClaveBase(int claveBase) {
        this.claveBase = claveBase;
    }

    public int getClaveIngresado() {
        return claveIngresado;
    }

    public void setClaveIngresado(int claveIngresado) {
        this.claveIngresado = claveIngresado;
    }

    public String getEstadoDelSistema() {
        return estadoDelSistema;
    }

    public void setEstadoDelSistema(String estadoDelSistema) {
        this.estadoDelSistema = estadoDelSistema;
    }
}
