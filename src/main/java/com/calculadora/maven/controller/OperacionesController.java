package com.calculadora.maven.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.maven.service.OperacionesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "/", tags = "Gestor de operaciones")
@RequestMapping("/api")
public class OperacionesController {

	@Autowired
	private OperacionesService operacionesService;

	@ApiOperation(value = "Metodo para realizar sumas", notes = "Retorna el valor de la operacion")

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), @ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unathorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found") }) 
	@GetMapping(value = "/operaciones/{operador1}/{operando}/{operador2}", headers = "Accept=application/json")
	public ResponseEntity<BigDecimal> operaciones(
			@ApiParam(name = "operador1", required = true, value = "Operador 1", example = "1") @PathVariable String operador1,
			@ApiParam(name = "operando", required = true, value = "Operando", example = "+") @PathVariable String operando,
			@ApiParam(name = "operador2", required = true, value = "Operador 2", example = "2") @PathVariable String operador2) {
		BigDecimal result = operacionesService.operacion(operador1, operando, operador2);	
		return new ResponseEntity<BigDecimal>(result,HttpStatus.OK);
	}

}