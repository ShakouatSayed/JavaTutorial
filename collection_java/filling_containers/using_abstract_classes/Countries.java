package collection_java.filling_containers.using_abstract_classes;

import java.util.*;

/**
 * Countries
 */
public class Countries {
    public static String[][] Data = {
        { "ALGERIA", "Algiers" }, { "ANGOLA", "Luanda" }, { "BENIN", "Porto-Novo" },
        { "BOTSWANA", "Gaberone" }, { "BURKINA FASO", "Ouagadougou" }, { "BURUNDI", "Bujumbura" },
        { "CAMEROON", "Yaounde" }, { "CAPE VERDE", "Praia" }, { "CONGO", "Brazzaville" },
        { "CENTRAL AFRICAN REPUBLIC", "Bangui" }, { "CHAD", "N’djamena" }, { "COMOROS", "Moroni" },
        { "DJIBOUTI", "Dijibouti" }, { "EGYPT", "Cairo" }, { "EQUATORIAL GUINEA", "Malabo" },
        { "ERITREA", "Asmara" }, { "ETHIOPIA", "Addis Ababa" }, { "GABON", "Libreville" },
        { "THE GAMBIA", "Banjul" }, { "GHANA", "Accra" }, { "GUINEA", "Conakry" },
        { "BISSAU", "Bissau" }, { "COTE D’IVOIR (IVORY COAST)", "Yamoussoukro" }, { "KENYA", "Nairobi" },
        { "LESOTHO", "Maseru" }, { "LIBERIA", "Monrovia" }, { "LIBYA", "Tripoli" },
        { "MADAGASCAR", "Antananarivo" }, { "RWANDA", "Kigali" }, { "SAO TOME E PRINCIPE", "Sao Tome" },
        { "MALAWI", "Lilongwe" }, { "MALI", "Bamako" }, { "MAURITANIA", "Nouakchott" },
        { "MAURITIUS", "Port Louis" }, { "MOROCCO", "Rabat" }, { "MOZAMBIQUE", "Maputo" },
        { "NAMIBIA", "Windhoek" }, { "NIGER", "Niamey" }, { "NIGERIA", "Abuja" },
        { "SENEGAL", "Dakar" }, { "SEYCHELLES", "Victoria" }, { "SIERRA LEONE", "Freetown" },
        { "SOMALIA", "Mogadishu" }, { "SOUTH AFRICA", "Pretoria/Cape Town" }, { "SUDAN", "Khartoum" },
        { "SWAZILAND", "Mbabane" }, { "TANZANIA", "Dodoma" }, { "TOGO", "Lome" },
        { "TUNISIA", "Tunis" }, { "UGANDA", "Kampala" }, { "DEMOCRATIC REPUBLIC OF THE CONGO (ZAIRE)", "Kinshasa" },
        { "ZAMBIA", "Lusaka" }, { "ZIMBABWE", "Harare" },
        // Asia
        { "AFGHANISTAN", "Kabul" }, { "BAHRAIN", "Manama" }, { "BANGLADESH", "Dhaka" }, { "BHUTAN", "Thimphu" },
        { "BRUNEI", "Bandar Seri Begawan" },
        { "CAMBODIA", "Phnom Penh" },
        { "CHINA", "Beijing" }, { "CYPRUS", "Nicosia" },
        { "INDIA", "New Delhi" }, { "INDONESIA", "Jakarta" },
        { "IRAN", "Tehran" }, { "IRAQ", "Baghdad" },
        { "ISRAEL", "Jerusalem" }, { "JAPAN", "Tokyo" },
        { "JORDAN", "Amman" }, { "KUWAIT", "Kuwait City" },
        { "LAOS", "Vientiane" }, { "LEBANON", "Beirut" },
        { "MALAYSIA", "Kuala Lumpur" }, { "THE MALDIVES", "Male" },
        { "MONGOLIA", "Ulan Bator" },
        { "MYANMAR (BURMA)", "Rangoon" },
        { "NEPAL", "Katmandu" }, { "NORTH KOREA", "P’yongyang" },
        { "OMAN", "Muscat" }, { "PAKISTAN", "Islamabad" },
        { "PHILIPPINES", "Manila" }, { "QATAR", "Doha" },
        { "SAUDI ARABIA", "Riyadh" }, { "SINGAPORE", "Singapore" },
        { "SOUTH KOREA", "Seoul" }, { "SRI LANKA", "Colombo" },
        { "SYRIA", "Damascus" },
        { "TAIWAN (REPUBLIC OF CHINA)", "Taipei" },
        { "THAILAND", "Bangkok" }, { "TURKEY", "Ankara" },
        { "UNITED ARAB EMIRATES", "Abu Dhabi" },
        { "VIETNAM", "Hanoi" }, { "YEMEN", "Sana’a" },
        // Australia and Oceania
        { "AUSTRALIA", "Canberra" }, { "FIJI", "Suva" },
        { "KIRIBATI", "Bairiki" },
        { "MARSHALL ISLANDS", "Dalap-Uliga-Darrit" },
        { "MICRONESIA", "Palikir" }, { "NAURU", "Yaren" },
        { "NEW ZEALAND", "Wellington" }, { "PALAU", "Koror" },
        { "PAPUA NEW GUINEA", "Port Moresby" },
        { "SOLOMON ISLANDS", "Honaira" }, { "TONGA", "Nuku’alofa" },
        { "TUVALU", "Fongafale" }, { "VANUATU", "< Port-Vila" },
        { "WESTERN SAMOA", "Apia" },
        // Eastern Europe and former USSR
        { "ARMENIA", "Yerevan" }, { "AZERBAIJAN", "Baku" },
        { "BELARUS (BYELORUSSIA)", "Minsk" },
        { "BULGARIA", "Sofia" }, { "GEORGIA", "Tbilisi" },
        { "KAZAKSTAN", "Almaty" }, { "KYRGYZSTAN", "Alma-Ata" },
        { "MOLDOVA", "Chisinau" }, { "RUSSIA", "Moscow" },
        { "TAJIKISTAN", "Dushanbe" }, { "TURKMENISTAN", "Ashkabad" },
        { "UKRAINE", "Kyiv" }, { "UZBEKISTAN", "Tashkent" },
        // Europe
        { "ALBANIA", "Tirana" }, { "ANDORRA", "Andorra la Vella" },
        { "AUSTRIA", "Vienna" }, { "BELGIUM", "Brussels" },
        { "BOSNIA", "-" }, { "HERZEGOVINA", "Sarajevo" },
        { "CROATIA", "Zagreb" }, { "CZECH REPUBLIC", "Prague" },
        { "DENMARK", "Copenhagen" }, { "ESTONIA", "Tallinn" },
        { "FINLAND", "Helsinki" }, { "FRANCE", "Paris" },
        { "GERMANY", "Berlin" }, { "GREECE", "Athens" },
        { "HUNGARY", "Budapest" }, { "ICELAND", "Reykjavik" },
        { "IRELAND", "Dublin" }, { "ITALY", "Rome" },
        { "LATVIA", "Riga" }, { "LIECHTENSTEIN", "Vaduz" },
        { "LITHUANIA", "Vilnius" }, { "LUXEMBOURG", "Luxembourg" },
        { "MACEDONIA", "Skopje" }, { "MALTA", "Valletta" },
        { "MONACO", "Monaco" }, { "MONTENEGRO", "Podgorica" },
        { "THE NETHERLANDS", "Amsterdam" }, { "NORWAY", "Oslo" },
        { "POLAND", "Warsaw" }, { "PORTUGAL", "Lisbon" },
        { "ROMANIA", "Bucharest" }, { "SAN MARINO", "San Marino" },
        { "SERBIA", "Belgrade" }, { "SLOVAKIA", "Bratislava" },
        { "SLOVENIA", "Ljuijana" }, { "SPAIN", "Madrid" },
        { "SWEDEN", "Stockholm" }, { "SWITZERLAND", "Berne" },
        { "UNITED KINGDOM", "London" }, { "VATICAN CITY", "---" },
        // North and Central America
        { "ANTIGUA AND BARBUDA", "Saint John’s" },
        { "BAHAMAS", "Nassau" },
        { "BARBADOS", "Bridgetown" }, { "BELIZE", "Belmopan" },
        { "CANADA", "Ottawa" }, { "COSTA RICA", "San Jose" },
        { "CUBA", "Havana" }, { "DOMINICA", "Roseau" },
        { "DOMINICAN REPUBLIC", "Santo Domingo" },
        { "EL SALVADOR", "San Salvador" },
        { "GRENADA", "Saint George’s" },
        { "GUATEMALA", "Guatemala City" },
        { "HAITI", "Port-au-Prince" },
        { "HONDURAS", "Tegucigalpa" }, { "JAMAICA", "Kingston" },
        { "MEXICO", "Mexico City" }, { "NICARAGUA", "Managua" },
        { "PANAMA", "Panama City" }, { "ST. KITTS", "-" },
        { "NEVIS", "Basseterre" }, { "ST. LUCIA", "Castries" },
        { "ST. VINCENT AND THE GRENADINES", "Kingstown" },
        { "UNITED STATES OF AMERICA", "Washington, D.C." },
        // South America
        { "ARGENTINA", "Buenos Aires" },
        { "BOLIVIA", "Sucre (legal)/La Paz(administrative)" },
        { "BRAZIL", "Brasilia" }, { "CHILE", "Santiago" },
        { "COLOMBIA", "Bogota" }, { "ECUADOR", "Quito" },
        { "GUYANA", "Georgetown" }, { "PARAGUAY", "Asuncion" },
        { "PERU", "Lima" }, { "SURINAME", "Paramaribo" },
        { "TRINIDAD AND TOBAGO", "Port of Spain" },
        { "URUGUAY", "Montevideo" }, { "VENEZUELA", "Caracas" }
    };

     public static class FlyWeightMap extends AbstractMap<String, String> {
          static class Entry implements Map.Entry<String, String> {

            private int index;

            private Entry(int index) {
                this.index = index;
            }

            public boolean equels(Object o) {
                return Data[index][0].equals(o);
            }

            public String getKey() {
                return Data[index][0];
            }

            public String getValue() {
                return Data[index][1];
            }

            public String setValue(String value) {
                throw new UnsupportedOperationException();
            }

            public int hashCode() {
                return Data[index][0].hashCode();
            }
        }

        private static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private static int size;

            private EntrySet(int size) {
                if (size < 0)
                    this.size = 0;
                else if (size > Data.length)
                    size = Data.length;
                else
                    this.size = size;
            }

            public int size() {
                return size;
            }

            private static class Itre implements Iterator<Map.Entry<String, String>> {
                Entry entry = new Entry(-1);

                public boolean hasNext() {
                    return entry.index < size - 1;
                }

                public Map.Entry<String, String> next() {
                    entry.index++;
                    return entry;
                }

                public void remove() {
                    throw new UnsupportedOperationException();
                }
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new Itre();
            }
        }

        public static Set<Map.Entry<String, String>> entries = new EntrySet(Data.length);

        public Set<Map.Entry<String, String>> entrySet() {
            return entries;
        }

        public static Map<String, String> select(final int size) {
            return new FlyWeightMap() {
                public Set<Map.Entry<String, String>> entrySet() {
                    return new EntrySet(size);
                }
            };
        }

        public static Map<String, String> map = new FlyWeightMap();

        public static Map<String, String> capitals() {
            return map;
        }

        public static Map<String, String> capitals(int size) {
            return select(size);
        }

        public static Collection<String> names = new ArrayList<>(map.keySet());

        public static Collection<String> names() {
            return names;
        }

        public static Collection<String> names(int size) {
            return new ArrayList<>(select(size).keySet());
        }
    }

    public static void main(String[] args) {
        System.out.println("-------Capitals-------");
        System.out.println(FlyWeightMap.capitals(5));
        System.out.println("-------Countries-------");
        System.out.println(FlyWeightMap.names(5));
        System.out.println("-------HashMap-------");
        System.out.println(new HashMap<String, String>(FlyWeightMap.capitals()));
        System.out.println("-------TreeMap-------");
        System.out.println(new TreeMap<String, String>(FlyWeightMap.capitals()));
        System.out.println("-------LinkedHashMap-------");
        System.out.println(new LinkedHashMap<String, String>(FlyWeightMap.capitals()));
        System.out.println("------- LinkedHashMap -------");
        System.out.println(new Hashtable<>(FlyWeightMap.capitals()));
        System.out.println("-------HashSet-------");
        System.out.println(new HashSet<String>(FlyWeightMap.names(5)));
        System.out.println("-------LinkedHashSet-------");
        System.out.println(new LinkedHashSet<String>(FlyWeightMap.names(5)));
        System.out.println("-------LinkedList-------");
        System.out.println(new LinkedList<>(FlyWeightMap.names(5)));
        System.out.println("-------ArrayList-------");
        System.out.println(new ArrayList<String>(FlyWeightMap.names(5)));
        System.out.println("-------One Cuntry-------");
        System.out.println(FlyWeightMap.capitals().get("BURKINA FASO"));

    }
}