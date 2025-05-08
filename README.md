# 🎥 Spring React Mongo

Este projeto é uma aplicação full stack desenvolvida com **Java Spring Boot**, **React.js** e **MongoDB**. Ele permite gerenciar filmes, exibir trailers e adicionar reviews.

---

## 📚 Tecnologias Utilizadas

- **Backend:** Java 21 + Spring Boot
- **Frontend:** React.js 19.1.0
- **Banco de Dados:** MongoDB (local ou via MongoDB Atlas)
- **Outras Bibliotecas:**
  - **Frontend:** Bootstrap, React Router, Material-UI, FontAwesome, React Player
  - **Backend:** Spring Data MongoDB, Spring Web, Lombok

---

## 🗂 Estrutura do Projeto

```
spring-react-mongo/
├── spring-react-mongo/   # Backend (Spring Boot)
└── frontend/             # Frontend (React.js)
```

---

## ⚙️ Pré-requisitos

Certifique-se de ter instalado:

- **Java 21** ou superior
- **Maven**
- **Node.js 16** ou superior
- **MongoDB** (local ou via MongoDB Atlas)

---

## 🔧 Como Rodar o Projeto

### Backend (Spring Boot)

1. Configure as variáveis de ambiente no arquivo `.env`:
   ```env
   MONGO_DATABASE=<nome_do_banco>
   MONGO_USER=<usuario>
   MONGO_PASSWORD=<senha>
   MONGO_CLUSTER=<cluster>
   ```

2. Inicie o backend:
   ```bash
   cd spring-react-mongo
   ./mvnw spring-boot:run
   ```

> A API será iniciada em: `http://localhost:8080`

---

### Frontend (React.js)

1. Instale as dependências:
   ```bash
   cd frontend/MovieClient/movie-gold-v1
   npm install
   ```

2. Inicie o frontend:
   ```bash
   npm start
   ```

> A aplicação estará disponível em: `http://localhost:3000`

---

## 🔗 Integração Frontend ↔️ Backend

Certifique-se de que o React está configurado para consumir a API do Spring Boot. O arquivo `axiosConfig.js` já está configurado com a URL base:

```js
// filepath: /workspaces/spring-react-mongo/frontend/MovieClient/movie-gold-v1/src/api/axiosConfig.js
export default axios.create({
  baseURL: 'http://localhost:8080',
  headers: {
    'Content-Type': 'application/json',
  }
});
```

---

## 🧠 Funcionalidades

- **Listagem de Filmes:** Exibe uma lista de filmes com informações como título, poster e trailer.
- **Exibição de Trailers:** Permite assistir trailers diretamente no navegador.
- **Adição de Reviews:** Usuários podem adicionar reviews para os filmes.
- **Integração com MongoDB:** Armazena filmes e reviews no banco de dados.

---

## 🗂 Estrutura do Backend

- **Controllers:** Gerenciam as rotas da API.
  - [`MovieController`](spring-react-mongo/src/main/java/org/will/spring_react_mongo/MovieController.java)
  - [`ReviewController`](spring-react-mongo/src/main/java/org/will/spring_react_mongo/ReviewController.java)
- **Services:** Contêm a lógica de negócios.
  - [`MovieService`](spring-react-mongo/src/main/java/org/will/spring_react_mongo/MovieService.java)
  - [`ReviewService`](spring-react-mongo/src/main/java/org/will/spring_react_mongo/ReviewService.java)
- **Repositórios:** Gerenciam a interação com o MongoDB.
  - [`MovieRepository`](spring-react-mongo/src/main/java/org/will/spring_react_mongo/MovieRepository.java)
  - [`ReviewRepository`](spring-react-mongo/src/main/java/org/will/spring_react_mongo/ReviewRepository.java)

---

## 🗂 Estrutura do Frontend

- **Componentes Principais:**
  - [`Header`](frontend/MovieClient/movie-gold-v1/src/components/header/Header.js): Cabeçalho da aplicação.
  - [`Hero`](frontend/MovieClient/movie-gold-v1/src/components/hero/Hero.js): Exibe os filmes em destaque.
  - [`Trailer`](frontend/MovieClient/movie-gold-v1/src/components/trailer/Trailer.js): Player de trailers.
  - [`Reviews`](frontend/MovieClient/movie-gold-v1/src/components/reviews/Reviews.js): Gerencia as reviews dos filmes.

---

## 📌 Observações

- Este projeto foi baseado no curso ["Full Stack Development with Java Spring Boot, React, and MongoDB – Full Course"](https://www.youtube.com/watch?v=5PdEmeopJVQ) do canal [freeCodeCamp.org](https://www.youtube.com/@freecodecamp).
- Sinta-se à vontade para contribuir, estudar ou adaptar o projeto conforme necessário!

---

## 📺 Link da Aula

[Assista aqui no YouTube](https://www.youtube.com/watch?v=5PdEmeopJVQ)

---

## 📜 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
