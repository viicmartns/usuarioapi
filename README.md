API de Cadastro de Usuários

API REST desenvolvida em **Java + Spring Boot** para cadastro e gerenciamento de usuários.

Projeto criado com foco em **aprendizado de backend**, boas práticas e estrutura profissional.

---

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Git & GitHub
- Postman

---

##  Funcionalidades

- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Atualizar usuário
- Deletar usuário
- Validação de dados
- Tratamento global de erros

---

##  Endpoints

### ➕ Criar usuário
**POST** `/usuarios`

```json
{
  "nome": "João Silva",
  "email": "joao@email.com"
}
