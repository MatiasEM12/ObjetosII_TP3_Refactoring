package ejercicio_1;


public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        validarCopia(copia);
        validarDiasAlquilados(diasAlquilados);

        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }

    public CopiaLibro copia() {
        return this.copia;
    }

    public double calcularMonto(){

        return this.copia.calcular(this.diasAlquilados);
    }

    public int obtenerBonusNuevoLanzamiento(){
        return this.copia.obtenerBonus(this.diasAlquilados);
    }
    public int obtenerBonusRegular(){
        return this.copia.obtenerBonus(this.diasAlquilados);
    }

    public int obtenerBonusInfantil(){
        return this.copia.obtenerBonus(this.diasAlquilados);
    }




    //validaciones

    private void validarCopia(CopiaLibro copia) {
        if (copia == null) {
            throw new IllegalArgumentException("La copia del libro no puede ser nula.");
        }
    }

    private void validarDiasAlquilados(int diasAlquilados){
        if(diasAlquilados <= 0){
            throw new IllegalArgumentException("Los días alquilados deben ser mayores a cero.");
        }
    }
}