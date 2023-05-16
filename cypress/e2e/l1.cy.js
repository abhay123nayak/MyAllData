describe('login', () => {
    it('user should be able to log in', () => {
        cy.visit('https://experimental-plan.adtrac.media/login?returnUrl=%2Fpublisher%2Fsites')
        cy.login()
      })


    })