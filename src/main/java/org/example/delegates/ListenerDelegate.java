package org.example.delegates;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.Expression;

public class ListenerDelegate implements ExecutionListener {
    Expression inj1;
    Expression inj2;
    String inj1val;
    String wish;

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        inj1val = (String) inj1.getValue(execution);
        wish = (String) inj2.getValue(execution);

        System.out.println("*** inj1val:" + inj1val);
        System.out.println("*** wish:" + wish);
    }
}
