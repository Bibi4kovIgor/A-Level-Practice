package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Calculation {
    private int x;
    private int y;

    public int calculate(String sign) {
        return sign.equals("+") ? x + y : x - y;
    }
}
