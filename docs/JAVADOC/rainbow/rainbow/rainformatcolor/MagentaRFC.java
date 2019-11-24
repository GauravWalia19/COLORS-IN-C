package rainbow.rainformatcolor;

public class MagentaRFC implements IRainFormatColor
{
    public final String BOLD        = "\u001B[1;35m";
    public final String ITALIC      = "\u001B[3;35m";
    public final String UNDERLINE   = "\u001B[4;35m";
    public final String BLINK       = "\u001B[5;35m";
    public final String CUT         = "\u001B[9;35m";
    public final String DOUBLELINE  = "\u001B[21;35m";
    public final String OVERLINE    = "\u001B[53;35m";

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