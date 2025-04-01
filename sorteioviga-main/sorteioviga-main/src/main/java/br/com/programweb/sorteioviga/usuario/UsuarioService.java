package br.com.programweb.sorteioviga.usuario;

import java.util.List;

public interface UsuarioService {

    void cadastrarUsuario(Usuario usuario);

    List<Usuario> listarUsuarios();



    //adicionei os métodos de atualizar e deletar//
    Usuario atualizarUsuario(Long id, Usuario dadosAtualizados);

    void deletarUsuario(Long id);
}




