# Aula de Spring

## Para configurar o PostgreSQL com Docker

### Crie o arquivo `.env` baseado no `.env.example`

**1.** Use o `.env.example` como molde e insira os dados necessários

**2.** Logo após execute o comando para rodar o seu container Docker (Lembra de fechar ele depois)

```bash
docker run --name bookrent --env-file .env -d -p 5432:5432 -v bookrentdata:/var/lib/postgresql/data postgres:latest
```
#### Se já tiver rodado alguma vez e o container tiver no seu PC, para iniciar bastar executar isso:

```bash
docker start bookrent
```

Aqui está uma versão mais genérica e focada em fins didáticos, sem muitos detalhes:

---

# **Sistema de Aluguel de Livros (Projeto Didático)**

## **Visão Geral**

Este é um projeto de exemplo desenvolvido com fins didáticos, para demonstrar a aplicação de conceitos fundamentais do Spring Framework. Através deste sistema de aluguel de livros, são abordados diversos tópicos importantes, como:

- **Spring Boot**: Simplificação da configuração e execução de aplicações Java.
- **Spring MVC**: Estrutura para criação de APIs RESTful.
- **Spring Data JPA**: Integração com banco de dados para persistência de dados.
- **Spring Security**: Implementação de segurança e autenticação.
- **Spring Actuator**: Monitoramento e métricas da aplicação.

Este projeto visa proporcionar uma compreensão prática e eficiente de como utilizar o Spring Framework para desenvolver aplicações robustas e escaláveis.

## **Conceitos Aplicados**

Durante o desenvolvimento deste projeto, foram abordados os seguintes conceitos:

- **Injeção de Dependência (DI)** e gestão de beans no Spring.
- **Criação de APIs** com Spring MVC para expor funcionalidades do sistema.
- **Acesso a Dados** utilizando Spring Data JPA e configuração de banco de dados.
- **Segurança** em aplicações web com Spring Security.
- **Monitoramento** da aplicação utilizando Spring Actuator.

## **Objetivo**

O principal objetivo deste projeto é proporcionar uma base sólida de aprendizado para quem deseja entender os fundamentos do Spring Framework e como aplicá-los em um contexto real. Ao final deste projeto, espera-se que o aluno tenha adquirido experiência prática no desenvolvimento de aplicações Java modernas com Spring.

## **Instalação**

1. Clone o repositório:

   ```bash
   git clone 
   ```

2. Acesse o diretório do projeto:

   ```bash
   cd bookrent
   ```

3. Para rodar a aplicação, utilize o Maven:

   ```bash
   mvn spring-boot:run
   ```

A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

## **Considerações Finais**

Este projeto foi criado com o propósito de ensinar e praticar os conceitos principais do Spring Framework, sem a intenção de ser uma solução finalizada para produção. Sinta-se à vontade para expandir e personalizar o projeto com novas funcionalidades e melhorias!

--- 

Essa versão está mais direta e voltada para quem quer entender os conceitos que o projeto aborda, sem muitos detalhes sobre o funcionamento interno. Se precisar de mais alguma coisa, só avisar!