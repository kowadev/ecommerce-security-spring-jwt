# 🛒 E-Commerce DS Commerce - Backend Seguro

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1-brightgreen)
![Spring Security](https://img.shields.io/badge/Security-JWT%20%7C%20Bcrypt-orange)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue)
![License](https://img.shields.io/badge/License-MIT-blue.svg)

---

> 📢 Este projeto faz parte da formação DevSuperior e representa uma loja virtual robusta. Aqui, mostro minha habilidade em implementar segurança de ponta a ponta com Spring Security.

---

## 🔎 Sobre o Projeto

O **DS Commerce** é uma aplicação web backend que simula uma loja virtual completa. O sistema permite criar e gerenciar produtos, pedidos e usuários com diferentes níveis de acesso.

Foi desenvolvido com foco em boas práticas de arquitetura, segurança e organização do código, utilizando tecnologias modernas como Spring Boot, JPA e JWT.

---

## 🔐 Minha Entrega: Segurança Total com JWT + Roles

Minha principal entrega neste projeto foi a **implementação completa da segurança da API**, incluindo:

- **Autenticação via API REST**
  - Endpoint de login
  - Geração e validação de **JWTs** (JSON Web Tokens)

- **Autorização baseada em tokens**
  - Proteção de endpoints privados
  - Validação automática de token expirado

- **Controle de acesso por perfis**
  - Perfis distintos (`admin`, `cliente`)
  - Controle refinado de permissões

- **Proteção de rotas**
  - Bloqueio de acesso para usuários não autenticados
  - Regras baseadas no perfil de usuário

- **Segurança de senhas**
  - Armazenamento com **BCrypt**

---

## 🧠 Conquistas Técnicas

- 🔐 Segurança robusta com Spring Security
- 🎯 Controle de acesso via JWT + roles
- 🧪 Testes práticos com Postman
- 🧼 Código limpo e organizado

---

## 🧱 Modelo Conceitual

![Diagrama do Modelo de Domínio](https://github.com/gustavokowallski/DsCommerce/blob/main/images/Captura%20de%20tela%202025-06-19%20231153.png)

---

## 🧰 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Security  
- JWT  
- Bcrypt  
- Spring Data JPA / Hibernate  
- Maven  
- API REST  
- PostgreSQL  
- Consultas SQL

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos

- JDK 21+
- Maven instalado (ou use `./mvnw`)

### Passos

```bash
# Clone o repositório
git clone https://github.com/gustavokowallski/DsCommerce.git
cd DsCommerce
```
# Execute o projeto
./mvnw spring-boot:run

**Passos:**
1.  **Clonar o repositório:**
    ```bash
    git clone [https://github.com/gustavokowallski/DsCommerce.git](https://github.com/gustavokowallski/DsCommerce.git)
    ```
2.  **Entrar na pasta do projeto:**
    ```bash
    cd DsCommerce
    ```
3.  **Executar o projeto:**
    ```bash
    ./mvnw spring-boot:run
    ```
    *O projeto será executado em `http://localhost:8080` por padrão.*

#### **Testando a API com Postman / Ferramenta de sua preferência:**
* A API estará disponível para requisições após a execução. Você pode utilizar ferramentas como **Postman**, Insomnia ou cURL para interagir com os endpoints.
* **Coleção Postman:** Clique no botão abaixo para importar e testar os endpoints da API diretamente no Postman:
    [![Run in Postman](https://run.pstmn.io/button.svg)](https://nawszera.postman.co/workspace/nawszera's-Workspace~ea6779bc-203d-4c77-8395-e87a3f1091fa/collection/45108000-f6768588-1047-4d8a-9f85-5a899d48076a?action=share&creator=45108000&active-environment=45108000-ee357952-f911-405a-9337-066beac8e080)


---

### **Autor**

**Gustavo Eiji Kowalski Hatada**
[![LinkedIn Badge](https://img.shields.io/badge/-Gustavo%20Kowalski-blue?style=flat&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/gustavo-kowalski-94234b322/)

---
