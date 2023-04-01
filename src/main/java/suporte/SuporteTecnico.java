package suporte;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SuporteTecnico {
    private HashMap<String, String> bancoSolucao;
    private ArrayList<String> respostaPadrao;
    private static SecureRandom random = new SecureRandom();

    public SuporteTecnico() {
        this.bancoSolucao = new HashMap<>();
        this.respostaPadrao = new ArrayList<>();

        inicializarCamposDefinidos();
    }

    private void inicializarCamposDefinidos (){
        //Preenchendo os dados do banco solução
        this.bancoSolucao.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\r\n do seu processador deve resolver o problema de performance. Você tem algum\r\n problema com o software?");
        this.bancoSolucao.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\r\n executando algum outro processo em paralelo?");
        this.bancoSolucao.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\r\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\r\n com mais detalhes?");
        this.bancoSolucao.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\r\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\r\n com mais detalhes?");
        this.bancoSolucao.put("windows", "Este é um problema do sistema operacional Windows. Por favor,\r\nentre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        this.bancoSolucao.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor,\r\nentre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        this.bancoSolucao.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\r\n e comparou todas as características do nosso software com outras ofertas de mercado?");
        this.bancoSolucao.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\r\n que farão todo o trabalho para você. Você já leu as instruções\r\n de instalação?");
        this.bancoSolucao.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\r\n a memória requerida é 1.5 giga byte. Você deverá adquirir\r\n mais memória. Mais alguma coisa que deseja saber?");
        this.bancoSolucao.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\r\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\r\n mais preciso?");
        this.bancoSolucao.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\r\n no seu sistema. Diga-me sobre sua configuração.");
        this.bancoSolucao.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\r\n no seu sistema. Diga-me sobre sua configuração.");

        //Preenchendo os dados das respostas padrão
        this.respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        this.respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este.\r\nQual é a sua configuração de sistema?");
        this.respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        this.respostaPadrao.add("Preciso de maiores informações a respeito.");
        this.respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
        this.respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        this.respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\r\n que poderia detalhar melhor este problema?");
        this.respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        this.respostaPadrao.add("Você poderia explicar melhor?");
    }

    public String buscarSolucao (HashSet<String> palavrasChave) {
        //Testa se alguma palavra
        for (String palavraChave : palavrasChave)
            for (String chaveSolucao : this.bancoSolucao.keySet())
                if (palavraChave.equals(chaveSolucao))
                    return this.bancoSolucao.get(chaveSolucao);

        return buscarSolucaoAleatoria();
    }

    public String buscarSolucaoAleatoria () {
        return respostaPadrao.get(random.nextInt((this.respostaPadrao.size() - 1)));
    }

    /*GETTERS*/
    public HashMap<String, String> getBancoSolucao() {
        return bancoSolucao;
    }

    public ArrayList<String> getRespostaPadrao() {
        return respostaPadrao;
    }

    /*SETTERS*/
    public void setBancoSolucao(HashMap<String, String> bancoSolucao) {
        this.bancoSolucao = bancoSolucao;
    }

    public void setRespostaPadrao(ArrayList<String> respostaPadrao) {
        this.respostaPadrao = respostaPadrao;
    }
}
