
package br.com.projetocrud.dao;

import br.com.projetocrud.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author alves.ferreira
 */
public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
