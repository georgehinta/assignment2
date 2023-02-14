package org.example;

class EnchantedRoom extends RoomImpl {
    public EnchantedRoom(Spell s) {
        super();
        /* ... */
    }
    public String toString() {
        String result = "enchanted " + super.toString();
        //System.out.println(result);
        return result;
    }
}


