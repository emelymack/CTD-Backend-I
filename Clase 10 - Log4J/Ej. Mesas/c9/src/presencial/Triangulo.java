package presencial;

import org.apache.log4j.Logger;

public class Triangulo {
    private String color;
    private int tamanio;
    private static final Logger logger=Logger.getLogger(Triangulo.class);
    public Triangulo(String color, int tamanio) {
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        logger.warn("Cuidado, alguien ha cambiando el tamaño del triangulo" +
                " color: "+getColor()+"\n" +
                "Esto provoca un cambio general y a modo de seguridad se registran" +
                " los valores de dicho cambio:\n" +
                "valor anterior:"+this.tamanio+"\n" +
                "valor nuevo:"+tamanio);
        this.tamanio = tamanio;
    }
}
