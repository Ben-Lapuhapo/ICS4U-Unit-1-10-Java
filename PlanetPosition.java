/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: March 2020
 * This program creates an enum of the Planets and displays their Position
 * from the sun
 *
 ****************************************************************************/

public enum PlanetPosition
{
    // Stores all the Planets, and the number of Planets between them and the sun
    Mercury(0),
    Venus(1),
    Earth(2),
    Mars(3),
    Jupiter(4),
    Saturn(5),
    Uranus(6),
    Neptune(7);

    private final int Position;
    private PlanetPosition(int Position)
    {
        this.Position = Position;
    }

    public static void main(String[] arg)
    {
        // Displays the Planets and their distance from sun
        for(PlanetPosition Planet: PlanetPosition.values())
        {
            System.out.println(Planet+" is " + Planet.Position + " Planet(s) away from the sun.");
        }
    }
}