# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário
    Eu como novo usuário
    Quero me cadastrar na aplicação
    Para efetuar compras

    @cadastro_sucesso
    Cenário: Registrar um novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo a mensagem de cadastro realizado com sucesso