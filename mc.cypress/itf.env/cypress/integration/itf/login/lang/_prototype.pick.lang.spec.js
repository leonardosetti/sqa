/// <reference types="Cypress" />

describe('Pick up a Language', function () {
    it('Land to Stage2 login page', function () {
        cy
            .clearCookies()
            .visit('https://stage1.sdg2.mastercard.com')

    });
    it('select French language before login steps', function () {
        cy.
        get('select#langSelector').then(function ($select) {
                $select.val('fr').select().click({
                    force: true
                })

            })
            .focus('#loginUserID')
            .wait(2000)
    });
})