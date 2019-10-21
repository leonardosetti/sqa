describe('Pick a Language', function () {
    it('select language', function () {
        const mtf = cy.visit('https://mtf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard');
        cy.get('div=[login-selectLanguage]').click();
        cy.get('select#login-selectLanguage').contans ('fr').click();
    })
            .wait(5000)
            .should('contain.text', 'Français');
    });
