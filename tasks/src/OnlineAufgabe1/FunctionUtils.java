package OnlineAufgabe1;

import java.util.ArrayList;
import java.util.List;

public class FunctionUtils {
    public static void printFunctionTable(Function function, int a, int b) {
        System.out.println("Printing function table for function" + function);
        for (; a <= b; a++) {
            System.out.println("Value for " + a + " is: " + function.evaluate(a));
        }
    }

    public static void printFunctionGraph(Function function, int a, int b) {
        System.out.println("Printing function graph for function" + function);
        for (; a <= b; a++) {
            int evaluate = (int) function.evaluate(a);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < evaluate; i++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append("o\n");
            System.out.print(stringBuilder.toString());
        }
    }

    public static List<Function> getNDerivates(Function function, int n) {
        List<Function> functions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            function = function.derivate();
            functions.add(function);
        }
        return functions;
    }
}
