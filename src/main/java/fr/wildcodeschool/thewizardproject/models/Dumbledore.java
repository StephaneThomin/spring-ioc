package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private OutfitInterface outfit;

    public Dumbledore(OutfitInterface theOutfit) {
        outfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Il faut beaucoup de bravoure pour faire face à ses ennemis mais il n’en faut pas moins pour affronter ses amis.";
    }

    @Override
    public String changeDress() {
        return outfit.color();
    }
}
