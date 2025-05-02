# Testes de Ações com Cypress

Este projeto contém testes automatizados desenvolvidos com **Cypress** para praticar ações interativas como cliques, preenchimento de formulários, foco, blur, uso de teclas especiais, entre outros. Os testes foram aplicados na página oficial de demonstração do Cypress: [example.cypress.io/commands/actions](https://example.cypress.io/commands/actions).

## 🧪 Objetivo

Explorar e validar todas as funcionalidades interativas da página de demonstração, cobrindo comandos de:

- Preenchimento de formulários
- Cliques (simples, duplo, botão direito)
- Foco e blur
- Teclas especiais e delays
- Seleção de texto e limpeza de campos
- Checkboxes e radio buttons
- Cliques em coordenadas específicas
- Interações com elementos gráficos (canvas, sliders)

## 🛠 Tecnologias Utilizadas

- [Cypress](https://www.cypress.io/) v12+
- Node.js (versão recomendada: 16+)
- VS Code ou outro editor de sua preferência

## 🚀 Como executar os testes

1. Clone este repositório:

```bash
git clone https://github.com/MarciaMagaX/Treino_Cypress.git
```

2. Acesse a pasta do projeto:

```bash
cd Treino_Cypress
```

3. Instale as dependências:

```bash
npm install
```

4. Abra o Cypress:

```bash
npx cypress open
```

5. Execute os testes a partir da interface gráfica ou via terminal com:

```bash
npx cypress run
```

## 📂 Estrutura dos testes

Os testes estão localizados em:

```
cypress/
└── e2e/
    └── actions.cy.js  # arquivo com todos os testes
```

## ✅ Funcionalidades cobertas

- [x] Preenchimento e envio de formulários
- [x] Validação de campos com `should`
- [x] Clique, duplo clique e botão direito
- [x] Foco e blur em campos de input
- [x] Digitação com `{enter}`, `{selectall}`, `{backspace}`, etc.
- [x] Limpeza de campos (`.clear()`)
- [x] Seleção de checkboxes e radio buttons
- [x] Clique em coordenadas específicas (canvas)
- [x] Modificação de sliders (input range)

## 📸 Evidências

Você pode adicionar prints de tela ou vídeos gerados pelo Cypress aqui.

---

## ✍️ Autor

**[Marcia Magalhães](https://www.linkedin.com/in/marciamagax/)**  
🔗 [Perfil no LinkedIn](https://www.linkedin.com/in/marciamagax/)  
💻 [GitHub](https://github.com/MarciaMagaX)

---

Este projeto é apenas para fins de aprendizado. A página de testes pertence à equipe Cypress.io.
