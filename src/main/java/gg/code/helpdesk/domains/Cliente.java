package gg.code.helpdesk.domains;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }
}
