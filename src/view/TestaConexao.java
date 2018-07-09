package view;

import model.Contato;
import persistence.ContatoDao;

import java.text.SimpleDateFormat;
import java.util.List;

public class TestaConexao {

    public static void main(String[] args){ //select where id example
        ContatoDao dao = new ContatoDao();
        Contato dd = new Contato();
        long l = 1;
        dd.setId(l);
        dd = dao.getContatoById(dd);
        System.out.println(dd.getEmail());
    }

    /*public static void main(String[] args) { //select * example
        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.getLista();
        for (Contato contato : contatos) {
            System.out.println("Nome:	" + contato.getNome());
            System.out.println("Email:	" + contato.getEmail());
            System.out.println("Endereço:	" + contato.getEndereco());
            SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
            String data = formatData.format(contato.getDataNascimento().getTime());
            System.out.println("Data	de	Nascimento:	" +
                     data + "\n");
        }
    }*/

    /*public static void main(String args[]) throws SQLException { //insert example
        //	pronto	para	gravar
        Contato contato	=	new	Contato();
        contato.setNome("Caelum");
        contato.setEmail("Contato@caelum.com.br");
        contato.setEndereco("R.	Vergueiro	3185	cj57");
        contato.setDataNascimento(Calendar.getInstance());
        //	grave	nessa	conexão!!!
        ContatoDao dao	=	new	ContatoDao();
        //	método	elegante
        dao.insert(contato);
        System.out.println("Gravado!");
    }*/
}
