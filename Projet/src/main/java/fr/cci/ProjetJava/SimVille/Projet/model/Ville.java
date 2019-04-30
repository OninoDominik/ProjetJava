package fr.cci.ProjetJava.SimVille.Projet.model;
import javax.persistence.*;

@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer villeId;
    private String villeNom;
    private Integer villeLong;
    private Integer villeLarg;
    private float villeValeurImmoMin;
    private float villeValeurImmoMax;
    private float rivDMax;
    private float rivPMax;
    private float forDMax;
    private float forPMax ;
    private float eclDMax;
    private float eclPMax;
    private float eglDMax;
    private float eglPMax;
    private float comDMax;
    private float comPMax;
    private float polDMax;
    private float polPMax;
    private float rtbDMax;
    private float rtbPMax;

    public String getVilleNom() {
        return villeNom;
    }

    public void setVilleNom(String villeNom) {
        this.villeNom = villeNom;
    }

    public Integer getVilleLong() {
        return villeLong;
    }

    public void setVilleLong(Integer villeLong) {
        this.villeLong = villeLong;
    }

    public Integer getVilleLarg() {
        return villeLarg;
    }

    public void setVilleLarg(Integer villeLarg) {
        this.villeLarg = villeLarg;
    }

    public float getVilleValeurImmoMin() {
        return villeValeurImmoMin;
    }

    public void setVilleValeurImmoMin(float villeValeurImmoMin) {
        this.villeValeurImmoMin = villeValeurImmoMin;
    }

    public float getVilleValeurImmoMax() {
        return villeValeurImmoMax;
    }

    public void setVilleValeurImmoMax(float villeValeurImmoMax) {
        this.villeValeurImmoMax = villeValeurImmoMax;
    }

    public float getRivDMax() {
        return rivDMax;
    }

    public void setRivDMax(float rivDMax) {
        this.rivDMax = rivDMax;
    }

    public float getRivPMax() {
        return rivPMax;
    }

    public void setRivPMax(float rivPMax) {
        this.rivPMax = rivPMax;
    }

    public float getForDMax() {
        return forDMax;
    }

    public void setForDMax(float forDMax) {
        this.forDMax = forDMax;
    }

    public float getForPMax() {
        return forPMax;
    }

    public void setForPMax(float forPMax) {
        this.forPMax = forPMax;
    }

    public float getEclDMax() {
        return eclDMax;
    }

    public void setEclDMax(float eclDMax) {
        this.eclDMax = eclDMax;
    }

    public float getEclPMax() {
        return eclPMax;
    }

    public void setEclPMax(float eclPMax) {
        this.eclPMax = eclPMax;
    }

    public float getEglDMax() {
        return eglDMax;
    }

    public void setEglDMax(float eglDMax) {
        this.eglDMax = eglDMax;
    }

    public float getEglPMax() {
        return eglPMax;
    }

    public void setEglPMax(float eglPMax) {
        this.eglPMax = eglPMax;
    }

    public float getComDMax() {
        return comDMax;
    }

    public void setComDMax(float comDMax) {
        this.comDMax = comDMax;
    }

    public float getComPMax() {
        return comPMax;
    }

    public void setComPMax(float comPMax) {
        this.comPMax = comPMax;
    }

    public float getPolDMax() {
        return polDMax;
    }

    public void setPolDMax(float polDMax) {
        this.polDMax = polDMax;
    }

    public float getPolPMax() {
        return polPMax;
    }

    public void setPolPMax(float polPMax) {
        this.polPMax = polPMax;
    }

    public float getRtbDMax() {
        return rtbDMax;
    }

    public void setRtbDMax(float rtbDMax) {
        this.rtbDMax = rtbDMax;
    }

    public float getRtbPMax() {
        return rtbPMax;
    }

    public void setRtbPMax(float rtbPMax) {
        this.rtbPMax = rtbPMax;
    }

    public Integer getVilleId() {
        return villeId;
    }

    public void setVilleId(Integer villeId) {
        this.villeId = villeId;
    }
}
