package org.ms.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// Solving SpEL using @Value annotation
@Component
public class Demo {
    @Value("#{ 11+22 }")
    private int x;

    @Value("#{ 8>6? 55: 23}")
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Demo [x = "+ x + ", y = "+ y + ']';
    }
}
