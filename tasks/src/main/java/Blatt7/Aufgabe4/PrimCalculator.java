package Blatt7.Aufgabe4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PrimCalculator implements Supplier<List<Integer>> {
    private final int start;
    private final int offset;
    private final int skip;
    private final int end;

    public PrimCalculator(int start, int offset, int skip, int end) {
        this.start = start;
        this.offset = offset;
        this.skip = skip;
        this.end = end;
    }

    @Override
    public List<Integer> get() {
        List<Integer> prims = new ArrayList<>();
        for (int i = start + offset; i <= end; i += skip) {
            if (isPrim(i)) {
                prims.add(i);
            }
        }
        return prims;
    }

    private boolean isPrim(int i) {
        for (int y = 2; y <= i / 2; y++) {
            if (i % y == 0) {
                return false;
            }
        }
        return true;
    }
}

