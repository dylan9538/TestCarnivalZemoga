$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/BuscarVuelo.feature");
formatter.feature({
  "line": 1,
  "name": "Busqueda de Vuelo",
  "description": "",
  "id": "busqueda-de-vuelo",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4753325098,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Como usuario requiero realizar una busqueda personalziada de vuelo",
  "description": "",
  "id": "busqueda-de-vuelo;como-usuario-requiero-realizar-una-busqueda-personalziada-de-vuelo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Se ingresa al navegador servicio de avianca",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Se seleccionan los parametros del vuelo",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "se selecciona el vuelo",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "verificar que se soliciten los campos adicionales",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarVueloSteps.ingresoAvianca()"
});
formatter.result({
  "duration": 8036117325,
  "status": "passed"
});
formatter.match({
  "location": "BuscarVueloSteps.ingresarusuario()"
});
formatter.result({
  "duration": 7448821741,
  "status": "passed"
});
formatter.match({
  "location": "BuscarVueloSteps.seleccionaVuelo()"
});
formatter.result({
  "duration": 80744,
  "status": "passed"
});
formatter.match({
  "location": "BuscarVueloSteps.verificarVuelo()"
});
formatter.result({
  "duration": 26036966,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat avianca.prjoject.AviancaPrueba.BuscarVueloSteps.verificarVuelo(BuscarVueloSteps.java:56)\n\tat ✽.Then verificar que se soliciten los campos adicionales(src/test/resources/features/BuscarVuelo.feature:6)\n",
  "status": "failed"
});
});