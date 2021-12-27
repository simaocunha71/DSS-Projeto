package model.interfaces;

import model.Equipamento;
import model.excecoes.JaExistenteExcecao;

import java.io.IOException;
import java.util.List;

public interface ICentroReparacoes {

    IUtilizador get_utilizador_by_ID(String id);

    void adicionar_utilizador(String id,String nome,String password,int permissao) throws JaExistenteExcecao, IOException;

    void adicionar_cliente(String nif, String nome, String numTelemovel, String email) throws JaExistenteExcecao, IOException;

    void carregar_utilizadores(String filename) throws IOException, JaExistenteExcecao;

    void carregar_cp(String utilizadoresFN,String clientesFN,String armazemFN,String pedidosFN) throws IOException, JaExistenteExcecao;

    void adicionar_pedido_orcamento(String nifCliente, String modelo, String descricaoEquipamento, String descricaoPedido) throws IOException;

    boolean exists_plan();

    boolean login (String id, String password);

    void logout();

    boolean logged_funcionario();
    boolean logged_tecnico();
    boolean logged_gestor();

    boolean exists_user(String id);

    boolean exists_cliente(String nif);

    int get_ultimo_numero_de_registo_equipamento();

    List<String> get_pedidos_orcamento();
}
