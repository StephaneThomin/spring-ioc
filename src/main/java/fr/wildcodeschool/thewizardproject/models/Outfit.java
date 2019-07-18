package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit implements OutfitInterface {

    @Override
    public String color() {
        return "La robe du Sorcier est bleu";
    }
}