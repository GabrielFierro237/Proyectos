
package modelo;

public class factura {
    int ID_PERSONA;
    int ID_PRODUCTO;
    String NOMBRES;
    int TELEFONO;
    String DIRECCION;
    String NOMBRE_P;
    int PRECIO_P;
    int CANTIDAD_P;
    int TOTAL;

    public factura() {
    }

    public int getID_PERSONA() {
        return ID_PERSONA;
    }

    public void setID_PERSONA(int ID_PERSONA) {
        this.ID_PERSONA = ID_PERSONA;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
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

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int TOTAL) {
        this.TOTAL = TOTAL;
    }
}
