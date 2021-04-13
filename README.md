<h1>Desafio Back-End da Meta</h1>

<h3>Este é um projeto desenvolvido Java e Spring Boot 2.4</h3>

<h3>Recursos:</h3>
<ul>
  <li>
    <h4>Validações com Jakarta Bean Validation</h4>
  </li>
  <li>
    <h4>Migração de dados com Flyway Migration</h4>
  </li>
  <li>
    <h4>Utilização do Framework Spring Boot e Spring Data JPA</h4>
  </li>
   <li>
    <h4>Banco de dados Relacional MySql</h4>
  </li>
   <li>
    <h4>DDD - Design orientado a domínio(Repository, Sevice e Controller)</h4>
  </li>
  <li>
    <h4>STS IDE</h4>
  </li>
</ul>

<h3>Endpoints da Aplicação:</h3>
<ul>
  <li>
    <h4>(RequestMapping) /api = uri do Controller Vendedor</h4>
  </li>
  <li>
    <h4>(POST) /cadastrar = salvar um cliente</h4>
  </li>
  <li>
    <h4>(GET) /listar = listando todos</h4>
  </li>
  <li>
    <h4>(GET) /{clienteId} = Buscando um cliente pelo ID</h4>
  </li>
   <li>
    <h4>(DELETE) /{clienteId} = excluindo um cliente pelo seu ID</h4>
  </li>
  
   <li>
    <h4>(PUT) /{clienteId} = alterando um cliente atraves do seu ID</h4>
  </li>
</ul>

<h3>Observações<h3>
  <h4>Este projeto é fruto dos estudso do Spring Boot, como eu fiz<br>
   questão de esclarecer nas entrevista, é uma stack a qual eu não domino<br>
   plenamente, então foi muito prazeroso<br>
   poder mostrar minha capacidade de sair da zona de conforto e estar sempre<br>
   disposto a aprender novas tecnologias.</h4>

<h3>Problemas<h3>
  <h4>Devido aos fatores de gerenciamento de tempo, infelizmente ficaram alguns pontos em aberto,<br>
  os quais relato abaixo:</h4>
  <ul>
  <li>
    <h4>Nao consegui emplementar o endpoint de aniversario com Scheduler,<br>
   pois so consegui fazer de forma em que o lembrete vinha por um fixedDelay(40000) por exemplo,<br>
    e nao pela data de aniversario.</h4>
  </li>
  <li>
    <h4>No cadastro do cliente nao consegui inserir varios endereços, <br>
    contudo, se ele deixar de enserir a mensagem "é obrigatorio ter 1 endereço" sera exibida,<br> 
    junto ao statusCOde 404(Bad request).</h4>
  </li>
  <h3>Conclusão</h3>
  <h4>Espero ter demonstrado um pouco de meus conhecimentos sobre os estudos deste Framework excelente<br>
  que é o Spring Boot, assim agregando valor a mim como profissional e tendo uma possivel chance de mostrar<br>
  ainda mais meus conhecimentos dentro desta empresa. Obrigado!</h4>
</ul>
