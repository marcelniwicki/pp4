package pl.jkan.credit;

import com.fasterxml.jackson.databind.util.NameTransformer;

import javax.xml.crypto.dsig.Transform;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesProvider {
    NameTransformer nameTransformer;
    public NamesProvider(NameTransformer nameTransformer){
        this.nameTransformer = nameTransformer;
    }

    public NamesProvider(pl.jkan.credit.NameTransformer nameTransformer) {
    }


    public List<String> allNames() {
        return Arrays
                .asList("Kuba", "Marcel", "Marcin", "Ola", "Aga")
                .stream()
                .filter(name -> !name.equals("Kuba"))
                .map(name -> nameTransformer.transform(name))
                .collect(Collectors.toList())
                ;
    }
}
