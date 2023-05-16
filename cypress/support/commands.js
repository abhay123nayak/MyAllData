Cypress.Commands.add('login', () => {
    cy.fixture('example.json').then((logindata) => {
      let config = logindata['loginCredentials']
      cy.get('#mat-mdc-form-field-label-0').type(config['email'])
      cy.get('input#mat-input-1').type(config['password'])
      cy.get('.mdc-button__label').click()
    })
  })