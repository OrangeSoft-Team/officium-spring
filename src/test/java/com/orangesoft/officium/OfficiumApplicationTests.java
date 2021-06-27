package com.orangesoft.officium;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@AllArgsConstructor
@SpringBootTest
class OfficiumApplicationTests {

    @Test
    void contextLoads() {
        throw new ExcepcionIdPaisNulo();
    }
}
