package eu.patternengine.service;

import eu.patternengine.model.VulnerabilityMeasurementPolicy;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.patternengine.model.Product;

@Service
public class PatternEngineService {

	private final KieContainer kieContainer;

	@Autowired
	public PatternEngineService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

//	public Product getProductDiscount(Product product) {
//		//get the stateful session
//		KieSession kieSession = kieContainer.newKieSession("rulesSession");
//		kieSession.insert(product);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return product;
//	}

	public VulnerabilityMeasurementPolicy getVulnerabilityMeasurementPolicy(VulnerabilityMeasurementPolicy policy) {
		//get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(policy);
		kieSession.fireAllRules();
		kieSession.dispose();
		return policy;
	}
}
