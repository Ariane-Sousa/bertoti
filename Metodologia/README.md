<h1 align="center">Portfólio dos Projetos Integradores</h1>

Trabalho de conclusão de curso na forma de um Portfólio de Aprendizagens, desenvolvido com base nos Projetos Integradores que envolvem APIs. Este trabalho é submetido à Faculdade de Tecnologia de São José dos Campos, como parte fundamental para cumprir os critérios estabelecidos na conquista do título de Tecnólogo em Banco de Dados.

### Sobre mim

Meu nome é Ariane Cristine Alves de Sousa, uma entusiasta do mundo da tecnologia em constante evolução. Estou trabalhando duro para ser uma boa desenvolvedora de software. As minhas habilidades abrangem uma grande variedade de tecnologias fundamentais, e é com grande satisfação que aponto minha proficiência em linguagens e ferramentas fundamentais para o desenvolvimento. Com domínio em linguagens como Java e Spring Boot, tenho a capacidade de criar soluções sólidas e escaláveis. Além disso, minha familiaridade com MySQL reflete minha habilidade de gerenciar eficientemente dados, enquanto minha maestria em JavaScript me permite criar interfaces dinâmicas e envolventes. 

Minha abordagem persistente na resolução de problemas complexos me diferencia, e estou confiante em minha capacidade de contribuir significativamente para qualquer equipe de desenvolvimento. Meu compromisso contínuo com a aprendizagem assegura que estou sempre atualizada com as mais recentes tendências tecnológicas, e estou ansiosa para moldar um futuro inovador e bem-sucedido na indústria.

## Meus Projetos
### Dom Rock
3° Semestre - 01/2023

Parceiro Acadêmico: Dom Rock
<p align="center"><img src="https://github.com/Ariane-Sousa/bertoti/assets/108765052/bbd9f4c7-56bf-4563-9da0-16977ffb6ac8" widht="20%"></img>

## Empresa parceira

A Dom Rock é uma empresa que oferece soluções utilizando tecnologia de dados para ampliar resultados em marketing, vendas, distribuição, logística, operações, engenharia e finanças.
Utilizando modelos matemáticos e algoritmos baseados em aprendizado de máquina que endereçam duas soluções sendo Nxt.Demand com quatro produtos – Vox, Sales&Distribution, Marketing&Planning, Pricing – e Nxt.Operations com dois produtos – Matching&Risk e Optimization.


## 💻 Nossa proposta

A empresa Dom Rock enfrentava a tarefa de padronizar os arquivos de predição de vendas de seus clientes, fornecidos no formato CSV. Reconhecendo a necessidade de otimizar esse processo, a empresa buscava desenvolver uma aplicação web que facilitasse a inserção e padronização desses dados, resultando em uma redução significativa do tempo dedicado a essa tarefa.

Neste semestre, o nosso grupo está propondo uma solução abrangente para a empresa. O desafio central envolve lidar de maneira eficaz com o histórico de movimentação de produtos, englobando tanto as informações de vendas quanto de estoque. Além disso, a solução visa integrar a predição de faturamento, realizada por um algoritmo de inteligência artificial já existente. Complementarmente, a aplicação será capaz de incorporar os dados provenientes da equipe de vendas, relacionados ao planejamento futuro da empresa.

Diante dessa complexidade, nossa proposta visa criar uma plataforma que harmonize e simplifique esses processos, proporcionando à Dom Rock uma gestão mais eficiente e informada de suas operações comerciais.


## Jornada do usuário 

<h3 align="center">Administrador</h3>
<p align="center"><img src="https://github.com/Ariane-Sousa/bertoti/assets/108765052/9531f904-1ece-4ff3-901a-6a47299b344b" widht="20%"></img>

<h3 align="center"> Vendedor </h3>
<p align="center"><img src="https://github.com/Ariane-Sousa/bertoti/assets/108765052/0e703c34-f28e-45df-94eb-c607575095e5" widht="20%"></img>

## Modelagem

<h3 align="center">Modelagem Lógico</h3>
<p align="center"><img src="https://github.com/Ariane-Sousa/bertoti/assets/108765052/a498c64f-808e-421b-8f27-548bb546585f" widht="20%"></img>

## Contribuições Individuais
<details>
  <summary><b>Front-End: Personalização e criação de gráficos</b></summary>
  <br>
  <p>Desenvolvi funções geradoras de gráficos no Front-end do nosso projeto que realizam uma consulta no nosso banco de dados, buscando informações dos vendedores, suas vendas e metas. De acordo com esses dados, eram gerados gráficos, o exemplo que trouxe abaixo, gerou um gráfico dos dez melhores vendedores, comparando por metas, e dos dez produtos mais vendidos. 
  </p>
  
  ```javascript
  
function generateVendedoresChart() {
  fetch("http://localhost:8080/venda/topVendedores")
    .then(function (response) {
      return response.json();
    })
    .then(function (data) {
      var dados = data.map(function (item) {
        return { y: item.nome_usuario, a: item.total_vendido, nome: item.nome_completo };
      });

      var config = {
        data: dados,
        xkey: "y",
        ykeys: "a",
        labels: ["Total"],
        fillOpacity: 0.6,
        hideHover: "auto",
        behaveLikeLine: true,
        resize: true,
        pointFillColors: ["#ffffff"],
        pointStrokeColors: ["black"],
        lineColors: ["#005eff"],
        xLabelAngle: 45,
      };

      config.element = "stackedVendedores";
      config.stacked = true;
      Morris.Bar(config);
    })
    .catch(function (error) {
      console.log(error);
    });
}


function generateProdutosChart() {
  fetch("http://localhost:8080/produto/topProdutos")
    .then(function (response) {
      return response.json();
    })
    .then(function (data) {
      var dados = data.map(function (item) {
        return { y: item.nome_produto, a: item.total_vendido };
      });

      var config = {
        data: dados,
        xkey: "y",
        ykeys: "a",
        labels: ["Total"],
        fillOpacity: 0.6,
        hideHover: "auto",
        behaveLikeLine: true,
        resize: true,
        pointFillColors: ["#ffffff"],
        pointStrokeColors: ["black"],
        lineColors: ["#005eff"],
        xLabelAngle: 45,
      };

      config.element = "stackedProdutos";
      config.stacked = true;
      Morris.Bar(config);
    })
    .catch(function (error) {
      console.log(error);
    });
}
  
  ```
  ![Dados-ADMIN](https://github.com/Ariane-Sousa/bertoti/assets/108765052/ed7fd5fe-27ad-48f9-afc8-6d3db8f6c5ce)

  <p><i>No código fornecido, há duas funções, generateVendedoresChart e generateProdutosChart, que utilizam a função fetch para realizar requisições a endpoints locais (topVendedores e topProdutos). Esses endpoints retornam dados sobre os principais vendedores e produtos, respectivamente. Após receber a resposta em formato JSON, os dados são mapeados e transformados para um formato adequado para a biblioteca Morris.js, que é utilizada para gerar gráficos de barras empilhadas. Os gráficos resultantes são exibidos em elementos HTML específicos, como "stackedVendedores" e "stackedProdutos". Em caso de erro durante as requisições, os detalhes são registrados no console.</i></p>
  <br>
</details>
<details>
  <summary><b>Back-end: Personalização e criação de endpoints</b></summary>
  <br>
  <p>Dsenvolvi endpoints que realizam uma consulta no nosso banco de dados, buscando informações dos vendedores, suas vendas e metas. De acordo com esses dados, meus endpoints me retornavam as informações dos vendedores que mais atingiram as metas, e dos produtos que foram mais vendidos.</p>
  
  ```java
  
  @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/acima-meta")
    public ResponseEntity<?> getVendedoresAcimaMeta() {
        List<Venda> vendedoresAcimaMeta = repository.findVendedoresAcimaMeta();
        return ResponseEntity.ok(vendedoresAcimaMeta);
    }

  ```

 
  ```java
  
  @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/topProdutos")
    public List<Map<String, Object>> getTopProdutos() {
        List<Map<String, Object>> topProdutos = new ArrayList<>();
        String sql = "SELECT p.nome_produto, " +
                "SUM(v.quant_vendida) AS total_vendido " +
                "FROM produto p " +
                "JOIN venda v ON p.cod_produto = v.fk_produto_cod_produto " +
                "GROUP BY p.nome_produto, v.fk_produto_cod_produto " +
                "ORDER BY total_vendido DESC " +
                "LIMIT 10";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> produto = new HashMap<>();
            produto.put("nome_produto", ((String) row.get("nome_produto")).trim());
            produto.put("total_vendido", row.get("total_vendido"));
            topProdutos.add(produto);
        }
        return topProdutos;
    }

  ```
  
  <p><i>No primeiro trecho de código em Java, é definido um controlador de endpoint com a anotação @GetMapping("/acima-meta"). Este endpoint, ao ser acessado, retorna uma resposta HTTP contendo uma lista de vendedores que estão acima da meta de vendas. Esses dados são obtidos através da chamada do método findVendedoresAcimaMeta no repositório associado. A resposta é encapsulada em um objeto ResponseEntity e retorna um status HTTP 200 (OK) juntamente com a lista de vendedores ou um status de erro caso ocorra alguma exceção.
No segundo trecho de código, também em Java, é definido outro controlador de endpoint com a anotação @GetMapping("/topProdutos"). Esse endpoint realiza uma consulta SQL utilizando o JdbcTemplate para obter os top 10 produtos com base na quantidade total vendida. A resposta é uma lista de mapas, onde cada mapa contém informações sobre um produto, incluindo o nome do produto e a quantidade total vendida. Esses dados são processados e formatados antes de serem retornados como resultado do endpoint. A anotação @CrossOrigin permite solicitações de qualquer origem, facilitando a integração com front-ends em diferentes domínios.</i></p>
  <br>
</details>
<details>
  <summary><b>Refatoramento de todas as nossas páginas</b></summary>
  <br>
  <p>Implementei uma mudança de estilos, conversado e avaliado pelo grupo, na última sprint, todas as páginas passaram por refatoramento de CSS.</p>
</details>

## Tecnologias Utilizadas

JavaScript: linguagem de programação para o desenvolvimento front-end.

Java: linguagem de programação para o desenvolvimento back-end.

PostgreeSQL: utilizado para armazenar e gerenciar dados na aplicação.

Figma: utilizado para o desenvolvimento e prototipação das wireframes.

## Lições Aprendidas

<p align="justify"></p>

<h3>Hard Skills</h3>
<details>
  <summary><b>Clique para ver a lista de hard skills</b></summary>
  
  <p1>Desenvolvimento Front-end e Back-end: Adquiri habilidades de programação em JavaScript e Java, permitindo-me criar interfaces interativas (front-end) e desenvolver a lógica empresarial (back-end) para sistemas complexos.</p1>
  
  <p1>Banco de Dados: Aprendi design de bancos de dados, SQL e gestão de dados ao utilizar o PostgreSQL para armazenamento e manipulação de informações.</p1>
  
  <p1>Prototipagem e Design de Interface: Ao trabalhar com o Figma para desenvolvimento e prototipagem, desenvolvi uma compreensão sólida de usabilidade, layout e design centrado no usuário.</p1>
</details>

<h3>Soft Skills</h3>
<details>
  <summary><b>Clique para ver a lista de soft skills</b></summary>
  
  <p1>Proatividade: Enfrentar desafios como a padronização de dados demonstrou minha capacidade de propor e implementar soluções, evidenciando uma abordagem proativa para otimizar processos.</p1>
  
  <p1>Comunicação Assertiva: Ao explicar claramente problemas, soluções e jornadas do usuário, desenvolvi habilidades de comunicação eficaz, tornando informações técnicas acessíveis a diversos públicos.</p1>
  
  <p1>Trabalho em Equipe: A colaboração em projetos acadêmicos evidenciou minha habilidade de trabalhar em equipe, essencial em ambientes profissionais de desenvolvimento de software</p1>
  
  <p1>Resolução de Problemas: Enfrentar desafios complexos e criar soluções abrangentes para necessidades empresariais desenvolveu minhas habilidades de resolução de problemas, cruciais para abordar questões técnicas e de negócios.</p1>
</details>






