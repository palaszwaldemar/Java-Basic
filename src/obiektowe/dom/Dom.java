package obiektowe.dom;

import java.util.Arrays;

public class Dom {
    private final Pokoj[] pokoje;

    public Dom(Pokoj[] pokoje) {
        this.pokoje = pokoje;
    }

    //posprzataj dom

    @Override
    public String toString() {
        return "Dom{" +
                "pokoje=" + Arrays.toString(pokoje) +
                '}';
    }
}
