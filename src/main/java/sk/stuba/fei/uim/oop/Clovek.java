package sk.stuba.fei.uim.oop;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clovek {
    private String meno;
    private String adresa;
    private double vyska;
    private double waha;
    private int vek;
    private List<Clovek> kamarati;
}
