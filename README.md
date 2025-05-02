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

📄 run-cypress.sh

#!/bin/bash

# Navegar até a pasta do projeto
cd Treino_Cypress || { echo "Pasta Treino_Cypress não encontrada"; exit 1; }

# Instalar as dependências do projeto
echo "Instalando dependências..."
npm install

# Abrir o Cypress
echo "Abrindo Cypress na interface gráfica..."
npx cypress open

# (Opcional) Executar os testes diretamente via terminal
# Descomente a linha abaixo se quiser rodar automaticamente os testes sem a interface
# npx cypress run

📂 Estrutura dos testes
Os testes estão localizados em:

cypress/
└── e2e/
    └── actions.cy.js  # arquivo com todos os testes

✅ Funcionalidades cobertas
 Preenchimento e envio de formulários

 Validação de campos com should

 Clique, duplo clique e botão direito

 Foco e blur em campos de input

 Digitação com {enter}, {selectall}, {backspace}, etc.

 Limpeza de campos (.clear())

 Seleção de checkboxes e radio buttons

 Clique em coordenadas específicas (canvas)

 Modificação de sliders (input range)

📸 Evidências
Você pode adicionar prints de tela ou vídeos gerados pelo Cypress aqui.

✍️ Autor
Marcia Magalhães
🔗 LinkedIn
💻 GitHub

Este projeto é apenas para fins de aprendizado. A página de testes pertence à equipe Cypress.io.
