/**
 *
 */
package projeto.modelo.fachada;

import java.util.ArrayList;
import java.util.Collection;
import projeto.erro.GeralException;
import projeto.modelo.negocio.*;
import projeto.modelo.to.*;

/**
 * @author EQUIPE R.143
 */
public class Fachada {

    private NegocioCidade rnCidade;
    private NegocioEndereco rnEndereco;
    private NegocioFornecedor rnFornecedor;
    private NegocioProduto rnProduto;//Diego Silva
    private NegocioProduto_Fornecedor rnProduto_Fornecedor;//Diego Silva
    private NegocioNotaFiscal_Produto rnNotaFiscal_Produto;//Diego Silva
    private NegocioCliente rnCliente;//Sandro Fernandes
    private NegocioUsuario rnUsuario;//Thiago Evoa
    private NegocioFuncionario rnFuncionario;//Thiago Evoa
    private NegocioNotaFiscal rnNotaFiscal;//Thiago Evoa
    private static NegocioMarca rnMarca; // Felipe Carlos
    private static NegocioTipo rnTipo; // Felipe Carlos
    private static NegocioFormaPagamento rnFormaPagamento; // Bruno Pinheiro
    private NegocioSegmento rnSegmento; // Bruno Pinheiro

    public Fachada() {

        rnCidade = new NegocioCidade();
        rnEndereco = new NegocioEndereco();
        rnFornecedor = new NegocioFornecedor();
        rnProduto = new NegocioProduto();//Diego Silva
        rnProduto_Fornecedor = new NegocioProduto_Fornecedor();//Diego Silva
        rnNotaFiscal_Produto = new NegocioNotaFiscal_Produto();//Diego Silva
        rnCliente = new NegocioCliente();//Sandro Fernandes
        rnUsuario = new NegocioUsuario();//Thiago Evoa
        rnFuncionario = new NegocioFuncionario();//Thiago Evoa
        rnNotaFiscal = new NegocioNotaFiscal();//Thiago Evoa
        rnMarca = new NegocioMarca();
        rnTipo = new NegocioTipo();
        rnFormaPagamento = new NegocioFormaPagamento(); // Bruno Pinheiro
        rnSegmento = new NegocioSegmento(); // Bruno Pinheiro
    }

    /**
     * ÁREA ESCRITA POR DANIEL VALENÇA RESPONSAVEL PELAS CLASSES Cidade,
     * Fornecedor, Endereco.
     */
    /**
     * CIDADE
     */
    public void salvarCidade(Cidade cd) throws GeralException {
        rnCidade.salvar(cd);
    }

    public Cidade consultarCidade(int cidade_Codigo) throws GeralException {
        return rnCidade.consultar(cidade_Codigo);
    }

    public Cidade consultarCidade(String cidades_Nome) throws GeralException {
        return rnCidade.consultar(cidades_Nome);
    }

    public void excluirCidade(int cidades_Codigo) throws GeralException {
        rnCidade.excluir(cidades_Codigo);
    }

    public void excluirCidade(String cidades_Nome) throws GeralException {
        rnCidade.excluir(cidades_Nome);
    }

    public void alterarCidade(Cidade cd) throws GeralException {
        rnCidade.alterar(cd);
    }

    public Collection<Cidade> listarCidadeTudo() throws GeralException {
        return rnCidade.listarTudo();
    }
    
    public Collection<Cidade> listarCidadeNome(String cidades_Nome) throws GeralException {
        return rnCidade.listarCidadeNome(cidades_Nome);
    }

    /**
     * ENDEREÇO
     */
    public void salvarEndereco(Endereco end) throws GeralException {
        rnEndereco.salvar(end);
    }

    public Endereco consultarEndCep(String enderecos_Cep) throws GeralException {
        return rnEndereco.consultarCep(enderecos_Cep);
    }

    public Endereco consultarEndLog(String enderecos_Logradouro) throws GeralException {
        return rnEndereco.consultarLogradouro(enderecos_Logradouro);
    }

    public void excluirEndereco(String enderecos_Cep) throws GeralException {
        rnEndereco.excluir(enderecos_Cep);
    }

    public void alterarEndereco(Endereco end) throws GeralException {
        rnEndereco.alterar(end);
    }

    public Collection<Endereco> listarEndTudo() throws GeralException {
        return rnEndereco.listarTudo();
    }
    
    public Collection<Endereco> listarEndCEP(String enderecos_CEP) throws GeralException {
        return rnEndereco.listarEndCEP(enderecos_CEP);
    }
    
    public Collection<Endereco> listarEndLog(String enderecos_Logradouro) throws GeralException {
        return rnEndereco.listarEndLog(enderecos_Logradouro);
    }
    
    public Collection<Endereco> listarEndCidade(String cidades_Nome) throws GeralException {
        return rnEndereco.listarEndCidade(cidades_Nome);
    }

    /**
     * FORNECEDOR
     */
    public void salvarFornecedor(Fornecedor f) throws GeralException {
        rnFornecedor.salvar(f);
    }

    public Fornecedor consultarForRazaoSocial(String fornecedores_RazaoSocial) throws GeralException {
        return rnFornecedor.consultarRazaoSocial(fornecedores_RazaoSocial);
    }

    public Fornecedor consultarForCNPJ(String fornecedores_CNPJ) throws GeralException {
        return rnFornecedor.consultarCNPJ(fornecedores_CNPJ);
    }

    public void excluirFornecedor(String fornecedores_CNPJ) throws GeralException {
        rnFornecedor.excluir(fornecedores_CNPJ);
    }

    public void alterarFornecedor(Fornecedor f) throws GeralException {
        rnFornecedor.alterar(f);
    }

    public Collection<Fornecedor> listarFornecedor() throws GeralException {
        return rnFornecedor.listar();
    }
    
    public Collection<Fornecedor> listarFornecedorCNPJ(String fornecedores_CNPJ) throws GeralException {
        return rnFornecedor.listarForCNPJ(fornecedores_CNPJ);
    }
    
    public Collection<Fornecedor> listarFornecedorRazaoSocial(String fornecedores_RazaoSocial) throws GeralException {
        return rnFornecedor.listarForRazaoSocial(fornecedores_RazaoSocial);
    }
    
    public Collection<Fornecedor> listarFornecedorCEP(String enderecos_CEP) throws GeralException {
        return rnFornecedor.listarForCEP(enderecos_CEP);
    }
    
    public Collection<Fornecedor> listarFornecedorLog(String enderecos_Logradouro) throws GeralException {
        return rnFornecedor.listarForLog(enderecos_Logradouro);
    }
    
    public Collection<Fornecedor> listarFornecedorCidade(String cidades_Nome) throws GeralException {
        return rnFornecedor.listarForCidade(cidades_Nome);
    }

    /**
     * FIM DA ÁREA ESCRITA POR DANIEL VALENÇA
     */

    
    /**
     * AREA ESCRITA POR DIEGO SILVA RESPONSAVEL PELAS CLASSES Produto,
     * Produto_Fornecedor, NotaFiscal_Produto. --PRODUTO--
     */
    /**
     * DIEGO SILVA salvar Produtos Responsável Diego
     *
     * @param p Salvar produto
     * @throws GeralException
     */
    public void salvarProduto(Produto p) throws GeralException {
        rnProduto.salvarProduto(p);
    }

    /**
     * Diego Silva Consultar Produto pela Descrição do Produto
     */
    public Produto consultarProduto(String produtos_Descricao) throws GeralException {
        return rnProduto.consultarDescricao(produtos_Descricao);
    }

    /**
     * Diego Silva consultar Produto pelo Codigo do Produto
     */
    public Produto consultarProduto(int produtos_Codigo) throws GeralException {
        return rnProduto.consultarCodigo(produtos_Codigo);
    }

    /**
     * EXCLUIR Produto Responsável
     */
    public void excluirProduto(int produtos_Codigo) throws GeralException {
        rnProduto.excluirProduto(produtos_Codigo);
    }

    /**
     * ALTERAR Produto
     */
    public void alterarProduto(Produto p) throws GeralException {
        rnProduto.alterarProduto(p);
    }

    /**
     * Diego Silva Lista os produtos pela descricao
     *
     * @param produtos_Descricao
     * @return
     * @throws GeralException
     */
    public Collection<Produto> listarProdutoDescricao(String produtos_Descricao) throws GeralException {
        return rnProduto.listarDescricao(produtos_Descricao);
    }
    
    /**
     * Diego Silva Lista os Produto pelo codigo da Marca
     * @param marcas_Codigo
     * @return
     * @throws GeralException 
     */
    public Collection<Produto> listarProdutoMarcas(int marcas_Codigo) throws GeralException {
        return rnProduto.listarProdutosMarca(marcas_Codigo);
    }
    
    /**
     * Diego Silva Lista os Produto pelo codigo do Tipo 
     * @param tipos_Codigo
     * @return
     * @throws GeralException 
     */
    public Collection<Produto> listaProdutoTipos(int tipos_Codigo) throws GeralException{
        return rnProduto.listarProdutosTipos(tipos_Codigo);
    }
    
    /**
     * Diego Silva Lista os Produto pelo codigo do Segmento
     * @param segmentos_Codigo
     * @return
     * @throws GeralException 
     */
    public Collection<Produto> listaProdutoSegmentos(int segmentos_Codigo) throws GeralException{
        return rnProduto.listarProdutosSegmento(segmentos_Codigo);
    }
    
    /**
     * Diego Silva Lista todos os Produtos
     * @return
     * @throws GeralException 
     */
    public Collection<Produto> listaProdutoTudo()throws GeralException{
        return rnProduto.listarTudo();
    }

    /**
     * --PRODUTO_FORNECEDOR--
     */
    /**
     * Diego Silva Salvar Produto_Fornecedor
     */
    public void salvarProduto_Fornecedor(Produto_Fornecedor pf) throws GeralException {
        rnProduto_Fornecedor.salvarProduto_Fornecedor(pf);
    }

    /**
     * Diego Silva Consultar informando primeiro o nome do fornecedor e depois o
     * tal produto
     *
     * @param Fornecedor_RazaoSocial
     * @param Produto_Descricao
     * @return
     * @throws GeralException
     */
    public Produto_Fornecedor consultarLigacaoFornecedorProduto(String Fornecedor_RazaoSocial, String Produto_Descricao) throws GeralException {
        return rnProduto_Fornecedor.ConsultarFornecedor_Produto(Fornecedor_RazaoSocial, Produto_Descricao);
    }

    /**
     * EXCLUIR o vinculo que o Fornecedor tem com o Produto
     *
     * @param Fornecedor_Codigo
     * @param Produto_Codigo
     * @throws GeralException
     */
    public void excluirProduto_Fornecedor(int Fornecedor_Codigo, int Produto_Codigo) throws GeralException {
        rnProduto_Fornecedor.excluirFornecedor_Produto(Fornecedor_Codigo, Produto_Codigo);
    }

    /**
     * ALTERAR Fornecedor de tal Produto
     *
     * @param Fornecedor_RazaoSocial
     * @param Produto_Descricao
     * @throws GeralException
     */
    public void alterarLigacaoFornecedorProduto(int NFornecedor_Codigo, int NProduto_Codigo, int Fornecedor_Codigo, int Produto_Codigo) throws GeralException {
        rnProduto_Fornecedor.alterarProduto_Fornecedor(NFornecedor_Codigo, NProduto_Codigo,Fornecedor_Codigo,Produto_Codigo);
    }
    
    /**
     * Listar todos os fornecedores do Produto informado
     * @param Produto_Descricao
     * @return
     * @throws GeralException 
     */
    public Collection<Produto_Fornecedor> listarFornecedoresdetalProduto(String Produto_Descricao) throws GeralException {
        return rnProduto_Fornecedor.listarFornecedordeProduto(Produto_Descricao);
    }
    
    /**
     * Listar todos os produtos do Fornecedor informado
     * @param fornecedor_RazaoSocial
     * @return
     * @throws GeralException 
     */
    public Collection<Produto_Fornecedor> listarFornecedordeProduto(String fornecedor_RazaoSocial) throws GeralException{
        return rnProduto_Fornecedor.listarFornecedordeProdutoFornecido(fornecedor_RazaoSocial);
    }
    
    /**
     * Listar todos os Produtos Fornecidos
     * @return
     * @throws GeralException 
     */
    public Collection<Produto_Fornecedor> listarTodosProdutosFornecidos() throws GeralException{
        return rnProduto_Fornecedor.listarTodos();
    }
    
    /**
     * Listar todos os Produtos não fornecidos pelos fornecedor selecionado
     * @param fornecedor_RazaSocial
     * @return
     * @throws GeralException 
     */
    public Collection<Produto_Fornecedor> listadeProdutosNaoFornecidos(String fornecedor_RazaSocial) throws GeralException{
      return rnProduto_Fornecedor.listadeProdutosNaoFornecidos(fornecedor_RazaSocial);  
    }

    /**
     * --NOTAFISCAL_PRODUTO--
     */
    /**
     * SALVAR NOTAFISCAL_PRODUTO
     */
    public void salvarNotaFiscal_Produto(int NotaFiscal_Codigo, int Produto_Codigo, int NotaFiscal_Quantidade) throws GeralException {
        rnNotaFiscal_Produto.salvarNotaFiscal_Produto(NotaFiscal_Codigo, Produto_Codigo, NotaFiscal_Quantidade);
    }

    /**
     * CONSULTAR NOTA FISCAL pelo numero da nota
     *
     * @param NotaFiscal_Numero
     * @return
     * @throws GeralException
     */
    public NotaFiscal_Produto consultarNotaFiscal_Produto(int NotaFiscal_Numero) throws GeralException {
        return rnNotaFiscal_Produto.consultarNotaFiscal_Produto(NotaFiscal_Numero);
    }

    /**
     * CONSULTAR NOTA FISCAL pelo numero da nota e codigo do Produto
     *
     * @param NotaFiscal_Numero
     * @param Produtos_Codigo
     * @return
     * @throws GeralException
     */
    public NotaFiscal_Produto consultarNotaFiscal_Produto(int NotaFiscal_Numero, int Produtos_Codigo) throws GeralException {
        return rnNotaFiscal_Produto.consultarNotaFiscal_Produto(NotaFiscal_Numero, Produtos_Codigo);
    }

    public void excluirNotaFiscal_Produto(NotaFiscal_Produto nfp) throws GeralException {
        rnNotaFiscal_Produto.excluirNotaFiscal_Produto(nfp);
    }

    /**
     * LISTAR Nota Fiscal e os seus Produtos
     *
     * @param notaFiscal_Produto
     * @return
     * @throws GeralException
     */
    public ArrayList<NotaFiscal_Produto> listaNotaFiscal_Produto(int notaFiscal_Produto) throws GeralException {
        return (ArrayList<NotaFiscal_Produto>) rnNotaFiscal_Produto.lista(notaFiscal_Produto);
    }

    /**
     * ATUALIZAR NOTA FISCAL PRODUTO
     */
    public void atualizarNotaFiscal_Produto(NotaFiscal_Produto npOld, NotaFiscal_Produto npNew) throws GeralException {
        rnNotaFiscal_Produto.atualizarNotaFiscal_Produto(npOld, npNew);
    }
    
    public ArrayList<NotaFiscal_Produto> listaProdutosNotaFiscal_Produto(int notaFiscal_Produto) throws GeralException{
        return (ArrayList<NotaFiscal_Produto>) rnNotaFiscal_Produto.listaProdutos(notaFiscal_Produto);
    }
    
    public void devolver(NotaFiscal_Produto nfp) throws GeralException{
        rnNotaFiscal_Produto.devolver(nfp);
    }

    /**
     * FIM DA ÁREA ESCRITA POR DIEGO SILVA-----------------
     */
    
    /**
     * ÁREA ESCRITA POR SANDRO RESPONSAVEL PELAS CLASSES Cliente, PessoaFisica,
     * PessoaJuridica.
     */
    /**
     * Sandro Fernandes salvar Cliente Tipo Pessoa Fisica
     *
     * @param pf (PessoaFisica)
     * @throws GeralException
     */
    public void salvarCliente(PessoaFisica pf) throws GeralException {
        rnCliente.salvar(pf);
    }

    /**
     * Sandro Fernandes salvar Cliente Tipo Pessoa Juridica
     *
     * @param pj (PessoaJuridica)
     * @throws GeralException
     */
    public void salvarCliente(PessoaJuridica pj) throws GeralException {
        rnCliente.salvar(pj);
    }

    /**
     * Sandro Fernandes consulta Cliente pelo Nome ou Razao Social
     *
     * @param cliente_NomeRazao
     * @throws GeralException
     */
    public PessoaFisica consultarPF_Nome(String pessoaFisica_Nome) throws GeralException {
        return rnCliente.consultarPF_Nome(pessoaFisica_Nome);
    }
    
    /**
     * Sandro Fernandes consultar cliente pelo CPF
     * @param cpf
     * @return
     * @throws GeralException 
     */
    public PessoaFisica consultarPF_CPF(String cpf) throws GeralException{
        return rnCliente.consultaPF_CPF(cpf);
    }
    
    /**
     * Sandro Fernandes consultar clienete pelo CNPJ
     * @param cnpj
     * @return
     * @throws GeralException 
     */
    public PessoaJuridica consultaPJ_CNPJ(String cnpj) throws GeralException{
        return rnCliente.consultaPJ_CNPJ(cnpj);
    }

    /**
     * Sandro Fernandes consulta Cliente pelo Codigo
     *
     * @param cliente_Codigo
     * @throws GeralException
     */
    public Cliente consultarCliCodigo(int clientes_Codigo) throws GeralException {
        return null;
    }

    /**
     * Sandro Fernandes Exclui Cliente pelo Codigo do cliente
     */
    public void excluirPessoaFisica(int codigo) throws GeralException {
        rnCliente.excluirPessoaFisica(codigo);
    }
    
    public void excluirPessoaJuridica(int codigo) throws GeralException {
        rnCliente.excluirPessoaJuridica(codigo);
    }


    /**
     * Sandro Fernandes Altera Cliente/Pessoa Fisica
     */
    public void alterarCliente(PessoaFisica pf) throws GeralException {
        rnCliente.alterarCliente(pf);
    }

    /**
     * Sandro Fernandes Altera Cliente/Pessoa Juridica
     */
    public void alterarCliente(PessoaJuridica pj) throws GeralException {
        rnCliente.alterarCliente(pj);
    }

    /**
     * Sandro fernandes lista os clientes pelo Tipo
     *
     * @param clientes_Tipo
     * @return
     * @throws GeralException
     */
    public Collection<PessoaFisica> listarPessoaFisica() throws GeralException {
        return rnCliente.listarPessoaFisica();
    }
    
    public Collection<PessoaJuridica> listarPessoaJuridica() throws GeralException {
        return rnCliente.listarPessoaJuridica();
    }
    

    public Collection<PessoaFisica> listarPfCidade(String cidade_nome) throws GeralException {
        return rnCliente.listarPfCidade(cidade_nome);
    }
    public Collection<PessoaJuridica> listarPjCidade(String cidade_nome) throws GeralException {
        return rnCliente.listarPjCidade(cidade_nome);
    }


    /**
     * FIM DA ÁREA ESCRITA POR SANDRO
     */
    
    
    /**
     * AREA ESCRITA POR Thiago Evoa RESPONSAVEL PELAS CLASSES Usuario,
     * Funcionario, NotaFiscal.
     */
    
    /**
     * Salvar usuario!
     * @param us Salvar usuario
     * @throws GeralException
     */
    public void salvarUsuario(Usuario us) throws GeralException {
        rnUsuario.salvar(us);
    }
    /**
       * Excluir usuario pelo codigo!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public void excluirUsuario(int funcionarios_Codigo) throws GeralException {
        rnUsuario.excluir(funcionarios_Codigo);
    }
    
    /**
       * Excluir usuario pelo nome!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public void excluirUsuario(String funcionarios_Nome) throws GeralException {
        rnUsuario.excluir(funcionarios_Nome);
    }
    /**
       * Alterar usuario!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public void alterarUsuario(Usuario us) throws GeralException {
        rnUsuario.alterar(us);
    }
    
    /**
       * Consultar usuario pelo codigo!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public Usuario consultarUsuario(int funcionarios_Codigo) throws GeralException {
        return rnUsuario.consultar(funcionarios_Codigo);
    }
    /**
       * Consultar usuario pelo nome!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public Usuario consultarUsuario(String funcionarios_Nome) throws GeralException {
        return rnUsuario.consultar(funcionarios_Nome);
    }
    
    /**
       * Listar usuario pelo codigo!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public Collection<Usuario> listarUsuario(int funcionarios_Codigo) throws GeralException {
        return rnUsuario.listar(funcionarios_Codigo);
    }
    
    /**
       * Listar usuario pelo nome!
       * @param funcionarios_Codigo
       * @throws GeralException 
       */
    public Collection<Usuario> listarUsuario(String funcionarios_Nome) throws GeralException {
        return rnUsuario.listar(funcionarios_Nome);
    }
    
    public Collection<Usuario> listarTodosUsuario() throws GeralException {
        return rnUsuario.listarTodosUsuario();
    }

    /**
     * Salvar Funcionario!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public void salvarFuncionario(Funcionario fu) throws GeralException {
        rnFuncionario.salvar(fu);
    }
    
     /**
     * Consultar Funcionario pelo codigo!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public Funcionario consultarFuncionario(int funcionarios_Codigo) throws GeralException {
        return rnFuncionario.consultar(funcionarios_Codigo);
    }
    
    /**
     * Consultar Funcionario pelo nome!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public Funcionario consultarFuncionario(String funcionarios_Nome) throws GeralException {
        return rnFuncionario.consultar(funcionarios_Nome);
    }
    
    /**
     * Excluir Funcionario pelo codigo!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public void excluirFuncionario(int funcionarios_Codigo) throws GeralException {
        rnFuncionario.excluir(funcionarios_Codigo);
    }
    
    /**
     * Excluir Funcionario pelo nome!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public void excluirFuncionario(String funcionarios_Nome) throws GeralException {
        rnFuncionario.excluir(funcionarios_Nome);
    }
    
    /**
     * Alterar Funcionario!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public void alterarFuncionario(Funcionario fu) throws GeralException {
        rnFuncionario.alterar(fu);
    }
    
    /**
     * Listar Funcionario pelo codigo!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public Collection<Funcionario> listarFuncionario(int funcionarios_Codigo) throws GeralException {
        return rnFuncionario.listar(funcionarios_Codigo);
    }
    
    /**
     * Listar Funcionario pelo nome!
     * @param fu Salvar Funcionario
     * @throws GeralException
     */
    public Collection<Funcionario> listarFuncionario(String funcionarios_Nome) throws GeralException {
        return rnFuncionario.listar(funcionarios_Nome);
    }
    
    /**
     * Listat todos os funcionários
     * @return
     * @throws GeralException 
     */
     public Collection<Funcionario> listarTodosFuncionario() throws GeralException {
        return rnFuncionario.listarTudo();
    }

    /**
     * Salvar Nota Fiscal!
     * @param nf Salvar NotaFiscal
     * @throws GeralException
     */
    public void salvar(NotaFiscal nf) throws GeralException {
        rnNotaFiscal.salvar(nf);
    }
    
    /**
     * Consultar Nota Fiscal!
     * @param nf Salvar NotaFiscal
     * @throws GeralException
     */
    public NotaFiscal consultar(int notasFiscal_Numero) throws GeralException {
        return rnNotaFiscal.consultar(notasFiscal_Numero);
    }
    
    /**
     * Cancelar Nota Fiscal!
     * @param nf Salvar NotaFiscal
     * @throws GeralException
     */
    public void cancelar(int notasFiscal_Numero) throws GeralException {
        rnNotaFiscal.cancelar(notasFiscal_Numero);
    }
    
    public void alterarNotaFiscal(NotaFiscal nf) throws GeralException{
        rnNotaFiscal.alterar(nf);
    }
    
    /**
     * Listar Nota Fiscal!
     * @param nf Salvar NotaFiscal
     * @throws GeralException
     */
    public Collection<NotaFiscal> listar(int notasFiscal_Numero) throws GeralException {
        return rnNotaFiscal.listar(notasFiscal_Numero);
    }
    
    /**
     * CONSULTAR ultima nota do cliente
     * @param clientes_Codigo
     * @return
     * @throws GeralException 
     */
    public NotaFiscal consultarUltimaNovaCliente(int clientes_Codigo) throws GeralException {
        return rnNotaFiscal.consultarUltimaNotaCliente(clientes_Codigo);
    }
    
    /**
     * ATUALIZAR O STATUS DA NOTA FISCAL
     */
    public void atualizarStatusNF(boolean status,int NotaFiscal_Codigo) throws GeralException{
        rnNotaFiscal.statusNotaFiscal(status,NotaFiscal_Codigo);
    }

    /**
     * FIM DA ÁREA ESCRITA POR Thiago Evoa
     */
    
    
    //Marca
	
	public void salvarMarca ( Marca m ) throws GeralException{
		rnMarca.salvar(m); 
	}
	
	public void excluirMarca ( int marcas_Codigo ) throws GeralException{
		rnMarca.excluirMarcas(marcas_Codigo);
	}
	
	public void excluirMarca ( String marcas_Descricao ) throws GeralException{
		rnMarca.excluirMarcas(marcas_Descricao);
	}
	
	public void alterarMarca ( Marca m) throws GeralException {
		rnMarca.alterar(m);
	}
	
	public Marca consultarMarcas( int marcas_Codigo) throws GeralException{		
		return rnMarca.consultarMarcas(marcas_Codigo);
	}
	
	public Marca consultarMarcas( String marcas_Descricao) throws GeralException{		
		return rnMarca.consultarMarcas(marcas_Descricao);
	}
        
        public Collection <Marca> listarMarca() throws GeralException {
		return rnMarca.listarMarca();
	
        }
	public Collection <Marca> listarMarcasDescricao( String marcas_Descricao) throws GeralException {
		return rnMarca.listarMarcasDescricao(marcas_Descricao);
	}
        
        public static int CodigoMarca()throws GeralException  {
		 return rnMarca.CodigoMarca();
        }
	//tipos
	
	public void salvarTipo ( Tipo  t ) throws GeralException{
		rnTipo.salvar(t); 
	}
	
	public void excluirTipo ( int tipos_Codigo ) throws GeralException{
		rnTipo.excluirTipos(tipos_Codigo);
	}
	
	public void excluirTipo ( String tipos_Descricao ) throws GeralException{
		rnTipo.excluirTipos(tipos_Descricao);
	}
	
	public void alterarTipo (Tipo t) throws GeralException {
		rnTipo.alterar(t);
	}
	
	public Tipo consultarTipos( int tipos_Codigo) throws GeralException{		
		return rnTipo.consultarTipos(tipos_Codigo);
	}
	

	public Tipo consultarTipos( String tipos_Descricao) throws GeralException{		
		return rnTipo.consultarTipos(tipos_Descricao);
	}
	
	
	public Collection <Tipo> listarTipo() throws GeralException {
		return rnTipo.listarTipo();
	}
        
        public Collection<Tipo> listarTiposDescricao(String Tipo_Descricao) throws GeralException {
                return rnTipo.listarTiposDescricao(Tipo_Descricao);
        }
	public static int Codigo()throws GeralException  {
		 return rnTipo.Codigo();
	 }
	
	/**
	 * FIM DA �REA ESCRITA POR Felipe Carlos
	 */
	
    /**
     * ÁREA ESCRITA POR Bruno Pinheiro RESPONSAVEL PELAS CLASSES Segemento,
     * FormaPagamento.
     */
    // FormaPagamento    
    public static int CodigoFormaPagamento()throws GeralException  {
		 return rnFormaPagamento.CodigoFormaPagamento();
    }
    
    /**
     * Cadastra a forma de pagamento do produto no banco de dados
     */
    public void salvarFormaPagamento(FormaPagamento fp) throws GeralException {
        rnFormaPagamento.salvar(fp);
    }
    
    public static int CodigoSegmento()throws GeralException  {
		 return rnFormaPagamento.CodigoFormaPagamento();
    }

    /**
     * Excluir forma de pagamento cadastradas dos produtos
     */
    public void excluirFormaPagamento(int formaPagamento_Codigo) throws GeralException {
        rnFormaPagamento.excluir(formaPagamento_Codigo);
    }

    /**
     * Metodo padrão de alteração das forma de pagamentos
     */
    public void alterarFormaPagamento(FormaPagamento fp) throws GeralException {
        rnFormaPagamento.alterar(fp);
    }

    /**
     * Metodo padrão para consultar
     */
    public FormaPagamento consultarFormaPagamento(String formaPagamento_Descricao) throws GeralException {
        return rnFormaPagamento.consultarFormaPagamento(formaPagamento_Descricao);
    }

    public FormaPagamento consultarFormaPagamento(int formaPagamento_Codigo) throws GeralException {
        return rnFormaPagamento.consultarFormaPagamento(formaPagamento_Codigo);
    }

    /**
     * Metodo Padrão para lista os dados
     */
    public Collection<FormaPagamento> listarFormasPagamentos() throws GeralException {
        return rnFormaPagamento.listarFormasPagamentos();
    }
    
    /**
     * Metodo Padrão para lista os dados
     */
    public Collection<FormaPagamento> listarFormasPagamentosDescricao(String formaPagamento) throws GeralException {
        return rnFormaPagamento.listarFormaPagamentoDescricao(formaPagamento);
    }

    // Segmento
    /**
     * Cadastra um segmento do produto no banco de dados
     */
    public void salvarSegmento(Segmento s) throws GeralException {
        rnSegmento.salvar(s);
    }

    /**
     * Excluir segmentos cadastrados dos produtos
     */
    public void excluirSegmento(int segmento_Codigo) throws GeralException {
        rnSegmento.excluir(segmento_Codigo);
    }

    /**
     * Metodo padrão de alteração de segmentos
     */
    public void alterarSegmento(Segmento s) throws GeralException {
        rnSegmento.alterar(s);
    }

    /**
     * Metodo padrão para consultar
     */
    public Segmento consultarSegmentos(String segmentos_Descricao)
            throws GeralException {
        return rnSegmento.consultarSegmentos(segmentos_Descricao);
    }

    public Segmento consultarSegmentos(int segmentos_Codigo)
            throws GeralException {
        return rnSegmento.consultarSegmentos(segmentos_Codigo);
    }

    /**
     * Metodo Padrão para lista os dados
     */
    public Collection<Segmento> listarSegmentos(String segmentos_Descricao)
            throws GeralException {
        return rnSegmento.listarSegmentos(segmentos_Descricao);
    }
    
    public Collection<Segmento> listarSegmentos()
            throws GeralException {
        return rnSegmento.listarSegmentos();
    }

    /**
     * FIM DA ÁREA ESCRITA POR Bruno Pinheiro
     */
    public PessoaFisica consultarPessoaFisicaCPF(String cliPf) {
        // TODO Auto-generated method stub
        return null;
    }

    public PessoaFisica consultarPessoaFisicaNome(String cliPf) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public PessoaJuridica consultarPessoaJuridicaCNPJ(String cnpf){
        return null;
    }
}