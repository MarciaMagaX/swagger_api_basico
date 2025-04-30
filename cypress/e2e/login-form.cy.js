describe('Formulário de login', () => {
    it('Deve preencher e enviar o formulário com sucesso', () => {
    cy.visit('https://example.cypress.io/commands/actions')
    cy.wait(4000)
    cy.get('#email1').type('teste@qa.com').should('have.value', 'teste@qa.com') 
    cy.wait(4000)
    cy.get('#password1').type('12345')
    cy.wait(4000)
    cy.get('.action-form > .btn').click()
    cy.get('#fullName1').type('Andrea Santos')
    cy.get('#description').type('Solicitação de cadastro enviada para validação')
    cy.get('#couponCode1').type('FRETEGRATIS')
   
    })
    })