package org.example;

public class DoorNeedingSpell extends DoorImpl {
    public DoorNeedingSpell(Spell s) {
        super();
    }

    public String toString() {
        String result = "doorneedingspell " + super.toString();
        //System.out.println(result);
        return result;
    }
}
