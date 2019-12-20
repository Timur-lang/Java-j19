package bybellhard.j19.lessons.lesson5.Pg;

public class Example {
    private String priv = "priv";
    String def = "def";
    protected String prot = "prot";
    public String pub = "pub";

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        if (priv.length() < 8)
            return;

        this.priv = priv;

    }
}
