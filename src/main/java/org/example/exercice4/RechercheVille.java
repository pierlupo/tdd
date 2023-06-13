package org.example.exercice4;
import jdk.jshell.spi.ExecutionControl;
import lombok.Data;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

@Data
public class RechercheVille {
    private List<String> villes;

    public List<String> rechercher(String mot) throws ExecutionControl.NotImplementedException, NotFoundException {
        if(mot.equals("*")) {
            return villes;
        }
        if(mot.length() <= 1) {
            throw new NotFoundException();
        }
        else {
            List<String> result = new ArrayList<>();
            for(String s : villes) {
                if(s.toLowerCase().contains(mot.toLowerCase())) {
                    result.add(s);
                }
            }
            return result;
        }
    }
}
