package fr.cci.ProjetJava.SimVille.Projet.controller;

import fr.cci.ProjetJava.SimVille.Projet.model.Terrain;
import fr.cci.ProjetJava.SimVille.Projet.model.Ville;
import fr.cci.ProjetJava.SimVille.Projet.model.repository.TerrainRepository;
import fr.cci.ProjetJava.SimVille.Projet.model.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/terrain")
public class TerrainController {
    @Autowired

    private TerrainRepository terrainRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewTerrain(@RequestParam String terrainImgUrl, @RequestParam Integer terrainType,
                         @RequestParam String terrainNomShort, @RequestParam String terrainNom)
    {
        Terrain t = new Terrain();
        t.setTerrainImgUrl(terrainImgUrl);
        t.setTerrainType(terrainType);
        t.setTerrainNomShort(terrainNomShort);
        t.setTerrainNom(terrainNom);
        terrainRepository.save(t);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Terrain> getAllUsers() {
        return terrainRepository.findAll();
    }
}
