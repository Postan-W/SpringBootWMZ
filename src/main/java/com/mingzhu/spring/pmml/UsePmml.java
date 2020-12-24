package com.mingzhu.spring.pmml;

import org.dmg.pmml.PMML;
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.ModelEvaluationContext;
import org.jpmml.evaluator.ModelEvaluatorFactory;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class UsePmml {
    private Evaluator loadPmml() throws FileNotFoundException, JAXBException, SAXException {
        PMML pmml = new PMML();
        InputStream inputStream = null;
        inputStream = new FileInputStream("C:\\Users\\15216\\Desktop\\deeplearing\\pmml_files\\decision_tree1.pmml");

        if(inputStream==null){
            return null;
        }
        InputStream is = inputStream;
        pmml = org.jpmml.model.PMMLUtil.unmarshal(is);
        ModelEvaluatorFactory modelEvaluatorFactory = ModelEvaluatorFactory.newInstance();
        Evaluator evaluator = modelEvaluatorFactory.newModelEvaluator(pmml);
        pmml = null;

        return evaluator;
    }

    private int predict(Evaluator evaluator, Map<String,Double> featuremap){
        
        return 0;
    }

}
