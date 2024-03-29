/**
 *
 */
package projeto.modelo.repositorio;

import java.util.Collection;
import projeto.erro.ConexaoException;
import projeto.erro.RepositorioException;
import projeto.modelo.to.NotaFiscal;

/**
 * @author Thiago Evoa
 *
 */
public interface IRepositorioNotaFiscal {

    /**
     * Insere uma NotaFiscal no banco de dados
     * @param nf NotaFical
     * @throws ConexaoException
     * @throws RepositorioException
     */
    public void salvar(NotaFiscal nf) throws ConexaoException, RepositorioException;

    /**
     * Cancela uma NotaFiscal no banco de dados
     * @param funcionarios_Codigo
     * @throws ConexaoException
     * @throws RepositorioException
     */
    public void cancelar(int notasFiscal_Numero) throws ConexaoException, RepositorioException;

    /**
     * Altera uma NotaFiscal no banco de dados pelo número da nota
     * @param nf NotaFical
     * @throws ConexaoException
     * @throws RepositorioException
     */
    public void alterar(NotaFiscal nf) throws ConexaoException, RepositorioException;

    /**
     * Consultar uma Nota Fiscal no banco de dados
     * @param funcionarios_Codigo
     * @throws ConexaoException
     * @throws RepositorioException
     */
    public NotaFiscal consultar(int notasFiscal_Numero) throws ConexaoException, RepositorioException;
    
    /**
     * Consultar a Nova Nota Fiscal
     * @param Cliente_Codigo
     * @return
     * @throws ConexaoException
     * @throws RepositorioException 
     */
    public NotaFiscal consultarUltimaNota(int Cliente_Codigo ) throws ConexaoException, RepositorioException;

    /**
     * Consultar uma lista de NotaFiscal no banco de dados
     * @return
     * @throws ConexaoException
     * @throws RepositorioException
     */
    public Collection<NotaFiscal> listar(int notasFiscal_Numero) throws ConexaoException, RepositorioException;
    
    /**
     * Atualizar o status da Nota Fiscal
     * @param notasFiscal_Numero
     * @throws ConexaoException
     * @throws RepositorioException 
     */
    public void statusNotaFiscal(boolean status,int notasFiscal_Numero) throws ConexaoException, RepositorioException;
    
}