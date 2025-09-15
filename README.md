#  DsCommerce 

Aplicação backend de uma loja virtual com foco total em **segurança web real**, utilizando autenticação JWT, controle de acesso por perfis e proteção de endpoints. Desenvolvido como parte da formação **DevSuperior**, com aprimoramentos para simular uma API segura e profissional.

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,postgres" />
  </a>
</p>
<p align="center">
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Security-JWT%20%7C%20Bcrypt-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" />
</p>

## Visão Geral do projeto

O **DsCommerce** simula uma loja online completa com usuários, produtos e pedidos. O principal foco do projeto é a **implementação segura de autenticação e autorização**, com regras reais de acesso e rotas protegidas por perfis (`ADMIN`, `CLIENT`). Senhas são armazenadas com segurança e tokens JWT são utilizados para controlar sessões e proteger os endpoints.


##  Principais Funcionalidades de Segurança

-  Autenticação via login e geração de **JWT**
-  Proteção de rotas privadas com autorização baseada em token
-  Controle de acesso por perfis (`ADMIN`, `CLIENT`)
-  Bloqueio de endpoints para usuários não autorizados
-  Validação automática de expiração de token
-  Senhas criptografadas com **BCrypt**

##  Regras de Negócio Aplicadas

- Apenas usuários autenticados podem acessar endpoints protegidos ✔️
- Endpoints administrativos são acessíveis somente com perfil `ADMIN` ✔️
- Clientes comuns têm acesso restrito às funcionalidades permitidas ✔️
- Senhas nunca são expostas (armazenamento seguro com hash) ✔️
- JWTs possuem tempo de expiração e são validados a cada requisição ✔️

##  Aprendizados Técnicos

- Como estruturar autenticação JWT na prática ✔️
- Implementação de **Spring Security** com roles e authorities ✔️
- Criação de filtros de autenticação e autorização personalizados ✔️
- Controle detalhado de perfis e permissões ✔️
- Boas práticas de segurança em APIs REST ✔️
- Organização do projeto com separação clara entre camadas (config, auth, domain, controller, etc.) ✔️

---

## 🧱 Modelo Conceitual

![Diagrama do Modelo de Domínio](https://github.com/gustavokowallski/DsCommerce/blob/main/images/Captura%20de%20tela%202025-06-19%20231153.png)

## 🧰 Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| **Java 21 + Spring Boot 3.5.4** | Backend moderno e robusto |
| **Spring Security** | Segurança e controle de acesso |
| **JWT + BCrypt** | Autenticação stateless + criptografia |
| **PostgreSQL + JPA** | Persistência relacional eficiente |
| **Maven** | Gerenciamento de dependências |
| **Postman** | Testes de API |

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos

- JDK 21+
- Maven instalado (ou use `./mvnw`)


**Passos:**

1.  **Clonar o repositório:**
    ```bash
    git clone https://github.com/gustavokowallski/DsCommerce.git

    cd DsCommerce
   
    ./mvnw spring-boot:run
    ```
    *O projeto será executado em `http://localhost:8080` por padrão.*

#### **Testando a API com Postman / Ferramenta de sua preferência:**
* A API estará disponível para requisições após a execução. Você pode utilizar ferramentas como **Postman**, Insomnia ou cURL para interagir com os endpoints.
* **Coleção Postman:** Clique no botão abaixo para importar e testar os endpoints da API diretamente no Postman:
    [![Run in Postman](https://run.pstmn.io/button.svg)](https://nawszera.postman.co/workspace/nawszera's-Workspace~ea6779bc-203d-4c77-8395-e87a3f1091fa/collection/45108000-f6768588-1047-4d8a-9f85-5a899d48076a?action=share&creator=45108000&active-environment=45108000-ee357952-f911-405a-9337-066beac8e080)


---
📬 Conecte-se comigo 
  <a href="https://www.linkedin.com/in/gustavokowalski/" target="_blank">LinkedIn</a> | 
  <a href="mailto:kkowalskigustavo@gmail.com">Email</a>


