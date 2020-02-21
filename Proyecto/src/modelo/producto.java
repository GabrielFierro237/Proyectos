
package modelo;

public class producto {
    int ID_PRODUCTO;
    String NOMBRE_P;
    int PRECIO_P;
    String DESCRIPCION_P;
    int CANTIDAD_P;

    public String getDESCRIPCION_P() {
        return DESCRIPCION_P;
    }

    public void setDESCRIPCION_P(String DESCRIPCION_P) {
        this.DESCRIPCION_P = DESCRIPCION_P;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getNOMBRE_P() {
        return NOMBRE_P;
    }

    public void setNOMBRE_P(String NOMBRE_P) {
        this.NOMBRE_P = NOMBRE_P;
    }

    public int getPRECIO_P() {
        return PRECIO_P;
    }

    public void setPRECIO_P(int PRECIO_P) {
        this.PRECIO_P = PRECIO_P;
    }

    public int getCANTIDAD_P() {
        return CANTIDAD_P;
    }

    public void setCANTIDAD_P(int CANTIDAD_P) {
        this.CANTIDAD_P = CANTIDAD_P;
    }

    public producto() {
    }
}
