package org.jbpm.contrib.demoservices;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public class RequestB {

    private String callbackUrl;
    
    private String callbackMethod;

    private String nameFromA;

    private String surname;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getNameFromA() {
        return nameFromA;
    }

    public void setNameFromA(String nameFromA) {
        this.nameFromA = nameFromA;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCallbackMethod() {
        return callbackMethod;
    }

    public void setCallbackMethod(String callbackMethod) {
        this.callbackMethod = callbackMethod;
    }
    
    
}