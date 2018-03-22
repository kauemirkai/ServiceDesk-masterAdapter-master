package br.usjt.deswebmob.servicedesk.Model;

import java.util.ArrayList;
import java.util.Date;

import br.usjt.deswebmob.servicedesk.Controller.ListarChamadosActivity;

/**
 * Created by Kaue on 21/03/2018.
 */

public class Data {


    public static ArrayList<Chamado> geraListaChamados(){
        ArrayList<Chamado> lista = new ArrayList<>();

        Chamado chamado = new Chamado();
        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Computador não funciona");
        Fila fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(2);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Telefone Não funciona");
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(3);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Troca de senha");
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(4);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Troca de senha");
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(5);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Internet");
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        fila.setFigura(FilaId.REDES.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(6);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Manutenção de chamado");
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        fila.setFigura(FilaId.REDES.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(7);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("Telefone");
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(8);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(chamado.ABERTO);
        chamado.setDescricao("teste");
        fila.setId(FilaId.ERP.id());
        fila.setNome(FilaId.ERP.nome());
        fila.setFigura(FilaId.ERP.figura());
        chamado.setFila(fila);
        lista.add(chamado);




        /*lista.add("Desktops: Computador da secretária quebrado.");
        lista.add("Telefonia: Telefone não funciona.");
        lista.add("Redes: Manutenção no proxy.");
        lista.add("Servidores: Lentidão generalizada.");
        lista.add("Novos Projetos: CRM");
        lista.add("Manutenção Sistema ERP: atualizar versão.");
        lista.add("Novos Projetos: Rede MPLS");
        lista.add("Manutenção Sistema de Vendas: incluir pipeline.");
        lista.add("Manutenção Sistema ERP: erro contábil");
        lista.add("Novos Projetos: Gestão de Orçamento");
        lista.add("Novos Projetos: Big Data");
        lista.add("Manoel de Barros");
        lista.add("Redes: Internet com lentidão");
        lista.add("Novos Projetos: Chatbot");
        lista.add("Desktops: troca de senha");
        lista.add("Desktops: falha no Windows");
        lista.add("Novos Projetos: ITIL V3");
        lista.add("Telefonia: liberar celular");
        lista.add("Telefonia: mover ramal");
        lista.add("Redes: ponto com defeito");
        lista.add("Novos Projetos: ferramenta EMM");*/
        return lista;
    }

    public static ArrayList<Chamado> buscaChamados(String chave) {
        ArrayList<Chamado> chamado = geraListaChamados();
        if (chave == null || chave.length() == 0) {
            return chamado;
        } else {
            ArrayList<Chamado> subLista = new ArrayList<>();
            for (Chamado c : chamado) {
                if (c.getFila().getNome().toUpperCase().contains(chave.toUpperCase())) {
                    subLista.add(c);
                }
            }
            return subLista;
        }

    }

}
