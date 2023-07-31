package dispositivo;

public class Caracteristicas {

    private String nombreGenerico;
    private String equipoConcreto;
    private boolean esInteligente;
    private boolean esDeBajoConsumo;
    private float consumoEnKWH;

    // SETTERS Y GETTERS

    public String getNombreGenerico() { return nombreGenerico; }

    public void setNombreGenerico(String nombreGenerico) { this.nombreGenerico = nombreGenerico; }

    public String getEquipoConcreto() { return equipoConcreto; }

    public void setEquipoConcreto(String equipoConcreto) { this.equipoConcreto = equipoConcreto; }

    public boolean isEsInteligente() { return esInteligente; }

    public void setEsInteligente(boolean esInteligente) { this.esInteligente = esInteligente; }

    public boolean isEsDeBajoConsumo() { return esDeBajoConsumo; }

    public void setEsDeBajoConsumo(boolean esDeBajoConsumo) { this.esDeBajoConsumo = esDeBajoConsumo; }

    public float getConsumoEnKWH() { return consumoEnKWH; }

    public void setConsumoEnKWH(float consumoEnKWH) { this.consumoEnKWH = consumoEnKWH; }
}
