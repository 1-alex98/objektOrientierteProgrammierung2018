package Blatt7.Aufgabe1;

import lombok.Data;

@Data
public class DoubleNode {
    private DoubleNode next;
    private Double data;

    public DoubleNode(Double data) {
        this.data = data;
    }
}
