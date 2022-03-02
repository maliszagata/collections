package pl.edu.agh.mwo.java1;

import java.util.ArrayList;
import java.util.List;

public class NewArrayList<E> extends ArrayList<E> implements List<E> {

    public String toString() {

        StringBuilder sb = new StringBuilder();
        String type = this.get(0).getClass().getSimpleName();
        sb.append("Lista przechowuje dane typu ").append(type).append("\n");
        sb.append("Elementy listy: \n");

        for (int i = 0; i < this.size(); i++) {
            sb.append("index=");
            sb.append(i);
            sb.append(" wartość=");
            sb.append(this.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean remove(Object o) {

        if (o == null) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if (o.equals(this.get(i))) {
                this.set(i, null);
                return true;
            }
        }

        return false;
    }

}
