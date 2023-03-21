package modularclases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import javax.swing.JOptionPane;

public class AreaPrisma {

	public static void main(String[] args) {
		ArrayList<Prisma> listaPrisma = new ArrayList<Prisma>();
		final int numPrisma = 3;
		for(int i=0; i<numPrisma; i++) {
			insertList(listaPrisma);
		}
		imprimirValor(listaPrisma);
		listaPrisma.sort(Comparator.comparing(b -> b.areaTotal()));
		imprimirValor(listaPrisma);
	}

	private static void insertList(ArrayList<Prisma> listaPrisma) {
		Random ran =  new Random();
		int baseTriangulo=ran.nextInt(20);
		int alturaPrisma=ran.nextInt(20);
		listaPrisma.add(new Prisma(baseTriangulo,alturaPrisma));
	}
	
	
	public static void imprimirValor (ArrayList<Prisma> listaPrisma) {
		String output="";
		int deli=1;
		for(Prisma prisma: listaPrisma) {
			output+="Prisma"+deli+" de area "+prisma.areaTotal()+"\n";
			deli++;
		}
		JOptionPane.showMessageDialog(null, output);
	}
	

}
