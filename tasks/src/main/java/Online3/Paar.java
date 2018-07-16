package Online3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Paar <S,T> {
    private final S firstData;
    private final T secondData;
}
