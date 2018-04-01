package incorporated.az.recruitme.web.controllers;


import com.jayway.jsonpath.internal.Path;
import incorporated.az.recruitme.domain.Address;
import incorporated.az.recruitme.web.repositories.AddressesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Api(value = "users", description = "Endpoint for user management")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/adresses")
public class RestController {

    @Autowired
    private AddressesRepository addressesRepository;

    @ApiOperation(value = "returns adresses lists")
    @GetMapping("/adresses")
    public List<Address> retrieveAllStudents() {
        return addressesRepository.findAll();
    }

}