package Ejercicio_3_Bien;

enum TipoDeGasto {
    CENA("Cena"), DESAYUNO("Desayuno"), ALQUILER_AUTO("Alquiler de autos");
    private String descripcion;

    // Constructor
    TipoDeGasto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter
    public String getDescripcion() {
        return descripcion;
    }


}
