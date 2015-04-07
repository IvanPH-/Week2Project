package week2Problems;

import java.util.Collection;
import java.util.HashSet;

import week2Problems.Products.Category;

public class Stock {
	protected static HashSet<Products> createStock() {
		HashSet<Products> toReturn = new HashSet<>();
		Products A001 = new Products("Datrex 2400 Calorie Food Bar", 5.90, 173);
		A001.category = Category.FOOD;
		Products A002 = new Products("Datrex 3600 Calorie Food Bar", 7.94, 201);
		A002.category = Category.FOOD;
		Products A003 = new Products("Mainstay 1200-Calorie Food Bars - Case of 30", 162.91, 50);
		A003.category = Category.FOOD;
		Products A004 = new Products("EasyPrep Lasagna - Pouch", 9.95, 180);
		A004.category = Category.FOOD;
		Products A005 = new Products("Saratoga Farms Freeze Dried Sharp Cheddar Cheese", 49.94, 190);
		A005.category = Category.FOOD;
		Products A006 = new Products("MRE Full Meal (3)", 31.49, 76);
		A006.category = Category.FOOD;
		Products A007 = new Products("12-in-1 Stainless Steel Swiss-Style Pocket Knife", 3.94, 87);
		A007.category = Category.TOOLS;
		Products A008 = new Products("Heavy Duty Swing-A-Way Can Opener", 12.55, 12);
		A008.category = Category.TOOLS;
		Products A009 = new Products("Compact Folding Shovel", 12.86, 175);
		A009.category = Category.TOOLS;
		Products A010 = new Products("'11' Hunting Knife with Fire Starter", 12.95, 143);
		A010.category = Category.TOOLS;
		Products A011 = new Products("Multi-Functional Camping Tool 7-in-1", 6.99, 15);
		A011.category = Category.TOOLS;
		Products A012 = new Products("Black 550 Paracord - 100 Ft", 11.44, 56);
		A012.category = Category.TOOLS;
		Products A013 = new Products("Bung Wrench", 8.90, 99);
		A013.category = Category.TOOLS;
		Products A014 = new Products("Tow Rope", 20.95, 11);
		A014.category = Category.TOOLS;
		Products A015 = new Products("IOSAT - Radiation Protection Tablets", 20.94, 154);
		A015.category = Category.MEDICAL;
		Products A016 = new Products("N95 Vented Particulate Respirator - CASE of 10", 36.21, 45);
		A016.category = Category.MEDICAL;
		Products A017 = new Products("299-Piece First Aid Kit - SOFT CASE", 25.15, 34);
		A017.category = Category.MEDICAL;
		Products A018 = new Products("Deluxe First Responder FirstAid Kit - SOFT CASE", 164.31, 23);
		A018.category = Category.MEDICAL;
		Products A019 = new Products("Ultimate First Responder Burn Pack", 16.26, 67);
		A019.category = Category.MEDICAL;
		Products A020 = new Products("Ambu Res-cue CPR Mask Kit", 24.94, 54);
		A020.category = Category.MEDICAL;
		Products A021 = new Products("Dust Masks - PACK of 5", 1.99, 189);
		A021.category = Category.MEDICAL;
		Products A022 = new Products("Insulated Aluminum Coated Tube Tent", 21.95, 12);
		A022.category = Category.SHELTER;
		Products A023 = new Products("Wool Blend Survival Blanket - 2 lb", 15.94, 98);
		A023.category = Category.SHELTER;
		Products A024 = new Products("Emergency Sleeping Bag", 8.94, 59);
		A024.category = Category.SHELTER;
		Products A025 = new Products("SlumberJack latitude 0°F Sleeping Bag - Regular", 74.95, 43);
		A025.category = Category.SHELTER;
		Products A026 = new Products("Emergency Poncho - ADULT", 2.05, 400);
		A026.category = Category.CLOTHING;
		Products A027 = new Products("EasyPrep EasyFire", 74.95, 34);
		A027.category = Category.COOKING;
		Products A028 = new Products("UST Sparkle Fire Starter", 11.54, 57);
		A028.category = Category.COOKING;
		Products A029 = new Products("MRE Flameless Heater - CASE of 24", 46.80, 125);
		A029.category = Category.COOKING;
		Products A030 = new Products("Cube Stove", 24.99, 54);
		A030.category = Category.COOKING;
		Products A031 = new Products("UST WetFire Fire Starting Tinder - 12 pack", 15.21, 65);
		A031.category = Category.COOKING;
		Products A032 = new Products("Ultimate 72 Hour Kit", 99.95, 12);
		A032.category = Category.SURVIVAL;
		Products A033 = new Products("Minuteman IV Person Emergency Kit", 784.94, 5);
		A033.category = Category.SURVIVAL;
		Products A034 = new Products("Outfitter II Person Wilderness Survival Kit", 3176.52, 3);
		A034.category = Category.SURVIVAL;
		Products A035 = new Products("Flushable Loo 400 Toilet", 112.3, 34);
		A035.category = Category.HYGIENE;
		Products A036 = new Products("Portable Potty Lid", 19.94, 76);
		A036.category = Category.HYGIENE;
		Products A037 = new Products("Portable Potty Chemicals", 2.05, 234);
		A037.category = Category.HYGIENE;
		Products A038 = new Products("Solar Heating Shower", 14.45, 19);
		A038.category = Category.HYGIENE;
		Products A039 = new Products("Goal Zero Yeti 400 Solar Generator", 499.94, 15);
		A039.category = Category.EMERGENCY;
		Products A040 = new Products("Boulder 30 Solar Ponel", 239.94, 8);
		A040.category = Category.EMERGENCY;
		Products A041 = new Products("Goal Zero Switch 8 Recharger", 49.94, 23);
		A041.category = Category.EMERGENCY;
		Products A042 = new Products("Dynamo Solar Powered Survival Radio", 79.94, 23);
		A042.category = Category.COMMUNICATION;
		Products A043 = new Products("100-Hour ReadyCandle", 10.99, 58);
		A043.category = Category.COMMUNICATION;
		Products A044 = new Products("Dynamo Radio with LED Flashlight & Cell Phone Charger", 22.95, 87);
		A044.category = Category.COMMUNICATION;
		Products A045 = new Products("12-Hour LightStick | 20 Pack", 40.95, 95);
		A045.category = Category.COMMUNICATION;
		Products A046 = new Products("LED Tactical Flashlight - 80 Lumen", 29.35, 76);
		A046.category = Category.COMMUNICATION;
		Products A047 = new Products("BASIC Backpack", 19.95, 154);
		A047.category = Category.BACKPACKS;
		Products A048 = new Products("ULTIMATE Backpack", 51.96, 34);
		A048.category = Category.BACKPACKS;
		Products A049 = new Products("Kelty Redstart 28 Backpack - Black", 69.95, 25);
		A049.category = Category.BACKPACKS;
		Products A050 = new Products("Jetflow Tomahawk Hydration Pack", 37.45, 65);
		A050.category = Category.BACKPACKS;
		toReturn.add(A001);
		toReturn.add(A002);
		toReturn.add(A003);
		toReturn.add(A004);
		toReturn.add(A005);
		toReturn.add(A006);
		toReturn.add(A007);
		toReturn.add(A008);
		toReturn.add(A009);
		toReturn.add(A010);
		toReturn.add(A011);
		toReturn.add(A012);
		toReturn.add(A013);
		toReturn.add(A014);
		toReturn.add(A015);
		toReturn.add(A016);
		toReturn.add(A017);
		toReturn.add(A018);
		toReturn.add(A019);
		toReturn.add(A020);
		return toReturn;
	}
	
//	protected static void getType(Category x) {
//		switch(x) {
//		case FOOD:
//			System.out.println(s.FOOD);
//			break;
//		case TOOLS:
//			System.out.println(category.TOOLS);
//			break;
//		case MEDICAL:
//			System.out.println(category.MEDICAL);
//			break;
//		default:
//			System.out.println("Please input a valid category");
//		}
}
