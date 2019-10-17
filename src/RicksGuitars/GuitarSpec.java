package RicksGuitars;
public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private Strings noStrings;

    public GuitarSpec()
    {
        this.builder = Builder.COLLINGS;
        this.model = "";
        this.type = Type.ACOUSTIC;
        this.backWood = Wood.ALDER;
        this.topWood = Wood.ALDER;
        this.noStrings = Strings.SIX;
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Strings noStrings)
    {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.noStrings = noStrings;
    }

    public Builder getBuilder(){
        return builder;
    }

    public String getModel(){
        return model;
    }

    public Type getType(){
        return type;
    }

    public Wood getBackwood(){
        return backWood;
    }

    public Wood getTopwood(){
        return topWood;
    }

    public Strings getNoStrings()
    {
        return noStrings;
    }

    public boolean isMatching(GuitarSpec searchSpec)
    {
        if(searchSpec.getBuilder() != getBuilder())
        {
            return false;
        }

        String model = searchSpec.getModel().toLowerCase();

        if((model != null) && (!model.equals("")) && (!model.equals(getModel().toLowerCase())))
        {
            return false;
        }
        if(searchSpec.getType() != getType())
        {
            return false;
        }
        if (searchSpec.getBackwood() != getBackwood())
        {
            return false;
        }
        if (searchSpec.getTopwood() != getTopwood())
        {
            return false;
        }
        if (searchSpec.getNoStrings() != getNoStrings())
        {
            return false;
        }

        return true;

    }
}
