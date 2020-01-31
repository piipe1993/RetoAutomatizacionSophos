# RetoAutomatizacion_Sophos
Reto Automatización

# Introduction 
TODO: Validaciones proyecto:
•	Validación adición correcta de producto deseado al carrito de compras
•	Validación de datos al consumir servicio rest


# Build and Test

**El proyecto tiene la siguiente estructura:**

- features:ValidateProductAdded.feature - ValidateServiceResponse.feature, con los pasos del casos de prueba.
- StepDefinitions: ValidateServiceResponseStepDefinition - ValidateProductAddedStepDefinition, con la definici�n de los pasos de cada una de las tareas. 
- Runners:ValidateServiceResponseRunner - ValidateProductAddedRunner , para ejecutar las pruebas
- Userinterfaces:TootusHomePage, para el mapeo de los objetos usados en la prueba
- tasks: SendMethod, Search, OpenTuttosWebSite, GoToCart, ConsumeService, AddProduct. Con cada una de las tareas de los pasos del caso de prueba.
- Questions:ValidateProductSearchedOnCart , para tomar el nombre del producto agregado al carrito y validar que sea el mismo producto buscado y validar data del request al consumir servicio 


# Escenarios 

•	@TestCase1
•	@Case1_ServiceResponse

