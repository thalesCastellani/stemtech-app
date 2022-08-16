# StemTech-APP
MVP do aplicativo Stem Tech

Fluxo de funcionamento do aplicativo:

1a) Tela Main: Nesta tela o usuário tem 3 opções

![image](https://user-images.githubusercontent.com/62717114/184757884-e7995ff1-d513-4453-bd4f-ef5a7c01a51a.png)

1 - Clicar no botão entrar (aqui está hard coded a logica para o Username ser admin e a Senha 123, caso entre os valores default, consegue logar no aplicativo, caso deixe algum input em branco ou entre com algum valor errado, receberá uma mensagem dizendo: "Username ou senha inválidos"

2 - Caso não tenha cadastro, clicar em Cadastrar onde será direcionado para a tela de cadastro

3 - Clicar em Esqueceu sua senha? Esta tela ainda está em construção, onde será mostrado um pop-up informando

Caso o usuário clique em Cadastrar

2a) Tela de cadastro: 

![image](https://user-images.githubusercontent.com/62717114/184969888-fdb00f2b-37ff-40e0-a11f-3d78feec3e63.png)

1 - Nesta tela o usuário tem a opção de: Preencher as informações de cadastro e clicar no botão cadastrar, o aplicativo está configurado com o banco de dados SQLite, desta forma, ao clicar em Cadastrar, os dados do usuário serão salvos no banco de dados e ele será redirecionado para a tela Home

Caso o usuário clique no botão ENTRAR

3a) Também é redirecionado para a tela Home: 
  
4a) Tela Home: Nesta tela o usuário tem 3 opções

![image](https://user-images.githubusercontent.com/62717114/184758519-f076fb3f-e19f-48d9-905c-155ba3691148.png)

1 - Clicar no botão assistir treinamentos onde será levado para a funcionalidade principal do app, assistir treinamentos online

2 - Clicar no botão listar usuários: nesta opção, será mostrado para o usuario, os dados que ele preencheu na tela de cadastro (onde serão recuperados do banco de dados SQLite)

3 - Clicar no botão Sair, para voltar para a tela de login

Caso o usuário clique no botão de LISTAR USUARIOS

5a) Tela que mostra os dados do usuário:

![image](https://user-images.githubusercontent.com/62717114/184970717-33bdb630-dfc2-4051-b94e-fe83b46a736b.png)
  
Caso o usuário clique no botão de treinamentos

6a) Tela de treinamentos:

![image](https://user-images.githubusercontent.com/62717114/184758716-a8c8128a-0df7-486a-8064-f98477df52ff.png)

1 - Ao clicar no botão de treinamentos, o usuário será levado para a tela do app onde consta a integraçao com o VideoPlayer, dessa forma, consegue dar play no vídeo e pausá-lo também, tendo acesso ao conteúdo.

Caso o usuário clique no botão de SAIR

7a) Retorna para a tela de Login (MainActivity):

![image](https://user-images.githubusercontent.com/62717114/184971702-4df297ff-87a0-429c-bd3f-1a997fd024cf.png)

