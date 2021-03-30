package eu.patternengine.controller;

import eu.patternengine.model.VulnerabilityMeasurementPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.patternengine.model.Product;
import eu.patternengine.service.PatternEngineService;

@RestController
public class PatternEngineController {

	private final PatternEngineService patternEngineService;

	@Autowired
	public PatternEngineController(PatternEngineService patternEngineService) {
		this.patternEngineService = patternEngineService;
	}

//	@RequestMapping(value = "/getDiscount", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
//	public Product getQuestions(@RequestBody Product product) {
//
//		patternEngineService.getProductDiscount(product);
//		return product;
//	}

	@RequestMapping(value = "/getVulnerabilityMeasurementPolicy", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public VulnerabilityMeasurementPolicy getVulnerabilityMeasurementPolicy(@RequestBody VulnerabilityMeasurementPolicy policy) {

		patternEngineService.getVulnerabilityMeasurementPolicy(policy);
		return policy;
	}
	
}
