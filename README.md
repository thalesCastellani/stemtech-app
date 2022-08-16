# StemTech-APP
MVP do aplicativo Stem Tech

Fluxo de funcionamento do aplicativo:

1a) Tela Main: Nesta tela o usuário tem 3 opções

![image](https://user-images.githubusercontent.com/62717114/184757884-e7995ff1-d513-4453-bd4f-ef5a7c01a51a.png)

1 - Clicar no botão entrar (aqui está hard coded a logica para o Username ser admin e a Senha 123, caso entre os valores default, consegue logar no aplicativo, caso deixe algum input em branco ou entre com algum valor errado, receberá uma mensagem dizendo: "Username ou senha inválidos"
2 - Caso não tenha cadastro, clicar em Cadastrar onde será direcionado para a tela de cadastro
3 - Clicar em Esqueceu sua senha? Esta tela ainda está em construção, onde será mostrado um pop-up informando
  
2a) Tela Home: Nesta tela o usuário tem 3 opções

![image](https://user-images.githubusercontent.com/62717114/184758519-f076fb3f-e19f-48d9-905c-155ba3691148.png)

1 - Clicar no botão assistir treinamentos onde será levado para a funcionalidade principal do app, assistir treinamentos online
2 - Clicar no botão listar usuários: nesta opção, será mostrado para o usuario, os dados que ele preencheu na tela de cadastro (onde serão recuperados do banco de dados SQLite)
3 - Clicar no botão Sair, para voltar para a tela de login
  
3a) Tela de cadastro: 

![image](https://user-images.githubusercontent.com/62717114/184758092-6547ccdb-6e4c-45aa-9a47-1a81f8dc4a6f.png)

1 - Nesta tela o usuário tem a opção de: Preencher as informações de cadastro e clicar no botão cadastrar, o aplicativo está configurado com o banco de dados SQLite, desta forma, ao clicar em Cadastrar, os dados do usuário serão salvos no banco de dados e ele será redirecionado para a tela Home

![image](https://user-images.githubusercontent.com/62717114/184758346-281d5e37-0ba6-411f-b488-2f0cf48f363e.png)
  
4a) Tela de treinamentos:

![image](https://user-images.githubusercontent.com/62717114/184758716-a8c8128a-0df7-486a-8064-f98477df52ff.png)

1 - Ao clicar no botão de treinamentos, o usuário será levado para a tela do app onde consta a integraçao com o VideoPlayer, dessa forma, consegue dar play no vídeo e pausá-lo também, tenho acesso ao conteúdo.
