package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {

    private OutfitInterface outfit;

    @Autowired
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
