package customers;

import utils.RequestGrade;


public class Customer {

    private final RequestGrade gradeRequest;
    private final boolean hasCompanyContract;

    public Customer(RequestGrade gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean hasCompanyContract() {
        return hasCompanyContract;
    }

    public RequestGrade getGradeRequest() {
        return gradeRequest;
    }
}
