package com.devops.monolithic.resources;

import java.util.Arrays;
import java.util.List;

import com.devops.monolithic.models.CatalogItem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PodcastCatalogResource {

@RequestMapping("/catalog")
public List<CatalogItem> getCatalog(){

    return Arrays.asList(
            new CatalogItem("School of greatness", "self development", 5),
            new CatalogItem("Security now", "security", 4),
            new CatalogItem("Frontiers of learning", "self devevelopment", 5)
            );
}
}

