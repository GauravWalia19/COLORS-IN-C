package rainbow.rainformatbg;

public class DarkRedRFB implements IRainFormatBG
{
    private final String BOLD        = "\u001B[1;41m";   
    private final String ITALIC      = "\u001B[3;41m";   
    private final String UNDERLINE   = "\u001B[4;41m";  
    private final String BLINK       = "\u001B[5;41m";
    private final String CUT         = "\u001B[9;41m";
    private final String DOUBLELINE  = "\u001B[21;41m";
    private final String OVERLINE    = "\u001B[53;41m";

    @Override
    public String getBold() {
        return this.BOLD;
    }

    @Override
    public String getItalic() {
        return this.ITALIC;
    }

    @Override
    public String getUnderline() {
        return this.UNDERLINE;
    }

    @Override
    public String getBlink() {
        return this.BLINK;
    }

    @Override
    public String getStrikeThrough() {
        return this.CUT;
    }

    @Override
    public String getDoubleLine() {
        return this.DOUBLELINE;
    }

    @Override
    public String getOverLine() {
        return this.OVERLINE;
    }
}