package Generic_utility;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class ITransform implements IAnnotationTransformer{
	
public void transform(ITestAnnotation annotation)
{
	annotation.setRetryAnalyzer(Generic_utility.RetryImplementation.class);
}
}
