package ro.ase.cts;

import ro.ase.cts.contracts.Calculation;
import ro.ase.cts.contracts.ValuesReader;
import ro.ase.cts.orchestrators.Orchestrator;

public class Main {

    public static void main(String[] args) {
        try {
            ValuesReader reader = new ConsoleReader();
            Calculation calculation = (Calculation) Class.forName("ro.ase.cts.SumCalculation").getDeclaredConstructor().newInstance();
            Orchestrator orchestrator = new Orchestrator(reader, calculation);
            orchestrator.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
