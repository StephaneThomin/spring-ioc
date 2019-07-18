package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface {

    private OutfitInterface outfit;

    public Gandalf(OutfitInterface theOutfit) {
        outfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Je ne connais pas la moitié d'entre vous à moitié autant que je le voudrais; et j'aime moins que la moitié d'entre vous à moitié aussi bien que vous le méritez.";
    }

    @Override
    public String changeDress() {
        return outfit.color();
    }
}