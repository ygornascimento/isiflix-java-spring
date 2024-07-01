package br.com.professorisidro.hello.controller;

import br.com.professorisidro.hello.model.Usuario;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {
        System.out.println("Recebido: " + dadosLogin.getEmail()+"/"+dadosLogin.getSenha());
        if(dadosLogin.getEmail().equals("ygor.nascimento@outlook.com")) {
            if(dadosLogin.getSenha().equals("1234")) {
                Usuario resposta = new Usuario();
                resposta.setId(54321);
                resposta.setNome("Ygor Nascimento");
                resposta.setEmail("ygor.nascimento@outlook.com");
                resposta.setSenha("1234");

                //retorno a resposta de código 200 - ok + o objeto
                return ResponseEntity.ok(resposta);
            }
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.notFound().build();//ResponseEntity.status(404).build();
    }
}
