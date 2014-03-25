package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program {
	
	public static void main(String[] args) {
		boolean eof = true;
		int points = 0;
		String input = null, input2 = null;
		
		System.out.println("Irregular Verbs Trainer v0.1.1\n");
		System.out.println("Hier wird dir nacheinander die erste Zeitform eines Wortes angezeigt \n"
				+ "und du musst die 2. und 3. Form per Hand eingeben!\n");
		System.out.println("ACHTUNG: Du musst auch auf die richtige Recht-, Groß- \n"
				+ "und Kleinschreibung achten\n");
		System.out.println("Sollte es mehr Schreibweisen geben, ist immer die mit der Endung -ed gemeint!\n");
		System.out.println("Los gehts!!");
		
		//laufe solange bis eof auf true gesetzt wird..
		while (eof == true)
		{
			
			// generiere Zufallszahl
			
			int random = RandomNumber.createNewDigit(1, 92);
			// Erstelle Objekt mit der erstellen Zufallszahl
			IrregularVerbs irrVerbs = new IrregularVerbs(random);
			// Gib Infintiv aus
			System.out.println(irrVerbs.infinitiv);
			
			//erfrage past Simple;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			try {
				input = in.readLine();
			} catch (IOException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
			//erfrage past Participate
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
			try {
				input2 = in.readLine();
			} catch (IOException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
			
			
			//Vergleiche Eingabe mit Gepeicherten Daten
			
			//Wenn richtig, ein Pluspunkt
			if (irrVerbs.pastSimple.equals(input) && irrVerbs.pastParticipate.equals(input2)){
				System.out.println("richtig!");
				points++;
				
			} else {
				// ansonsten ein Minuspunkt!
				System.out.println("Leider falsch!");
				System.out.println("Die richtigen Antworten wären: " + irrVerbs.pastSimple + " und " 
				+ irrVerbs.pastParticipate + " gewesen!");
				points--;
			} 
			
		System.out.println("Aktueller Punktestand: " + points);
			
		}

	}

}
