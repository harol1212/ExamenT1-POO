package institutoinnova.t1;

public class Alumno {

 
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String nivelSocioeconomico;
    private double tarifaBase;
    private String tipoBeca;
    private double pensionFinal;

   
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento.equalsIgnoreCase("DNI")
                || tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {

            this.tipoDocumento = tipoDocumento;

        } else {
            System.out.println("Tipo de documento incorrecto");
        }
    }

       public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {

        if (tipoDocumento.equalsIgnoreCase("DNI")) {

            if (numeroDocumento.length() == 8) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("El DNI debe tener 8 digitos");
            }

        } else if (tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {

            if (numeroDocumento.length() == 11) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println(
                        "La Residencia Temporal debe tener 11 digitos");
            }
        }
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(String nivelSocioeconomico) {

        if (nivelSocioeconomico.equalsIgnoreCase("A")
                || nivelSocioeconomico.equalsIgnoreCase("B")
                || nivelSocioeconomico.equalsIgnoreCase("C")) {

            this.nivelSocioeconomico = nivelSocioeconomico;

        } else {
            System.out.println("Nivel socioeconomico incorrecto");
        }
    }

 
    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {

        if (tarifaBase > 0) {
            this.tarifaBase = tarifaBase;
        } else {
            System.out.println("La tarifa debe ser mayor a 0");
        }
    }


    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {

        if (tipoBeca.equalsIgnoreCase("Sin Beca")
                || tipoBeca.equalsIgnoreCase("Parcial")
                || tipoBeca.equalsIgnoreCase("Total")) {

            this.tipoBeca = tipoBeca;

        } else {
            System.out.println("Tipo de beca incorrecto");
        }
    }


    public double getPensionFinal() {
        return pensionFinal;
    }


    public void calcularPension() {

        if (tipoBeca.equalsIgnoreCase("Parcial")) {

            pensionFinal = tarifaBase * 0.50;

        } else if (tipoBeca.equalsIgnoreCase("Total")) {

            pensionFinal = 0;

        } else {

            pensionFinal = tarifaBase;
        }
    }


    public void verAlumno() {

        System.out.println(
                "ALUMNO: " + nombre
                + " | TIPO DOCUMENTO: " + tipoDocumento
                + " | NUMERO DOCUMENTO: " + numeroDocumento
                + " | NIVEL: " + nivelSocioeconomico
                + " | TARIFA BASE: S/ " + tarifaBase
                + " | BECA: " + tipoBeca
                + " | PENSION FINAL: S/ " + pensionFinal
        );
    }
}
