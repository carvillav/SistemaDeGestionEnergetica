package usuario;

import categoria.Categoria;

import java.util.List;

public class Cliente extends Usuario{

    protected String tipoDocumento;
    protected String NumeroDocumento;
    private String numeroTelefono;
    private Categoria categoria;
    public List<String> dispositivos;


}
