package controllers;

import models.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.OrganizationRepository;

import java.util.List;

@RestController
@RequestMapping(name = "/v1")
public class OrganizationController {

    // TODO: should create OrganizationService, in order to remove any logic from controller class
    @Autowired
    OrganizationRepository organizationRepository;

    @RequestMapping(name = "organizations")
    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }

    @RequestMapping(name = "organizations/{organizationId}")
    public Organization getById(@PathVariable Long organizationId) {
        return organizationRepository.getOne(organizationId);
    }

    @RequestMapping(name = "organizations/{organizationName}")
    public Organization getById(@PathVariable String organizationName) {
        return organizationRepository.findByName(organizationName);
    }
}
