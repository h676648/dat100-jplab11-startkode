package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try (PrintWriter skriver = new PrintWriter(new FileWriter(mappe + filnavn))) {
            skriver.print(samling.toString());
            return true;
        } catch (IOException e) {
            System.err.println("Feil ved skriving til fil: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Blogg samling = new Blogg();
        // Legg til innlegg i samlingen

        // Angi mappen og filnavnet du vil skrive til
        String mappe = "tekst/";
        String filnavn = "blogg.txt";

        // Kall skriv-metoden
        boolean skrevet = skriv(samling, mappe, filnavn);

        if (skrevet) {
            System.out.println("Data ble skrevet til filen.");
        } else {
            System.out.println("Feil ved skriving til fil.");
        }
    }
}
