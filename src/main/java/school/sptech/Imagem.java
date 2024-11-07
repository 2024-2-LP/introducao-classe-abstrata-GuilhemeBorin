package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public Imagem() {}

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaDasAreas = 0.0;
        for (Figura figura : figuras) {
            somaDasAreas += figura.calcularArea();
        }
        return somaDasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> areasMaioresQueVinte = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                areasMaioresQueVinte.add(figura);
            }}
        return areasMaioresQueVinte;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> ApenasQuadrados = new ArrayList<>();
        for(Figura figura : figuras) {
            if (figura instanceof Quadrado)
                ApenasQuadrados.add(figura);
        }
        return ApenasQuadrados;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

}
