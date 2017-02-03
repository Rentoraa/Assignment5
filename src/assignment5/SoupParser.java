package assignment5;

public class SoupParser
{
    private final static char delim = '/';

    public static Soup parseStringToSoup(String lineToParse){
        String[] parsedData;
        int delimCount = 0;
        for (int i = 0; i < lineToParse.length(); i++) {
            if (lineToParse.charAt(i) == delim) {
                delimCount++;
            }
        }
        parsedData = new String[6];
        String buffer = "";
        int count = 0;
        for(int i = 0; i < 5; i++) {
            while (buffer.charAt(buffer.length()-1) != delim) {
                buffer += lineToParse.charAt(0);
                count++;
            }
            parsedData[i] = buffer;
            buffer = "";
        }
        if (delimCount == 4) {
            String id = parsedData[0];
            double someUnitPrice = Double.parseDouble(parsedData[1]);
            
            return new Soup(parsedData[0], parsedData[1], parsedData[2], parsedData[3], parsedData[4]);
        }
        else if(delimCount == 5) {
            parsedData = new String[6];
            String buffer = "";
            int count = 0;
            for(int i = 0; i < 6; i++) {
                while (buffer.charAt(buffer.length()-1) != delim) {
                    buffer += lineToParse.charAt(0);
                    count++;
                }
                parsedData[i] = buffer;
                buffer = "";
            }
        }
        else {
            System.out.println("Invalid input.");
            System.exit(0);
        }
    }
}