Feature: Cocktail Ordering

  As Romeo, I want to offer a drink to Juliette so that we can discuss together (and maybe more).
  
  Scenario: Empty the box  
  Given User wants to empty the box 
  When  The box is not empty 
  Then  Empty the box


  Scenario: Take the yougest hourse from the box 
  Given User wants to take the yougest hourse from the box
  When  the box is filled
  Then  get the yougest hourse
