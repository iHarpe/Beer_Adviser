package co.edu.unipiloto.beeradviser;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    List<String> getBrands (String color){
        List<String> brands = new ArrayList<>();
        switch (color){
            case "Amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
             break;
            case "Light":
                brands.add("Jail Pale Ale");
                brands.add("Gout Sout");
             break;
            case "Brown":
                brands.add("Surly Bender");
                brands.add("Genesee Brewing Honey Brown");
             break;
            case "Dark":
                brands.add("Polygamy Nitro Porter");
                brands.add("Cutthroat Porter");
                break;
            default:
                brands.add("Nothig to show");
        }
        return brands;
    }
}

