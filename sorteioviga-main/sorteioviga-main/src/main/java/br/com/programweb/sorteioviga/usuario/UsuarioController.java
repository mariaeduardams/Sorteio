package br.com.programweb.sorteioviga.usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador que expõe a API REST para a entidade Usuario.
 * Aqui se aplica:
 * - Verbos HTTP (GET, POST, PUT, DELETE)
 * - URL base "/usuarios"
 * - Uso de clientes HTTP (ex: Postman) para testar os endpoints
 */


@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;


    // TODO chamada: www.sorteioviga.com/usuarios/todos  Tipo: GET
    @GetMapping("/todos")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }


    //Implementei os métodos POST,PUT,DELETE
    @PostMapping
    public void cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario dadosAtualizados) {
        return usuarioService.atualizarUsuario(id, dadosAtualizados);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }
}

