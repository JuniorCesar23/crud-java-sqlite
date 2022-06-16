<h1>CRUD simples com Java e Sqlite</h1>

> status: <h3>Em construção</h3>

<h2>Tecnologias utilizadas: </h2>
<li>Java</li>
<li>Maven</li>
<li>SQLite</li>
<li>Lombok</li>

<h2>Especificações:</h2>
<li>O projeto foi criado com o gerenciador de dependência Maven para poder instalar a dependência do SQLite</li>
<li>O banco de dados SQLite está sendo usado em memória graças a sua dependência no Maven</li>
<li>O projeto é dividido por diretórios onde cada um agrupa as funcionalidades específicas, por exemplo: Tem-se a pasta responsável pela conexão com o Banco de dados, tem-se outra pasta responsável por executar as funções de manipulação desses dados e assim por adiante.</li>
<li>Cada classe é responsável por apenas uma única função</li>
<li>Todas as classes são estáticas e precisam receber a instância do "Connection" para iniciar a conexão.</li>
<li>Utiliza-se o bloco Try-Catch para tratar possíveis excessões</li>
<li>Em alguns casos, utiliza o bloco Try-With-Resources para garantir que determinados recursos sejam fechados, como também tornar o código mais curto</li>
<li>Não pode haver repetição de E-mails. O programa irá retornar erro caso encontre valores duplicados.</li>
<li></li>

<h2>Detalhes de funcionamento:</h2>
<li>Para conectar-se ao banco de dados, basta instanciar a classe responsável para isso <strong>"connections/IniciarConexao".</strong></li>
<li><strong>IMPORTANTE!</strong> Lembre-se de sempre chamar a classe para fechar a conexão com o banco assim que a aplicação, como um tudo, for finalizada <strong>"connections/FecharConexao".</strong></li>
<li>Os dados são inseridos pelo usuário e lidos pelo Scanner.</li>
<li>Existem tratamento nas classes para identificarem caso um E-mail seja repetido (na classe "InserirDados") e caso alguma modificação realmente foi concretizada ou não (nas classes "AtualizarDados" e "DeletarDados").</li>
<li> </li>