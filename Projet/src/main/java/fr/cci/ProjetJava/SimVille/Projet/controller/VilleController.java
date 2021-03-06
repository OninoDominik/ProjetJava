package fr.cci.ProjetJava.SimVille.Projet.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import fr.cci.ProjetJava.SimVille.Projet.model.Ville;
import fr.cci.ProjetJava.SimVille.Projet.model.repository.VilleRepository;

@Controller
@RequestMapping(path="/ville")
public class VilleController {
    @Autowired
    private VilleRepository villeRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewVille(
            @RequestParam String villeNom,
            @RequestParam Integer villeLong,
            @RequestParam Integer villeLarg,
            @RequestParam float villeValeurImmoMin,
            @RequestParam float villeValeurImmoMax,
            @RequestParam float rivDMax,
            @RequestParam float rivPMax,
            @RequestParam float forDMax,
            @RequestParam float forPMax,
            @RequestParam float eclDMax,
            @RequestParam float eclPMax,
            @RequestParam float eglDMax,
            @RequestParam float eglPMax,
            @RequestParam float comDMax,
            @RequestParam float comPMax,
            @RequestParam float polDMax,
            @RequestParam float polPMax,
            @RequestParam float rtbDMax,
            @RequestParam float rtbPMax) {
        Ville n = new Ville();
        n.setVilleNom(villeNom);
        n.setVilleLong(villeLong);
        n.setVilleLarg(villeLarg);
        n.setVilleValeurImmoMin(villeValeurImmoMin);
        n.setVilleValeurImmoMax(villeValeurImmoMax);
        n.setRivDMax(rivDMax);
        n.setRivPMax(rivPMax);
        n.setEclDMax(eclDMax);
        n.setEclPMax(eclPMax);
        n.setEglDMax(eglDMax);
        n.setEglPMax(eglPMax);
        n.setComDMax(comDMax);
        n.setComPMax(comPMax);
        n.setPolDMax(polDMax);
        n.setPolPMax(polPMax);
        n.setRivDMax(rtbDMax);
        n.setRivPMax(rtbPMax);
        villeRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Ville> getAllUsers() {
        return villeRepository.findAll();

    }
}
