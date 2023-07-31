package categoria;

public class Categoria {

    private String nombre;
    private int consumoMinimo;
    private int consumoMaximo;
    private float cargoFijo;
    private float cargoVaribale;

    // SETTERS Y GETTERS
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getConsumoMinimo() { return consumoMinimo; }

    public void setConsumoMinimo(int consumoMinimo) { this.consumoMinimo = consumoMinimo; }

    public int getConsumoMaximo() { return consumoMaximo; }

    public void setConsumoMaximo(int consumoMaximo) { this.consumoMaximo = consumoMaximo; }

    public float getCargoFijo() { return cargoFijo; }

    public void setCargoFijo(float cargoFijo) { this.cargoFijo = cargoFijo; }

    public float getCargoVaribale() { return cargoVaribale; }

    public void setCargoVaribale(float cargoVaribale) { this.cargoVaribale = cargoVaribale; }
}
