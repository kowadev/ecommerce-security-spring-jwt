# DsCommerce 

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen)
![Spring Security](https://img.shields.io/badge/Security-JWT%20%7C%20Bcrypt-orange)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue)
![License](https://img.shields.io/badge/License-MIT-blue.svg)

---


> 🚀 Projeto da formação DevSuperior com foco em segurança web real, autenticação JWT, controle de acesso por perfis e proteção de endpoints. Aqui demonstro minha capacidade de construir APIs REST seguras, robustas e escaláveis.

---

## 📌 Visão Geral

O **DS Commerce** simula uma loja virtual completa com usuários, produtos e pedidos. A principal entrega é o sistema de segurança robusto, com autenticação e autorização baseadas em JWT e roles, proteção de rotas, e armazenamento seguro de senhas.

---

## 🔐 Principais Funcionalidades de Segurança

- 🔒 Autenticação via login e geração de **JWT**
- ✅ Proteção de rotas privadas com autorização baseada em token
- 🛂 Controle de acesso por perfis (`ADMIN`, `CLIENT`)
- ⛔ Bloqueio de endpoints para usuários não autorizados
- 🔁 Validação automática de expiração de token
- 🧊 Senhas criptografadas com **BCrypt**

---

## 🧠 Regras de Negócio Aplicadas

- Apenas usuários autenticados podem acessar endpoints protegidos
- Endpoints administrativos são acessíveis somente com perfil `ADMIN`
- Clientes comuns têm acesso restrito às funcionalidades permitidas
- Senhas nunca são expostas (armazenamento seguro com hash)
- JWTs possuem tempo de expiração e são validados a cada requisição

---
## 📚 Aprendizados Técnicos

- Como estruturar autenticação JWT na prática
- Implementação de **Spring Security** com roles e authorities
- Criação de filtros de autenticação e autorização personalizados
- Controle detalhado de perfis e permissões
- Boas práticas de segurança em APIs REST
- Organização do projeto com separação clara entre camadas (config, auth, domain, controller, etc.)

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
- PostgreSQL  

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos

- JDK 21+
- Maven instalado (ou use `./mvnw`)


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
[![LinkedIn Badge](https://img.shields.io/badge/-Gustavo%20Kowalski-blue?style=flat&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/gustavokowalski/)

---
