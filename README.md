# Calculadora de Frete com Feign Client e ViaCEP

Aplicação Java construída com o framework Spring Boot que tem como objetivo calcular o frete usando a API do ViaCEP através do Feign Client.

## Índice

- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Como rodar localmente](#como-rodar-localmente)
- [Como usar](#como-usar)
- [Contribuição](#contribuição)

## Funcionalidades

- Consulta de endereço através do CEP utilizando a API do ViaCEP.
- Cálculo do frete baseado nas informações do endereço.

## Tecnologias

- Java
- Spring Boot
- Feign Client
- API ViaCEP

## Como rodar localmente

1. **Clone o repositório**

   ```bash
   git clone https://github.com/AmandaMFurtado/Projeto-Siga-Bem.git
   cd Projeto-Siga-Bem
   
2. **Compile e rode a aplicação**

Usando Maven
   ```bash
  mvn clean install
  mvn spring-boot:run
 ```
Ou, se você empacotou sua aplicação como um JAR:
   ```bash
 java -jar target/nome-do-seu-jar.jar
 ```
3. **Acesso Local**
   O servidor iniciará, e a aplicação estará disponível em `http://localhost:8080`.
   
## Como usar

- Para consultar um endereço, faça um GET request para /endereco/{cep}.
- Para calcular o frete, faça um POST request para /calcular-frete com os detalhes necessários.

## Contribuição

Se você encontrou um bug ou gostaria de adicionar uma nova funcionalidade, sinta-se à vontade para criar um issue ou um pull request.

---

Desenvolvido com ♥ por [Amanda Marques](https://github.com/AmandaMFurtado)
