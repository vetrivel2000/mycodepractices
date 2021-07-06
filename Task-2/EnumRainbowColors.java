/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package rainbow;
enum RainbowColor
{
    Violet,Indigo,Blue,Green,Yellow,Orange,Red;
}
public class EnumRainbowColors {
    public void findColorCode()
    {
        RainbowColor array[]=RainbowColor.values();
        for(RainbowColor color:array)
        {
            System.out.println("Color code of "+color+" is "+(color.ordinal()+1));
        }
    }
}
