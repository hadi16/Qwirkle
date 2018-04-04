package edu.up.cs301.qwirkle.tile;

/**
 * Enum: QAnimal
 *
 * @author Alex Hadi
 * @author Stephanie Camacho
 * @author Michael Quach
 * @author Huy Nguyen
 * @version April 3, 2018
 */
public enum QAnimal {
    bat, dog, fox, owl, parrot, snake;

    public char shortName() {
        return this.toString().charAt(0);
    }

    public String longName() {
        String s = this.toString();
        return s.substring(0,1)+s.substring(1);
    }
}
