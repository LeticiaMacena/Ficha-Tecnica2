package br.com.model.persistencia;

import br.com.model.negocio.Funcionario;
import br.com.model.persistencia.dao.FuncionarioDAO;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class FuncionarioDAOImpl extends DAOImpl<Funcionario, Integer> implements FuncionarioDAO {
    //busca o funcionario pelo nome quando o nome for ...

    public List<Funcionario> getByNome(String nome) {
        return getEntityManager().createQuery("select u from Funcionario u where u.nome like '%" + nome + "%'").getResultList();
    }

    public Funcionario getFuncionarioByNome(String nome) {
        Query q = getEntityManager().createQuery("select u from Funcionario u where u.Nome like '" + nome + "'", Funcionario.class);
        List<Funcionario> Funcionarios = q.getResultList();
        for (Funcionario u : Funcionarios) {
            return u;
        }
        return null;

    }

    public Funcionario getFuncionarioByNomeTelefone(String nome, String telefone) {
        Query q = getEntityManager().createQuery("select u from Funcionario u where u.nome like '%" + nome + "%' and u.telefone like '%" + telefone + "%'", Funcionario.class);
        List<Funcionario> funcionarios = q.getResultList();
        for (Funcionario u : funcionarios) {
            return u;
        }
        return null;
    }

    @Override
    public Funcionario validaLogin(String login, String senha) {
        Query q = getEntityManager().createQuery("select f from Funcionario f where f.login = '" + login + "' and f.senha = '" + senha + "'", Funcionario.class);
        boolean autenticado = false;
        List<Funcionario> funcionarios = q.getResultList();
        for (Funcionario u : funcionarios) {
            return u;
        }
        return null;

    }
}
