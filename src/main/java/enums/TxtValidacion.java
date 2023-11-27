package enums;

public enum TxtValidacion{
    TXT_TEXTO("$1.219.300");
    private final String mensaje;
    TxtValidacion(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
