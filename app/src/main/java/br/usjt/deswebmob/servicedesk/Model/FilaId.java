package br.usjt.deswebmob.servicedesk.Model;

/**
 * Created by arqdsis on 21/03/2018.
 */

public enum FilaId {
    PROJETO(1,"Novos Projetos","ic_projetos"),
    REDES(5, "Redes","ic_redes"),
    SERVIDORES(4, "Servidores","ic_servidores"),
    DESKTOPS(7, "Desktops","ic_desktops"),
    TELEFONIA(6,"Telefonia","ic_telefonia"),
    ERP(3,"Manutenção de sistema ERP","ic_erp"),
    VENDAS(2,"Manutenção de sitema de Vendas","ic_vendas");

    private final int id;
    private final String nome, figura;

    FilaId(int num, String s, String f){
        id=num;
        nome=s;
        figura=f;



    }

    public int id(){
        return id;

    }
    public String nome(){
        return nome;

    }
    public String figura(){
        return figura;

    }

}
