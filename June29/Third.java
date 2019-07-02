import java.util.*;
class Third
{
	public static void main(String[] args)
	{
		int population = 80000;
		int men_population = population / 100 * 52;
		int total_literate = population / 100 * 48;
		int women_population = population - men_population;
		int total_literate_men = total_literate / 100 * 35;
		int total_literate_women = total_literate - total_literate_men;
		int total_illiterate_men = men_population - total_literate_men;
		int total_illiterate_women = women_population - total_literate_women;
		System.out.println("\n Total Illiterate Women : " + total_illiterate_women);
		System.out.println("\n Total Illiterate Men : " + total_illiterate_men);
	}
}