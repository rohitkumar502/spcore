package org.ms.staticInvoke_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
 class Test2 {
//    @Value("true")
    @Value("#{ 8>3 }")
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String toString() {
        return "Test2 [ isActive = " + isActive +  ']';
    }

}
