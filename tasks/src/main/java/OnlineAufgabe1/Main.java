package OnlineAufgabe1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Function function = new EFunction(0.25, 1.75);
        List<Function> functions = FunctionUtils.getNDerivates(function, 2);
        functions.add(function);
        functions.forEach(function1 -> {
            FunctionUtils.printFunctionGraph(function1, 0, 3);
            FunctionUtils.printFunctionTable(function1, 0, 3);
        });
    }
}
