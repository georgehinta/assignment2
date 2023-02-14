package org.example;
import org.apache.commons.lang3.StringUtils;
public class EnchantedMazeFactory extends MazeFactory {
    @Override
    public Maze create(String createSomething) {
        if (StringUtils.equalsIgnoreCase(createSomething, "enchantedRoom"))
            return new EnchantedRoom(new Spell());
        else if (StringUtils.equalsIgnoreCase(createSomething, "DoorNeedingSpell"))
            return new DoorNeedingSpell(new Spell());
        else
            return null;
    }
}