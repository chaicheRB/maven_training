
public class NameGenerator {
    public String generateName(FacialHairStyle hairStyle) {
        final String name;
        if (FacialHairStyle.BEARDED == hairStyle) {
            name = "Barbossa";
        } else if(FacialHairStyle.MUSTACHE == hairStyle) {
            name = "Jenkins";
        } else {
            name="Saitama";
        }
        return name;
    }
}
