
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
       
}
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UsuarioController.class)
public class UsuarioControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testarListaUsuario() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/usuario")) //teste para acessar o endpoint
                .andDo(MockMvcResultHandlers.print()) // print do resultado do teste
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray()); // verificando se o endpoint retorna um array
    }




}
