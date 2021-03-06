Feature: Validate service response code

  @Case1_ServiceResponse
  Scenario Outline: Validate that the service response code and message are as expected
    When configure the request to the service with endpoint <endpoint> and token <token>
    Then validate that the status code <code> is correct

    Examples:
      |endpoint|token|code|
      |https://gorest.co.in/public-api/users/5|?access-token=ttWaYh_-ZPFVsYfyMguJj22wvaBpsKWqMEsJ|200|