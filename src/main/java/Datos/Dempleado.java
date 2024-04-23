
package Datos;


public class Dempleado extends Dpersona {

    public String acceso;
    public String login;
    public String password;
    public String estado;
    public String eps;
    public String arl;

    public Dempleado() {
    }

    public Dempleado(String acceso, String login, String password, String estado, String eps, String arl) {
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado; 
        this.eps = eps;
        this.arl = arl;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

   

}
