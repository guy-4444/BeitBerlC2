package WorldGame;

import java.util.ArrayList;
import java.util.HashMap;

public class DataManager {

    private static String[] CONTINENTS = new String[] {
            "Africa",
            "Antarctica",
            "Asia",
            "Europe",
            "North America",
            "Oceania",
            "South America",
    };

    public static Country[] generateCountriesData() {
        Country[] countries = new Country[5];

        return countries;
    }

    public static ArrayList<Country> generateCountriesDataArrayList() {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("United States", "North America", "Washington, D.C.", 9_525_067, 331_000_000, false, 0.76, "$", "US Dollar"));
        countries.add(new Country("India", "Asia", "New Delhi", 3_287_263, 1_420_000_000, false, 0.68, "₹", "Indian Rupee"));
        countries.add(new Country("Brazil", "South America", "Brasília", 8_515_767, 216_000_000, false, 0.72, "R$", "Brazilian Real"));
        countries.add(new Country("Germany", "Europe", "Berlin", 357_022, 84_000_000, false, 0.79, "€", "Euro"));
        countries.add(new Country("Canada", "North America", "Ottawa", 9_984_670, 39_000_000, false, 0.79, "$", "Canadian Dollar"));
        countries.add(new Country("Nigeria", "Africa", "Abuja", 923_768, 220_000_000, false, 0.56, "₦", "Naira"));
        countries.add(new Country("Australia", "Oceania", "Canberra", 7_692_024, 26_000_000, true, 0.81, "$", "Australian Dollar"));
        countries.add(new Country("China", "Asia", "Beijing", 9_596_961, 1_410_000_000, false, 0.71, "¥", "Yuan"));
        countries.add(new Country("France", "Europe", "Paris", 551_695, 68_000_000, false, 0.80, "€", "Euro"));
        countries.add(new Country("Japan", "Asia", "Tokyo", 377_975, 124_000_000, true, 0.85, "¥", "Yen"));
        countries.add(new Country("South Africa", "Africa", "Pretoria", 1_221_037, 61_000_000, false, 0.61, "R", "Rand"));
        countries.add(new Country("Mexico", "North America", "Mexico City", 1_964_375, 129_000_000, false, 0.68, "$", "Mexican Peso"));
        countries.add(new Country("Egypt", "Africa", "Cairo", 1_010_408, 112_000_000, false, 0.56, "E£", "Egyptian Pound"));
        countries.add(new Country("Argentina", "South America", "Buenos Aires", 2_780_400, 46_000_000, false, 0.75, "$", "Argentine Peso"));
        countries.add(new Country("United Kingdom", "Europe", "London", 243_610, 68_000_000, false, 0.80, "£", "Pound Sterling"));
        countries.add(new Country("Russia", "Europe/Asia", "Moscow", 17_098_242, 143_000_000, false, 0.73, "₽", "Russian Ruble"));
        countries.add(new Country("Italy", "Europe", "Rome", 301_340, 59_000_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("South Korea", "Asia", "Seoul", 100_210, 51_000_000, false, 0.83, "₩", "South Korean Won"));
        countries.add(new Country("Spain", "Europe", "Madrid", 505_992, 47_000_000, false, 0.79, "€", "Euro"));
        countries.add(new Country("Vietnam", "Asia", "Hanoi", 331_212, 100_000_000, false, 0.69, "₫", "Vietnamese Dong"));
        countries.add(new Country("Israel", "Asia", "Jerusalem", 20_770, 9_800_000, false, 0.76, "₪", "Israeli New Shekel"));
        countries.add(new Country("Ukraine", "Europe", "Kyiv", 603_628, 35_000_000, false, 0.66, "₴", "Ukrainian Hryvnia"));
        countries.add(new Country("Turkey", "Asia/Europe", "Ankara", 783_562, 88_000_000, false, 0.73, "₺", "Turkish Lira"));
        countries.add(new Country("Bangladesh", "Asia", "Dhaka", 147_570, 169_000_000, false, 0.65, "৳", "Bangladeshi Taka"));
        countries.add(new Country("Indonesia", "Asia", "Jakarta", 1_904_569, 277_000_000, false, 0.66, "Rp", "Indonesian Rupiah"));
        countries.add(new Country("Philippines", "Asia", "Manila", 300_000, 114_000_000, true, 0.67, "₱", "Philippine Peso"));
        countries.add(new Country("Pakistan", "Asia", "Islamabad", 881_913, 235_000_000, false, 0.64, "₨", "Pakistani Rupee"));
        countries.add(new Country("Thailand", "Asia", "Bangkok", 513_120, 70_000_000, false, 0.76, "฿", "Baht"));
        countries.add(new Country("Afghanistan", "Asia", "Kabul", 652_230, 40_000_000, false, 0.55, "؋", "Afghani"));
        countries.add(new Country("Albania", "Europe", "Tirana", 28_748, 2_800_000, false, 0.70, "Lek", "Albanian Lek"));
        countries.add(new Country("Algeria", "Africa", "Algiers", 2_381_741, 45_000_000, false, 0.60, "دج", "Algerian Dinar"));
        countries.add(new Country("Andorra", "Europe", "Andorra la Vella", 468, 77_000, false, 0.77, "€", "Euro"));
        countries.add(new Country("Angola", "Africa", "Luanda", 1_246_700, 35_000_000, false, 0.53, "Kz", "Kwanza"));
        countries.add(new Country("Antigua and Barbuda", "North America", "St. John's", 442, 98_000, true, 0.75, "$", "East Caribbean Dollar"));
        countries.add(new Country("Armenia", "Asia", "Yerevan", 29_743, 3_000_000, false, 0.66, "֏", "Armenian Dram"));
        countries.add(new Country("Austria", "Europe", "Vienna", 83_879, 9_000_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("Azerbaijan", "Asia", "Baku", 86_600, 10_000_000, false, 0.67, "₼", "Azerbaijani Manat"));
        countries.add(new Country("Bahamas", "North America", "Nassau", 13_943, 400_000, true, 0.78, "$", "Bahamian Dollar"));
        countries.add(new Country("Bahrain", "Asia", "Manama", 760, 1_700_000, true, 0.78, "ب.د", "Bahraini Dinar"));
        countries.add(new Country("Barbados", "North America", "Bridgetown", 430, 287_000, true, 0.77, "$", "Barbadian Dollar"));
        countries.add(new Country("Belarus", "Europe", "Minsk", 207_600, 9_400_000, false, 0.71, "Br", "Belarusian Ruble"));
        countries.add(new Country("Belgium", "Europe", "Brussels", 30_528, 11_500_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("Belize", "North America", "Belmopan", 22_966, 400_000, false, 0.65, "$", "Belize Dollar"));
        countries.add(new Country("Benin", "Africa", "Porto-Novo", 112_622, 13_000_000, false, 0.56, "CFA", "West African CFA Franc"));
        countries.add(new Country("Bhutan", "Asia", "Thimphu", 38_394, 770_000, false, 0.64, "Nu.", "Bhutanese Ngultrum"));
        countries.add(new Country("Bolivia", "South America", "Sucre", 1_098_581, 12_000_000, false, 0.68, "Bs.", "Bolivian Boliviano"));
        countries.add(new Country("Bosnia and Herzegovina", "Europe", "Sarajevo", 51_197, 3_200_000, false, 0.69, "KM", "Convertible Mark"));
        countries.add(new Country("Botswana", "Africa", "Gaborone", 581_730, 2_400_000, false, 0.60, "P", "Botswana Pula"));
        countries.add(new Country("Brunei", "Asia", "Bandar Seri Begawan", 5_765, 450_000, true, 0.77, "$", "Brunei Dollar"));
        countries.add(new Country("Bulgaria", "Europe", "Sofia", 110_879, 6_800_000, false, 0.75, "лв", "Bulgarian Lev"));
        countries.add(new Country("Burkina Faso", "Africa", "Ouagadougou", 272_967, 22_000_000, false, 0.53, "CFA", "West African CFA Franc"));
        countries.add(new Country("Burundi", "Africa", "Gitega", 27_834, 13_000_000, false, 0.53, "FBu", "Burundian Franc"));
        countries.add(new Country("Cambodia", "Asia", "Phnom Penh", 181_035, 17_000_000, false, 0.65, "៛", "Cambodian Riel"));
        countries.add(new Country("Cameroon", "Africa", "Yaoundé", 475_442, 28_000_000, false, 0.57, "CFA", "Central African CFA Franc"));
        countries.add(new Country("Cape Verde", "Africa", "Praia", 4_033, 550_000, true, 0.72, "Escudo", "Cape Verdean Escudo"));
        countries.add(new Country("Central African Republic", "Africa", "Bangui", 622_984, 5_000_000, false, 0.52, "CFA", "Central African CFA Franc"));
        countries.add(new Country("Chad", "Africa", "N'Djamena", 1_284_000, 17_000_000, false, 0.54, "CFA", "Central African CFA Franc"));
        countries.add(new Country("Chile", "South America", "Santiago", 756_102, 20_000_000, false, 0.74, "$", "Chilean Peso"));
        countries.add(new Country("Colombia", "South America", "Bogotá", 1_141_748, 52_000_000, false, 0.68, "$", "Colombian Peso"));
        countries.add(new Country("Comoros", "Africa", "Moroni", 2_235, 900_000, true, 0.55, "KMF", "Comorian Franc"));
        countries.add(new Country("Congo (Congo-Brazzaville)", "Africa", "Brazzaville", 342_000, 6_000_000, false, 0.59, "CFA", "Central African CFA Franc"));
        countries.add(new Country("Costa Rica", "North America", "San José", 51_100, 5_200_000, false, 0.73, "₡", "Costa Rican Colón"));
        countries.add(new Country("Croatia", "Europe", "Zagreb", 56_594, 4_000_000, false, 0.77, "HRK", "Croatian Kuna"));
        countries.add(new Country("Cuba", "North America", "Havana", 109_884, 11_500_000, true, 0.68, "$", "Cuban Peso"));
        countries.add(new Country("Cyprus", "Asia", "Nicosia", 9_251, 1_300_000, true, 0.78, "€", "Euro"));
        countries.add(new Country("Czechia (Czech Republic)", "Europe", "Prague", 78_871, 10_500_000, false, 0.77, "Kč", "Czech Koruna"));
        countries.add(new Country("Denmark", "Europe", "Copenhagen", 42_933, 6_000_000, false, 0.78, "kr", "Danish Krone"));
        countries.add(new Country("Djibouti", "Africa", "Djibouti", 23_200, 1_100_000, false, 0.57, "Fdj", "Djiboutian Franc"));
        countries.add(new Country("Dominica", "North America", "Roseau", 750, 72_000, true, 0.74, "$", "East Caribbean Dollar"));
        countries.add(new Country("Dominican Republic", "North America", "Santo Domingo", 48_671, 11_000_000, true, 0.66, "$", "Dominican Peso"));
        countries.add(new Country("Ecuador", "South America", "Quito", 283_561, 18_000_000, false, 0.70, "$", "United States Dollar"));
        countries.add(new Country("El Salvador", "North America", "San Salvador", 21_041, 6_600_000, false, 0.65, "$", "United States Dollar"));
        countries.add(new Country("Equatorial Guinea", "Africa", "Malabo", 28_051, 1_500_000, true, 0.58, "CFA", "Central African CFA Franc"));
        countries.add(new Country("Eritrea", "Africa", "Asmara", 117_600, 6_500_000, false, 0.50, "Nkf", "Eritrean Nakfa"));
        countries.add(new Country("Estonia", "Europe", "Tallinn", 45_228, 1_400_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("Eswatini", "Africa", "Mbabane", 17_364, 1_200_000, false, 0.57, "L", "Swazi Lilangeni"));
        countries.add(new Country("Ethiopia", "Africa", "Addis Ababa", 1_104_300, 123_000_000, false, 0.52, "Br", "Ethiopian Birr"));
        countries.add(new Country("Fiji", "Oceania", "Suva", 18_274, 920_000, true, 0.65, "$", "Fijian Dollar"));
        countries.add(new Country("Finland", "Europe", "Helsinki", 338_145, 5_600_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("Gabon", "Africa", "Libreville", 267_668, 2_400_000, false, 0.59, "CFA", "Central African CFA Franc"));
        countries.add(new Country("Gambia", "Africa", "Banjul", 11_295, 2_600_000, false, 0.54, "D", "Gambian Dalasi"));
        countries.add(new Country("Georgia", "Asia", "Tbilisi", 69_700, 3_800_000, false, 0.65, "₾", "Georgian Lari"));
        countries.add(new Country("Ghana", "Africa", "Accra", 238_533, 32_000_000, false, 0.56, "₵", "Ghanaian Cedi"));
        countries.add(new Country("Greece", "Europe", "Athens", 131_957, 10_500_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("Grenada", "North America", "St. George's", 344, 112_000, true, 0.73, "$", "East Caribbean Dollar"));
        countries.add(new Country("Guatemala", "North America", "Guatemala City", 108_889, 18_000_000, false, 0.64, "Q", "Guatemalan Quetzal"));
        countries.add(new Country("Guinea", "Africa", "Conakry", 245_857, 14_000_000, false, 0.53, "FG", "Guinean Franc"));
        countries.add(new Country("Guinea-Bissau", "Africa", "Bissau", 36_125, 2_200_000, false, 0.52, "CFA", "West African CFA Franc"));
        countries.add(new Country("Guyana", "South America", "Georgetown", 214_969, 800_000, false, 0.65, "$", "Guyanese Dollar"));
        countries.add(new Country("Haiti", "North America", "Port-au-Prince", 27_750, 12_000_000, true, 0.53, "G", "Haitian Gourde"));
        countries.add(new Country("Honduras", "North America", "Tegucigalpa", 112_492, 10_000_000, false, 0.62, "L", "Honduran Lempira"));
        countries.add(new Country("Hungary", "Europe", "Budapest", 93_028, 9_600_000, false, 0.76, "Ft", "Hungarian Forint"));
        countries.add(new Country("Iceland", "Europe", "Reykjavik", 103_000, 370_000, true, 0.80, "kr", "Icelandic Krona"));
        countries.add(new Country("Indonesia", "Asia", "Jakarta", 1_904_569, 277_000_000, false, 0.66, "Rp", "Indonesian Rupiah"));
        countries.add(new Country("Iran", "Asia", "Tehran", 1_648_195, 88_000_000, false, 0.64, "﷼", "Iranian Rial"));
        countries.add(new Country("Iraq", "Asia", "Baghdad", 437_072, 43_000_000, false, 0.61, "ع.د", "Iraqi Dinar"));
        countries.add(new Country("Ireland", "Europe", "Dublin", 70_273, 5_000_000, true, 0.77, "€", "Euro"));
        countries.add(new Country("Israel", "Asia", "Jerusalem", 20_770, 9_800_000, false, 0.76, "₪", "Israeli New Shekel"));
        countries.add(new Country("Jamaica", "North America", "Kingston", 10_991, 3_000_000, true, 0.72, "$", "Jamaican Dollar"));
        countries.add(new Country("Jordan", "Asia", "Amman", 89_342, 11_000_000, false, 0.63, "د.ا", "Jordanian Dinar"));
        countries.add(new Country("Kazakhstan", "Asia", "Nur-Sultan", 2_724_900, 19_000_000, false, 0.66, "₸", "Kazakhstani Tenge"));
        countries.add(new Country("Kenya", "Africa", "Nairobi", 580_367, 57_000_000, false, 0.57, "Ksh", "Kenyan Shilling"));
        countries.add(new Country("Kiribati", "Oceania", "Tarawa", 811, 120_000, true, 0.62, "$", "Australian Dollar"));
        countries.add(new Country("Kuwait", "Asia", "Kuwait City", 17_818, 4_500_000, false, 0.76, "د.ك", "Kuwaiti Dinar"));
        countries.add(new Country("Kyrgyzstan", "Asia", "Bishkek", 199_951, 6_800_000, false, 0.65, "сом", "Kyrgyzstani Som"));
        countries.add(new Country("Laos", "Asia", "Vientiane", 236_800, 7_500_000, false, 0.63, "₭", "Lao Kip"));
        countries.add(new Country("Latvia", "Europe", "Riga", 64_589, 1_900_000, false, 0.75, "€", "Euro"));
        countries.add(new Country("Lebanon", "Asia", "Beirut", 10_452, 7_000_000, false, 0.69, "ل.ل", "Lebanese Pound"));
        countries.add(new Country("Lesotho", "Africa", "Maseru", 30_355, 2_300_000, false, 0.58, "L", "Lesotho Loti"));
        countries.add(new Country("Liberia", "Africa", "Monrovia", 111_369, 5_300_000, false, 0.54, "$", "Liberian Dollar"));
        countries.add(new Country("Libya", "Africa", "Tripoli", 1_759_541, 7_000_000, false, 0.60, "ل.د", "Libyan Dinar"));
        countries.add(new Country("Liechtenstein", "Europe", "Vaduz", 160, 39_000, false, 0.77, "CHF", "Swiss Franc"));
        countries.add(new Country("Lithuania", "Europe", "Vilnius", 65_300, 2_700_000, false, 0.76, "€", "Euro"));
        countries.add(new Country("Luxembourg", "Europe", "Luxembourg City", 2_586, 660_000, false, 0.78, "€", "Euro"));
        countries.add(new Country("Madagascar", "Africa", "Antananarivo", 587_041, 30_000_000, true, 0.55, "Ar", "Malagasy Ariary"));
        countries.add(new Country("Malawi", "Africa", "Lilongwe", 118_484, 21_000_000, false, 0.53, "MK", "Malawian Kwacha"));
        countries.add(new Country("Malaysia", "Asia", "Kuala Lumpur", 330_803, 34_000_000, true, 0.72, "RM", "Malaysian Ringgit"));
        countries.add(new Country("Maldives", "Asia", "Malé", 300, 550_000, true, 0.72, "Rf", "Maldivian Rufiyaa"));
        countries.add(new Country("Mali", "Africa", "Bamako", 1_240_192, 22_000_000, false, 0.53, "CFA", "West African CFA Franc"));
        countries.add(new Country("Malta", "Europe", "Valletta", 316, 525_000, true, 0.78, "€", "Euro"));
        countries.add(new Country("Marshall Islands", "Oceania", "Majuro", 181, 60_000, true, 0.70, "$", "United States Dollar"));
        countries.add(new Country("Mauritania", "Africa", "Nouakchott", 1_030_700, 5_000_000, false, 0.55, "UM", "Mauritanian Ouguiya"));
        countries.add(new Country("Mauritius", "Africa", "Port Louis", 2_040, 1_300_000, true, 0.74, "₨", "Mauritian Rupee"));
        countries.add(new Country("Micronesia", "Oceania", "Palikir", 702, 115_000, true, 0.66, "$", "United States Dollar"));
        countries.add(new Country("Moldova", "Europe", "Chișinău", 33_846, 2_600_000, false, 0.72, "L", "Moldovan Leu"));
        countries.add(new Country("Monaco", "Europe", "Monaco", 2, 40_000, false, 0.80, "€", "Euro"));
        countries.add(new Country("Mongolia", "Asia", "Ulaanbaatar", 1_564_116, 3_400_000, false, 0.67, "₮", "Mongolian Tögrög"));
        countries.add(new Country("Montenegro", "Europe", "Podgorica", 13_812, 620_000, false, 0.73, "€", "Euro"));
        countries.add(new Country("Morocco", "Africa", "Rabat", 446_550, 38_000_000, false, 0.62, "د.م.", "Moroccan Dirham"));
        countries.add(new Country("Mozambique", "Africa", "Maputo", 801_590, 34_000_000, false, 0.54, "MT", "Mozambican Metical"));
        countries.add(new Country("Myanmar (formerly Burma)", "Asia", "Naypyidaw", 676_578, 55_000_000, false, 0.63, "Ks", "Burmese Kyat"));
        countries.add(new Country("Namibia", "Africa", "Windhoek", 825_615, 2_600_000, false, 0.61, "$", "Namibian Dollar"));
        countries.add(new Country("Nauru", "Oceania", "Yaren", 21, 12_000, true, 0.66, "$", "Australian Dollar"));
        countries.add(new Country("Nepal", "Asia", "Kathmandu", 147_516, 30_000_000, false, 0.63, "₨", "Nepalese Rupee"));
        countries.add(new Country("Netherlands", "Europe", "Amsterdam", 41_543, 17_500_000, false, 0.77, "€", "Euro"));
        countries.add(new Country("New Zealand", "Oceania", "Wellington", 268_021, 5_200_000, true, 0.80, "$", "New Zealand Dollar"));
        countries.add(new Country("Nicaragua", "North America", "Managua", 130_373, 7_000_000, false, 0.64, "C$", "Nicaraguan Córdoba"));
        countries.add(new Country("Niger", "Africa", "Niamey", 1_267_000, 26_000_000, false, 0.52, "CFA", "West African CFA Franc"));
        countries.add(new Country("North Macedonia", "Europe", "Skopje", 25_713, 2_100_000, false, 0.71, "den", "Macedonian Denar"));
        countries.add(new Country("Norway", "Europe", "Oslo", 385_207, 5_500_000, false, 0.78, "kr", "Norwegian Krone"));
        countries.add(new Country("Oman", "Asia", "Muscat", 309_500, 5_000_000, false, 0.70, "ر.ع.", "Omani Rial"));
        countries.add(new Country("Pakistan", "Asia", "Islamabad", 881_913, 235_000_000, false, 0.64, "₨", "Pakistani Rupee"));
        countries.add(new Country("Palau", "Oceania", "Ngerulmud", 459, 18_000, true, 0.75, "$", "United States Dollar"));
        countries.add(new Country("Panama", "North America", "Panama City", 75_417, 4_600_000, false, 0.68, "B/.", "Balboa"));
        countries.add(new Country("Papua New Guinea", "Oceania", "Port Moresby", 462_840, 9_500_000, true, 0.56, "K", "Papua New Guinean Kina"));
        countries.add(new Country("Paraguay", "South America", "Asunción", 406_752, 7_500_000, false, 0.66, "₲", "Paraguayan Guarani"));
        countries.add(new Country("Peru", "South America", "Lima", 1_285_216, 34_000_000, false, 0.70, "S/", "Peruvian Sol"));
        countries.add(new Country("Philippines", "Asia", "Manila", 300_000, 114_000_000, true, 0.67, "₱", "Philippine Peso"));
        countries.add(new Country("Poland", "Europe", "Warsaw", 312_696, 38_000_000, false, 0.76, "zł", "Polish Zloty"));
        countries.add(new Country("Portugal", "Europe", "Lisbon", 92_090, 10_300_000, false, 0.77, "€", "Euro"));
        countries.add(new Country("Qatar", "Asia", "Doha", 11_586, 2_900_000, true, 0.80, "ر.ق", "Qatari Riyal"));
        countries.add(new Country("Romania", "Europe", "Bucharest", 238_397, 19_000_000, false, 0.73, "lei", "Romanian Leu"));
        countries.add(new Country("Rwanda", "Africa", "Kigali", 26_338, 14_000_000, false, 0.57, "FRw", "Rwandan Franc"));
        countries.add(new Country("Saint Kitts and Nevis", "North America", "Basseterre", 261, 53_000, true, 0.74, "$", "East Caribbean Dollar"));
        countries.add(new Country("Saint Lucia", "North America", "Castries", 617, 185_000, true, 0.73, "$", "East Caribbean Dollar"));
        countries.add(new Country("Saint Vincent and the Grenadines", "North America", "Kingstown", 389, 111_000, true, 0.71, "$", "East Caribbean Dollar"));
        countries.add(new Country("Samoa", "Oceania", "Apia", 2_831, 200_000, true, 0.70, "T", "Samoan Tala"));
        countries.add(new Country("San Marino", "Europe", "San Marino", 61, 33_000, false, 0.80, "€", "Euro"));
        countries.add(new Country("Sao Tome and Principe", "Africa", "São Tomé", 964, 225_000, true, 0.58, "Db", "São Tomé and Príncipe Dobra"));
        countries.add(new Country("Saudi Arabia", "Asia", "Riyadh", 2_149_690, 36_000_000, false, 0.69, "ر.س", "Saudi Riyal"));
        countries.add(new Country("Senegal", "Africa", "Dakar", 196_722, 18_000_000, false, 0.56, "CFA", "West African CFA Franc"));
        countries.add(new Country("Serbia", "Europe", "Belgrade", 88_361, 6_800_000, false, 0.72, "дин.", "Serbian Dinar"));
        countries.add(new Country("Seychelles", "Africa", "Victoria", 459, 100_000, true, 0.74, "SCR", "Seychellois Rupee"));
        countries.add(new Country("Sierra Leone", "Africa", "Freetown", 71_740, 8_500_000, false, 0.53, "Le", "Sierra Leonean Leone"));
        countries.add(new Country("Singapore", "Asia", "Singapore", 728, 5_600_000, true, 0.83, "$", "Singapore Dollar"));
        countries.add(new Country("Slovakia", "Europe", "Bratislava", 49_035, 5_500_000, false, 0.75, "€", "Euro"));
        countries.add(new Country("Slovenia", "Europe", "Ljubljana", 20_273, 2_100_000, false, 0.77, "€", "Euro"));
        countries.add(new Country("Solomon Islands", "Oceania", "Honiara", 28_896, 750_000, true, 0.58, "$", "Solomon Islands Dollar"));
        countries.add(new Country("Somalia", "Africa", "Mogadishu", 637_657, 18_000_000, false, 0.52, "Sh.so.", "Somali Shilling"));
        countries.add(new Country("Sri Lanka", "Asia", "Colombo", 65_610, 22_000_000, true, 0.66, "Rs", "Sri Lankan Rupee"));
        countries.add(new Country("Sudan", "Africa", "Khartoum", 1_886_068, 47_000_000, false, 0.52, "ج.س.", "Sudanese Pound"));
        countries.add(new Country("Suriname", "South America", "Paramaribo", 163_820, 600_000, false, 0.67, "$", "Surinamese Dollar"));
        countries.add(new Country("Sweden", "Europe", "Stockholm", 450_295, 10_500_000, false, 0.78, "kr", "Swedish Krona"));
        countries.add(new Country("Switzerland", "Europe", "Bern", 41_290, 8_700_000, false, 0.78, "CHF", "Swiss Franc"));
        countries.add(new Country("Syria", "Asia", "Damascus", 185_180, 22_000_000, false, 0.61, "SYP", "Syrian Pound"));
        countries.add(new Country("Taiwan", "Asia", "Taipei", 36_193, 24_000_000, true, 0.79, "NT$", "New Taiwan Dollar"));
        countries.add(new Country("Tajikistan", "Asia", "Dushanbe", 143_100, 10_000_000, false, 0.63, "ЅМ", "Tajikistani Somoni"));
        countries.add(new Country("Tanzania", "Africa", "Dodoma", 947_303, 67_000_000, false, 0.52, "TSh", "Tanzanian Shilling"));
        countries.add(new Country("Thailand", "Asia", "Bangkok", 513_120, 70_000_000, false, 0.76, "฿", "Baht"));
        countries.add(new Country("Timor-Leste", "Asia", "Dili", 14_919, 1_400_000, true, 0.61, "$", "United States Dollar"));
        countries.add(new Country("Togo", "Africa", "Lomé", 56_785, 10_000_000, false, 0.54, "CFA", "West African CFA Franc"));
        countries.add(new Country("Tonga", "Oceania", "Nuku'alofa", 747, 100_000, true, 0.64, "T$", "Tongan Paʻanga"));
        countries.add(new Country("Trinidad and Tobago", "North America", "Port of Spain", 5_131, 1_400_000, true, 0.70, "$", "Trinidad and Tobago Dollar"));
        countries.add(new Country("Tunisia", "Africa", "Tunis", 163_610, 12_000_000, false, 0.65, "د.ت", "Tunisian Dinar"));
        countries.add(new Country("Turkey", "Asia/Europe", "Ankara", 783_562, 88_000_000, false, 0.73, "₺", "Turkish Lira"));
        countries.add(new Country("Turkmenistan", "Asia", "Ashgabat", 491_210, 6_000_000, false, 0.64, "m", "Turkmenistani Manat"));
        countries.add(new Country("Tuvalu", "Oceania", "Funafuti", 26, 12_000, true, 0.66, "$", "Australian Dollar"));
        countries.add(new Country("Uganda", "Africa", "Kampala", 241_038, 48_000_000, false, 0.53, "USh", "Ugandan Shilling"));
        countries.add(new Country("Ukraine", "Europe", "Kyiv", 603_628, 35_000_000, false, 0.66, "₴", "Ukrainian Hryvnia"));
        countries.add(new Country("United Arab Emirates", "Asia", "Abu Dhabi", 83_600, 10_000_000, false, 0.79, "د.إ", "UAE Dirham"));
        countries.add(new Country("Uruguay", "South America", "Montevideo", 176_215, 3_500_000, false, 0.74, "$", "Uruguayan Peso"));
        countries.add(new Country("Uzbekistan", "Asia", "Tashkent", 447_400, 36_000_000, false, 0.65, "soʻm", "Uzbekistani Soʻm"));
        countries.add(new Country("Vanuatu", "Oceania", "Port Vila", 12_189, 330_000, true, 0.62, "VT", "Vanuatu Vatu"));
        countries.add(new Country("Vatican City", "Europe", "Vatican City", 1, 1_000, false, 0.80, "€", "Euro"));
        countries.add(new Country("Venezuela", "South America", "Caracas", 916_445, 34_000_000, false, 0.68, "Bs.S", "Bolívar Soberano"));
        countries.add(new Country("Yemen", "Asia", "Sana'a", 527_968, 34_000_000, false, 0.54, "﷼", "Yemeni Rial"));
        countries.add(new Country("Zambia", "Africa", "Lusaka", 752_612, 20_000_000, false, 0.51, "ZK", "Zambian Kwacha"));
        countries.add(new Country("Zimbabwe", "Africa", "Harare", 390_757, 19_000_000, false, 0.52, "$", "Zimbabwean Dollar"));
        countries.add(new Country("aa", "Africa", "Harare", 390_757, 10_000_000, false, 0.8, "A", "aa"));
        countries.add(new Country("bb", "Africa", "Harare", 390_757, 15_000_000, false, 0.2, "A", "aa"));

        return countries;
    }

    public static HashMap<String, Double> generateCurrencies() {
        HashMap<String, Double> map = new HashMap<>();

        map.put("$", 1.00);
        map.put("₼", 1.70);
        map.put("₺", 34.33);
        map.put("₪", 3.72);
        map.put("₽", 98.00);
        map.put("£", 0.77);
        map.put("¥", 153.71);
        map.put("€", 0.93);
        map.put("₹", 84.39);

        return map;
    }

}
