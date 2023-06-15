package org.example.exercice6;



public class Pendu {

        private String mot[] = new String[5];
        private String masque[] = new String[5];
        private static int pendu = 10;

        public Pendu(){
            mot[0] = String.valueOf('p');
            mot[1] = String.valueOf('e');
            mot[2] = String.valueOf('n');
            mot[3] = String.valueOf('d');
            mot[4] = String.valueOf('u');
            for(int i = 0; i < mot.length; i++){
                masque[i] = String.valueOf('*');
            }
        }

        public boolean lettrePresenteDansMot(String lettre){
            boolean value = false;
            for(int i = 0; i < mot.length; i++){
                if(mot[i] == lettre){
                    value = true;
                    break;
                }
            }
            return value;
        }
        public boolean estPendu(){
            boolean value = false;
            if(pendu <= 0){
                value = true;
            }
            return value;
        }

        public void montrerMot(){
            System.out.print("Le mot est: ");
            for(int i = 0; i < masque.length; i++){
                System.out.print(masque[i]);
            }
        }

        public void remplacerChar(String lettre){
            for(int i = 0; i < mot.length; i++){
                if(mot[i] == lettre){
                    masque[i] = lettre;
                }
            }
        }
    public boolean gagne(){
        int count = 0;
        boolean value = false;
        for(int i = 0; i < mot.length; i++){
                value = true;
                break;
        }
        return value;
    }

    }

