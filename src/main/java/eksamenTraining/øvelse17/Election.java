package eksamenTraining.øvelse17;

import java.util.ArrayList;

public class Election {
    private ArrayList<Candidate> candidates = new ArrayList<>();


    public int getTotalVotes() {
        int totalVotes = 0;
        for(Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }

        return totalVotes;
    }


    public ArrayList getCandidatesFromParty(String party) {
        ArrayList<Candidate> candidateArrayList = new ArrayList<>();

        for(Candidate candidate : candidates) {
            if(candidate.getParty().equals(party)){
                candidateArrayList.add(candidate);
            }
        }
        return candidateArrayList;
    }



    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Mathias Thomsen", "Venstre", 20);
        Candidate candidate2 = new Candidate("Hans", "Social Demo", 12);
        Candidate candidate3 = new Candidate("Kasper Thomsen", "DF", 40);
        Candidate candidate4 = new Candidate("Søren", "Venstre", 10);

        Election election = new Election();

        election.candidates.add(candidate1);
        election.candidates.add(candidate2);
        election.candidates.add(candidate3);
        election.candidates.add(candidate4);

        System.out.println(election.candidates);
        System.out.println(election.getTotalVotes());

        System.out.println(election.getCandidatesFromParty("Venstre"));


    }
}
