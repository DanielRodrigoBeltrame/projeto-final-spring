 # Projeto Cadastro de Habilidades

   Constitui em uma API REST com banco de dados usando java e Spring Boot. Para entrega do módulo de Spring do Devs2Blu.

# Tema
  Criado um cadastro de habilidades onde é possívél cadastrar as habilidades desejadas e vincular com uma pessoa informando o nívél da mesma.

# Diagrama de classe
 ![Skill](https://github.com/DanielRodrigoBeltrame/projeto-final-spring/assets/93795810/08c729da-2e4a-4aed-ba46-c396d083ce29)

# Requisito funcionais
  
  ## Cadastro de Pessoas:

    O sistema deve permitir que os usuários cadastrem pessoas.
    Os campos obrigatórios para o cadastro de pessoa incluem: nome, data de nascimento, telefone e profissão.
    O sistema deve validar os campos obrigatórios e formatos de dados.
  
  ## Cadastro de Habilidades:
  
    O sistema deve permitir que os usuários cadastrem tipos de habilidades.
    Os campos obrigatórios para o cadastro de habilidades incluem: descrição e observação.
    
  ## Relacionamento Pessoa-Habilidade:
  
    O sistema deve permitir que os usuários associem habilidades a pessoas.
    O usuário deve ser capaz de escolher o tipo de habilidade a ser associado.
    Os campos obrigatórios para o relacionamento incluem: nível de habilidade, observação e data da habilidade.
 
  ## Consulta de Pessoas:
  
    O sistema deve fornecer uma função de consulta que permita aos usuários buscar informações sobre uma pessoa.
    Os usuários podem pesquisar por nome da pessoa ou outros critérios.
    A consulta deve exibir informações pessoais, incluindo nome, data de nascimento, telefone e profissão, além de listar as habilidades associadas a essa pessoa.
  ## Consulta de Habilidades:
  
    O sistema deve fornecer uma função de consulta que permita aos usuários buscar informações sobre tipos de habilidades.
    Os usuários podem pesquisar por descrição da habilidade ou outros critérios.
    A consulta deve exibir informações sobre a habilidade, incluindo descrição e observação.
    
  ## Edição e Exclusão:
  
    Os usuários autorizados devem poder editar ou excluir informações de pessoas e habilidades.
    As operações de edição devem permitir a atualização de todos os campos relevantes.
    As operações de exclusão devem remover a pessoa ou a habilidade selecionada, com confirmação do usuário.  
