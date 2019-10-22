describe('Challenge Qustion', function () {
    it('Answer the correct challenge question', function () {
        cy.get('#challenge-question-question-txt-label').then((_label) => {
            if (_label.text('Quel est le deuxième prénom de votre mère? ')) {
                cy.get('#challengeQuestionAnswer').type('name')
            }
            else {
            }
        });
    });
})
