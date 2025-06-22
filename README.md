# E-Commerce DS Commerce - Backend Seguro

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/gustavokowallski/DsCommerce/blob/main/LICENSE) 

---

### **Sobre o Projeto DS Commerce**

O **DS Commerce** é uma aplicação web Backend que simula uma loja virtual robusta. Este projeto foi originalmente desenvolvido durante a formação **Java Spring Professional** organizada pela **DevSuperior**.

Ele permite a criação e gerenciamento de produtos e pedidos, o controle de categorias e a gestão de usuários com diferentes níveis de acesso. O projeto foi construído com foco em boas práticas de desenvolvimento e na utilização de tecnologias modernas de back-end.

---

### **Minha Contribuição: Implementação de Segurança da API**

Partindo de uma base com as classes e modelos de domínio já implementadas via JPA, minha principal contribuição neste projeto foi a **implementação completa da segurança da API e do controle de acessos**. Isso incluiu:

* **Autenticação de Usuário via API REST:**
    * Desenvolvimento de um endpoint de login para a autenticação de usuários.
    * Geração e validação de **JSON Web Tokens (JWT)** para gerenciar as sessões de usuário após o login bem-sucedido.
* **Controle de Acesso Baseado em Tokens (Autorização):**
    * Utilização dos tokens JWT para autorizar requisições subsequentes à API, garantindo a integridade e validade dos tokens.
* **Proteção de Endpoints da API:**
    * Definição de regras de acesso para endpoints específicos, assegurando que apenas usuários autenticados e autorizados possam acessá-los.
    * Implementação de bloqueio automático para requisições sem tokens válidos ou com tokens expirados.
* **Autorização por Papéis (Roles):**
    * Criação de um sistema de autorização que controla o acesso a recursos com base nos **papéis (roles)** atribuídos aos usuários, permitindo permissões distintas para diferentes perfis (ex: administrador, cliente).
* **Segurança no Armazenamento de Credenciais:**
    * Configuração para o armazenamento e verificação seguros de senhas, utilizando o algoritmo de hashing **Bcrypt** para proteger as credenciais dos usuários.

---

### **Modelo Conceitual / Diagrama de Domínio**

![Diagrama do Modelo de Domínio do DS Commerce](https://github.com/gustavokowallski/DsCommerce/blob/main/images/Captura%20de%20tela%202025-06-19%20231153.png)


---

### **Tecnologias Utilizadas**

#### **Back-end**
* Java 21
* Spring Boot
* **Spring Security**
* **JSON Web Token (JWT)**
* **Bcrypt**
* JPA / Hibernate
* Maven
* Consultas SQL 
* API REST

#### **Front-end**
* Não utilizado neste projeto (foco exclusivo no Back-end da API).

---

### **Como Executar o Projeto**

#### **Back-end**

**Pré-requisitos:**
* Java Development Kit (JDK) **21+** instalado.
* Maven (já vem integrado com o wrapper `./mvnw`).

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
* **(Opcional):** Se você configurou Swagger UI/OpenAPI, adicione o link aqui (ex: `http://localhost:8080/swagger-ui.html`).

---

### **Autor**

**Gustavo Eiji Kowalski Hatada**
[![LinkedIn Badge](https://img.shields.io/badge/-Gustavo%20Kowalski-blue?style=flat&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/gustavo-kowalski-94234b322/)

---
