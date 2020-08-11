package servicos;

public class Circulo implements Formas{
private Double raio;

public Circulo(Double raio) {
	this.raio = raio;
}

public Double getRaio() {
	return raio;
}

public void setRaio(Double raio) {
	this.raio = raio;
}

@Override
public double area() {
	return Math.PI  * Math.pow(raio, 2);
}



}
