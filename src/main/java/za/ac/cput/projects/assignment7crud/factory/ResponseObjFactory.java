package za.ac.cput.projects.assignment7crud.factory;

import za.ac.cput.projects.assignment7crud.domains.ResponseObject;

public class ResponseObjFactory {
    public static ResponseObject buildGenericResponseObj(String responseCode, String responseDescription) {
        return new ResponseObject(responseCode, responseDescription);
    }
}
