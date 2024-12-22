package sping.context.spel.lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {
    public static void main(String[] args) {
        // Load the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("sping/context/spel/lang/huza.xml");
        Demo d = context.getBean("demo", Demo.class);
        System.out.println(d);

        // Create a SpelExpressionParser instance
        SpelExpressionParser parser = new SpelExpressionParser();
        try {
            // Create an evaluation context
            StandardEvaluationContext evalContext = new StandardEvaluationContext();
            // Parse and evaluate the expression
            Expression expression = parser.parseExpression("44 + 12");
            Integer result = expression.getValue(evalContext, Integer.class);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace(); // Handle exception
        }
    }
}
