Feature: Validate service response code

  @Case1_ServiceResponse
  Scenario Outline: Validate that the service response code and message are as expected
    Given configure the request to the service with endpoint <endpoint> and token <token>
    When  the service runs correctly with method <token>
    Then validate that the code <code> and message <message> are correct

    Examples:
      |endpoint|token|code|message                           |
      |https://gorest.co.in/public-api||200 |OK. Everything worked as expected.|