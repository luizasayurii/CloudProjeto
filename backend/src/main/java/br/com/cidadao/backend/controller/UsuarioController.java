package br.com.cidadao.backend.controller;

import br.com.cidadao.backend.model.Usuario;
import br.com.cidadao.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody Usuario usuario) {
        if (repository.findByEmail(usuario.getEmail()) != null) {
            return "E-mail já cadastrado!";
        }
        repository.save(usuario);
        return "Usuário cadastrado com sucesso!";
    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        Usuario usuarioExistente = repository.findByEmail(usuario.getEmail());
        if (usuarioExistente == null) {
            return "E-mail não encontrado!";
        }
        if (usuarioExistente.getSenha().equals(usuario.getSenha())) {
            return "Login realizado com sucesso!";
        }
        return "Senha incorreta!";
    }
}
