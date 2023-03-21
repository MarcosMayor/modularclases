package modularclases;

/**
 * Clase prisma que hace las operaciones basicas
 * @author Marcos Mayor
 *
 */
public class Prisma {
	int baseTriangulo;
	int alturaPrisma;
	
	/**
	 * Metodo Constructor 
	 * @param baseTriangulo
	 * @param alturaPrisma
	 */
	public Prisma(int baseTriangulo, int alturaPrisma) {
		super();
		this.baseTriangulo = baseTriangulo;
		this.alturaPrisma = alturaPrisma;
	}
	
	/**
	 * Metodo que extrae el valor de la base del Triangulo
	 * @return Float del valor de la base del Triangulo
	 */
	
	public float getBaseTriangulo() {
		return baseTriangulo;
	}
	
	/**
	 * Metodo que inserta el valor de la base del Triangulo
	 * @param baseTriangulo
	 */
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}
	
	/**
	 * Metodo que extrae el valor de la altura del Prisma
	 * @return Float del valor de la altura del Prisma
	 */
	public float getAlturaPrisma() {
		return alturaPrisma;
	}
	
	/**
	 * Metodo que inserta el valor de la base del Prisma
	 * @param alturaPrisma
	 */
	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}
	
	/**
	 * Metodo que calcula la altura del triangulo
	 * @return (Math.sqrt(3)/2)*baseTriangulo
	 */
	public float alturaTriangulo () {
		return (float) ((Math.sqrt(3)/2)*baseTriangulo);
	}
	
	/**
	 * Metodo que calcula la area del triangulo base 
	 * @return baseTriangulo*alturaTriangulo()/2
	 */
	public float areaBase () {
		return (float) (baseTriangulo*alturaTriangulo()/2);
	}
	
	/**
	 * Metodo que calcula el perimetro del triangulo
	 * @return 3*baseTriangulo
	 */
	public float perimetro () {
		return (float) (3*baseTriangulo);
	}
	
	/**
	 * Metodo que calcula el area lateral del prisma
	 * @return perimetro()*alturaPrisma
	 */
	public float areaLateral () {
		return (float) (perimetro()*alturaPrisma);
	}
	
	/**
	 * Metodo que calcula el area total del prisma
	 * @return 2*areaBase() + areaLateral()
	 */
	public float areaTotal () {
		return (float) (2*areaBase() + areaLateral());
	}

	
}
