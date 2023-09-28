package com.phoneLogic;

import com.phoneLogic.AparelhoTelefonico.AparelhoTelefonico;
import com.phoneLogic.browser.Navegador;

import java.util.Scanner;


public class iPhone implements Navegador, AparelhoTelefonico {
    protected String usuario;
    protected String senha;

    public iPhone(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    protected boolean autenticar(String confirmacaoSenha){
        if(this.senha.equals(confirmacaoSenha)){
            System.out.println("Usuario autenticado com sucesso!");
            return true;
        }else {
            System.out.println("Senha incorreta, tente novamente!");
            return false;
        }
    }

    @Override
    public void exibirPagina(String link) {
        System.out.println("Exibindo- " + link);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina(String link) {
        System.out.println("Pagina - " + link + " atualizada!");
    }

    public String getUsuario() {
        return usuario;
    }


    public String getSenha() {
        return senha;
    }


    @Override
    public String toString() {
        return "MusicLogic.iPhone{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }


    @Override
    public void ligar(String telefone,String senha) {
        if (autenticar(senha)){
            System.out.println("Ligando para - " + telefone);
        }

    }

    @Override
    public void atender(String telefone) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chamada recebida - " + telefone + "\n1 - Atender\n2 - Rejeitar");
        short escolha = scan.nextShort();
        if (escolha == 1){
            System.out.println("Em chamada");
        }else if (escolha == 2){
            System.out.println("Chamada rejeitada");
        }else{
            System.out.println("Chamada não atendida a tempo");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }
}
