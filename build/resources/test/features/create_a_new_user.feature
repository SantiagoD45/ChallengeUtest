@createNewCount

Feature: New Account On UTest
  I as user,
  I want to create a new register to get my account and be able to access on UTest platform

  @succesful
  Scenario: successful account creation
    Given user enters the UTest platform
    When user registers their data and their devices
    |strName   |strLastName|strEmail                 |strMonth    |strDay|strYear|strCity   |strState|strZIP    |strCountry|strOS |strVersion |strLanguage  |strMobile  |strModel |strOsMobile  |strPassword    |strConfirmPassword|
    |Santiago  |Diaz Pinzon|santiagodiaz640@gmail.com|January     |7     |1999   |Barcelona  |Murcia  |08001     |Spain    |Windows |10       |Spanish      |Xiaomi     |Redmi 9A |Android 11   |Choucair2021*  |Choucair2021*     |

    Then user sees the button called
    |strNameButton |
    |Complete Setup|

