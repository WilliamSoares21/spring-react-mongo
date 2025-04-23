# 🚀 Spring React Mongo

Projeto desenvolvido durante o curso ["Full Stack Development with Java Spring Boot, React, and MongoDB – Full Course"](https://www.youtube.com/watch?v=5PdEmeopJVQ) do canal [freeCodeCamp.org](https://www.youtube.com/@freecodecamp).

---

## 📚 Tecnologias Utilizadas

- **Backend:** Java + Spring Boot
- **Frontend:** React.js
- **Banco de Dados:** MongoDB

---

## 🗂 Estrutura do Projeto

```
spring-react-mongo/
├── backend/     # Aplicação Java com Spring Boot
└── frontend/    # Aplicação React
```

---

## ⚙️ Pré-requisitos

Certifique-se de ter instalado:

- Java 17 ou superior
- Maven
- Node.js 16 ou superior
- MongoDB (local ou via MongoDB Atlas)

---

## 🔧 Como Rodar o Projeto

### Backend (Spring Boot)

```bash
cd backend
./mvnw spring-boot:run
```

> A API será iniciada em: `http://localhost:8080`

### Frontend (React)

```bash
cd frontend
npm install
npm start
```

> A aplicação estará disponível em: `http://localhost:3000`

---

## 🔗 Integração Frontend ↔️ Backend

Certifique-se de que o React esteja configurado para consumir a API do Spring Boot. Exemplo de variável no arquivo `.env`:

```
REACT_APP_API_BASE_URL=http://localhost:8080
```

---

## 🧠 Sobre o Curso

Este projeto faz parte de um curso completo de desenvolvimento full stack, que aborda:

- Criação de APIs RESTful com Java e Spring Boot
- Integração com banco de dados MongoDB
- Desenvolvimento de interface moderna com React
- Integração entre frontend e backend

---

## 📺 Link da Aula

[Assista aqui no YouTube](https://www.youtube.com/watch?v=5PdEmeopJVQ)

---

## 📌 Observação

Este repositório tem fins educacionais. Sinta-se à vontade para contribuir, estudar ou adaptar o projeto conforme necessário!
