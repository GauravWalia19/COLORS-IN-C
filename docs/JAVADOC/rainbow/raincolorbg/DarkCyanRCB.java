package rainbow.raincolorbg;

public class DarkCyanRCB implements IRainColorBG
{
    private final String BGDGREEN = "\u001B[36;40m";
    private final String BGLGREEN = "\u001B[36;42m";
    private final String BGMGREEN = "\u001B[36;100m";
    private final String BGDRED   = "\u001B[36;41m";
    private final String BGLRED   = "\u001B[36;101m";
    private final String BGDORANGE= "\u001B[36;43m";
    private final String BGLORANGE= "\u001B[36;102m";
    private final String BGLBLUE  = "\u001B[36;44m";
    private final String BGLWHITE = "\u001B[36;47m";
    private final String BGDWHITE = "\u001B[36;107m";
    private final String BGLEMON  = "\u001B[36;103m";
    private final String BGMPINK  = "\u001B[36;104m";
    private final String BGDPINK  = "\u001B[36;105m";
    private final String BGLPINK  = "\u001B[36;106m";

    @Override
    public String getBGDGREEN() {
        return BGDGREEN;
    }

    @Override
    public String getBGLGREEN() {
        return BGLGREEN;
    }

    @Override
    public String getBGMGREEN() {
        return BGMGREEN;
    }

    @Override
    public String getBGDRED() {
        return BGDRED;
    }

    @Override
    public String getBGLRED() {
        return BGLRED;
    }

    @Override
    public String getBGDORANGE() {
        return BGDORANGE;
    }

    @Override
    public String getBGLORANGE() {
        return BGLORANGE;
    }

    @Override
    public String getBGLBLUE() {
        return BGLBLUE;
    }

    @Override
    public String getBGLWHITE() {
        return BGLWHITE;
    }

    @Override
    public String getBGDWHITE() {
        return BGDWHITE;
    }

    @Override
    public String getBGLEMON() {
        return BGLEMON;
    }

    @Override
    public String getBGMPINK() {
        return BGMPINK;
    }

    @Override
    public String getBGDPINK() {
        return BGDPINK;
    }

    @Override
    public String getBGLPINK() {
        return BGLPINK;
    }
}