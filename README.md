# 🚀 Estudo de API: Autenticação e Integração com Swagger

Este projeto foi desenvolvido como um exercício prático para compreender como o **Swagger (OpenAPI 3.0)** funciona como uma ferramenta de documentação e como integrar essas especificações em um backend real utilizando **Java** e **Spring Boot**.

O foco principal é a simulação de um sistema de gerenciamento de contas, autenticação de usuários e acompanhamento de indicadores de crescimento.

---

## 📌 Objetivos do Projeto
* **Documentação Primeiro (API First):** Criação de contratos YAML para definir endpoints antes da implementação.
* **Simulação de Login:** Implementação de um fluxo de autenticação via `POST` retornando tokens JWT fictícios.
* **Gestão de Contas (CRUD):** Endpoints para criação, listagem, atualização e exclusão de usuários.
* **Relatórios de Progresso:** Monitoramento de dados de crescimento (peso, altura) vinculados a uma conta.
* **Tratamento de Erros:** Configuração de respostas HTTP apropriadas (200, 201, 202, 204, 400, 401, 404, 500).

---

## 🛠️ Tecnologias Utilizadas
* **Java 17+**
* **Spring Boot 3.x** (Spring Web)
* **SpringDoc OpenAPI** (Para gerar o Swagger UI localmente)
* **Maven** (Gerenciador de dependências)
* **IntelliJ IDEA Community Edition**

---

## 📂 Estrutura de Endpoints

### Autenticação e Contas
| Método | Endpoint | Descrição | Requisito |
| :--- | :--- | :--- | :--- |
| `POST` | `/login` | Realiza autenticação | JSON (email/password) |
| `GET` | `/accounts` | Lista todas as contas | Token no Header |
| `POST` | `/accounts` | Cria uma nova conta | Token no Header + JSON |
| `GET` | `/accounts/{id}` | Busca conta por ID | Token no Header + ID na URL |
| `PUT` | `/accounts/{id}` | Atualiza uma conta | Token no Header + JSON |
| `DELETE` | `/accounts/{id}` | Remove uma conta | Token no Header + ID na URL |

### Progresso e Desempenho
| Método | Endpoint | Descrição | Requisito |
| :--- | :--- | :--- | :--- |
| `GET` | `/progress` | Lista todos os progressos | Token no Header |
| `POST` | `/progress` | Cria novo registro de crescimento | Token no Header + JSON |
| `GET` | `/accounts/{email}/progress` | Relatório por e-mail | Token no Header + Email |
| `DELETE` | `/progress/{id}` | Remove um registro | Token no Header + ID |

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [git@github.com:MarciaMagaX/swagger_api_basico.git](git@github.com:MarciaMagaX/swagger_api_basico.git)
Abra no IntelliJ:

Vá em File > Open e selecione a pasta do projeto.

Aguarde o Maven baixar as dependências (pom.xml).

Execute a aplicação:

Localize a classe principal com a anotação @SpringBootApplication.

Clique no botão Run (Play verde).

Acesse a Documentação Interativa:

Com o projeto rodando, abra o navegador em: http://localhost:8080/swagger-ui/index.html

🛡️ Segurança e Boas Práticas
Proteção de Dados: O sistema foi configurado para não retornar senhas nos corpos das respostas (body_response), seguindo recomendações de segurança da OWASP.

Headers: Uso de headers customizados (token) para simular a validação de sessões JWT.

Status Codes: Uso rigoroso dos códigos de status HTTP para representar o sucesso ou falha das operações.

⭐ Projeto desenvolvido para fins didáticos por Marcia Xavier.
