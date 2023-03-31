package io.coop;

import io.config.Config;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("coop")
public class CoopController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Coop> coop(Config config){
        List<Coop> coopList = new ArrayList<Coop>();
        for (int i = 1; i < 5; i++) {
            Coop coop = new Coop();
            coop.setCodigo("0978");
            coop.setMatricula("435346345345");
            coop.setRazaoSocial("Lorem Ipsum Ltda");
            coop.setCpfCnpj("79.997.381/0001-85");
            coop.setGrupo("Lorem Ipsum");

            coopList.add(coop);
        }

        return coopList;
    }
}
