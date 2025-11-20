package com.polytech.tp;

public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    
    public Cours(String matiere, String enseignant, String salle, String date, 
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    // Constructeur utilisé par le Builder
    public Cours(CoursBuilder builder) {
        this.matiere = builder.getMatiere();
        this.enseignant = builder.getEnseignant();
        this.salle = builder.getSalle();
        this.date = builder.getDate();
        this.heureDebut = builder.getHeureDebut();
        this.estOptionnel = builder.isEstOptionnel();
        this.niveau = builder.getNiveau();
        this.necessiteProjecteur = builder.isNecessiteProjecteur();
    }


    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5; 
    }
    
    
    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }
}