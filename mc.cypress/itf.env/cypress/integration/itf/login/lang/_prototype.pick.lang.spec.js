/// <reference types="Cypress" />

describe('Pick up a Language', function () {
    it ('Land to ITF login page', function(){

        cy
.visit('https://itf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard')
.wait(5000)
    })
    it('select French language before login steps', function () {
        cy.get('select#langSelector').then(function ($select) {
            $select.val('fr').select().click({force:true})
            .focus('')
            ;
            
        })
            .wait(5000)
    });
})