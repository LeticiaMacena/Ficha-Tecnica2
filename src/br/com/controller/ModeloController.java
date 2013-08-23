

package br.com.controller;

import br.com.model.negocio.Modelo;
import br.com.model.persistencia.ModeloDAO;
import br.com.model.persistencia.ModeloDAOJDBC;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class ModeloController {
    
    
     public void cadastrar(Modelo modelo) {
        ModeloDAO dao = new ModeloDAOJDBC();
        dao.inserir(modelo);

    }

    public void atualizar(Modelo modelo) {
        ModeloDAO dao = new ModeloDAOJDBC();
        dao.atualizar(modelo);

    }

    public void excluir(int id) {
        ModeloDAO dao = new ModeloDAOJDBC();
        dao.remover(id);

    }
    
    public List<Modelo> listarModelo() {
        ModeloDAO dao = new ModeloDAOJDBC();
        return dao.getModelos();
    }
    
    public Modelo listarModeloById (int id){
        ModeloDAO dao = new ModeloDAOJDBC();
        return dao.getModelosById(id);
    }
    
   public List<Modelo> listarModeloByNome (String nome){
        ModeloDAO dao = new ModeloDAOJDBC();
        return dao.getModelosByNome(nome);
    }
      
   public Modelo listarModeloByDescricaoPotencia (String descricao, int potencia){
       ModeloDAO dao = new ModeloDAOJDBC();
       return dao.getModeloByDescricaoPotencia(descricao, potencia);
   }
        

}
