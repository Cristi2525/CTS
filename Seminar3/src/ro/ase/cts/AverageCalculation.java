package ro.ase.cts;

import ro.ase.cts.contracts.Calculation;

import java.util.List;

public class AverageCalculation implements Calculation<Double> {

    @Override
    public Double calculate(List<Integer> list) {
        if (list != null && list.size() > 0) {
            return list.stream().mapToInt(i -> i).average().getAsDouble();
        }
        return 0d;
    }
}
