<h1>CRUD simples com Java e Sqlite</h1>

> status: <h3>Em construção</h3>

<h2>Tecnologias utilizadas: </h2>
<li>Java</li>
<li>Maven</li>
<li>SQLite</li>
<li>Lombok</li>

<h2>Detalhes de funcionamento:</h2>
<p>O projeto foi criado com o gerenciador de dependência Maven para poder instalar a dependência do SQLite</p>
<p>O banco de dados SQLite está sendo usado em memória graças a sua dependência no Maven</p>
<p>O projeto é dividido por diretórios onde cada um agrupa as funcionalidades específicas, por exemplo: Tem-se a pasta responsável pela conexão com o Banco de dados, tem-se outra pasta responsável por executar as funções de manipulação desses dados e assim por adiante.</p>
<p>Cada classe é responsável por apenas uma única função</p>
<p>Utiliza-se o bloco Try-Catch para tratar possíveis excessões</p>
<p>Em alguns casos, utiliza o bloco Try-With-Resources para garantir que determinados recursos sejam fechados, como também tornar o código mais curto</p>